Imports System.IO
Imports System.Drawing.Imaging
Imports System.Web



Public Class Form1
    Inherits System.Windows.Forms.Form

    Dim dragInitiator As String
    Dim moveCursor, nodropCursor, copyCursor As Cursor

    Dim fs As FileStream
    Dim srcbmp As Bitmap
    Dim totalpages As Integer
    Dim currentpage As Integer = 0

    Private Sub Button_Preveous_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button_Preveous.Click
        If currentpage > 0 Then
            currentpage -= 1
            srcbmp.SelectActiveFrame(FrameDimension.Page, currentpage)
            picBox.Refresh()

        End If
    End Sub

    Private Sub Button_Next_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button_Next.Click
        If currentpage < totalpages Then
            currentpage += 1
            srcbmp.SelectActiveFrame(FrameDimension.Page, currentpage)
            picBox.Refresh()
        End If

    End Sub

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        OpenFileDialog1.ShowDialog()

        fs = File.Open(OpenFileDialog1.FileName, FileMode.Open, FileAccess.Read)
        srcbmp = CType(Bitmap.FromStream(fs), Bitmap)
        totalpages = CInt(srcbmp.GetFrameCount(FrameDimension.Page) - 1)
        srcbmp.SelectActiveFrame(FrameDimension.Page, currentpage)
        picBox.Image = srcbmp
        'AutosizeImage(OpenFileDialog1.FileName, picBox)
        Dim pw As Integer = picBox.Width
        Dim ph As Integer = picBox.Height
        Dim sc As Integer = srcbmp.Width / pw
        'srcbmp.Width = 20




    End Sub

    Private Sub Form1_FormClosing(ByVal sender As System.Object, ByVal e As System.Windows.Forms.FormClosingEventArgs) Handles MyBase.FormClosing
        fs.Close()

    End Sub
    Private Sub picbox_MouseWheel(ByVal sender As Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles picBox.MouseWheel
        'If e.Button = Windows.Forms.MouseButtons.scrol Then

        'End If

    End Sub
    Private Sub PictureBox1_MouseClick(ByVal sender As System.Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles picBox.MouseClick
        If e.Button = Windows.Forms.MouseButtons.Right Then
            picBox.Width += 250%
            picBox.Height += 250%
        End If



        '
        'If MouseButtons.Middle Then
        'If sender.Image Is Nothing Then Exit Sub ' nothing to drag
        'DrawPictureCursor(sender)
        '  Dim result As DragDropEffects
        '  dragInitiator = sender.name 'keep track of the source of the drag
        'so that we can disallow drops onto self
        '  result = sender.DoDragDrop(sender.Image, DragDropEffects.All)
        '  If result = DragDropEffects.Move Then
        'sender.image = Nothing ' if you dropped on self, self would be cleared immediately afterwards.
        '  End If
        '  sender.allowdrop = True
        '
        ' End If
        '

    End Sub

    Public Sub AutosizeImage(ByVal ImagePath As String, ByVal picBox As PictureBox, Optional ByVal pSizeMode As PictureBoxSizeMode = PictureBoxSizeMode.CenterImage)
        Try
            picBox.Image = Nothing
            picBox.SizeMode = pSizeMode
            If System.IO.File.Exists(ImagePath) Then
                Dim imgOrg As Bitmap
                Dim imgShow As Bitmap
                Dim g As Graphics
                Dim divideBy, divideByH, divideByW As Double
                imgOrg = DirectCast(Bitmap.FromFile(ImagePath), Bitmap)

                divideByW = imgOrg.Width / picBox.Width
                divideByH = imgOrg.Height / picBox.Height
                If divideByW > 1 Or divideByH > 1 Then
                    If divideByW > divideByH Then
                        divideBy = divideByW
                    Else
                        divideBy = divideByH
                    End If

                    imgShow = New Bitmap(CInt(CDbl(imgOrg.Width) / divideBy), CInt(CDbl(imgOrg.Height) / divideBy))
                    imgShow.SetResolution(imgOrg.HorizontalResolution, imgOrg.VerticalResolution)
                    g = Graphics.FromImage(imgShow)
                    g.InterpolationMode = Drawing2D.InterpolationMode.HighQualityBicubic
                    g.DrawImage(imgOrg, New Rectangle(0, 0, CInt(CDbl(imgOrg.Width) / divideBy), CInt(CDbl(imgOrg.Height) / divideBy)), 0, 0, imgOrg.Width, imgOrg.Height, GraphicsUnit.Pixel)
                    g.Dispose()
                Else
                    imgShow = New Bitmap(imgOrg.Width, imgOrg.Height)
                    imgShow.SetResolution(imgOrg.HorizontalResolution, imgOrg.VerticalResolution)
                    g = Graphics.FromImage(imgShow)
                    g.InterpolationMode = Drawing2D.InterpolationMode.HighQualityBicubic
                    g.DrawImage(imgOrg, New Rectangle(0, 0, imgOrg.Width, imgOrg.Height), 0, 0, imgOrg.Width, imgOrg.Height, GraphicsUnit.Pixel)
                    g.Dispose()
                End If
                imgOrg.Dispose()

                picBox.Image = imgShow
            Else
                picBox.Image = Nothing
            End If


        Catch ex As Exception
            MsgBox(ex.ToString)
        End Try

    End Sub
    Public Sub centerpicture()
        picBox.Top = (Me.ClientSize.Height / 2) - (picBox.Height / 2)
        picBox.Left = (Me.ClientSize.Width / 2) - (picBox.Width / 2)

    End Sub
    Private Sub picBox_Resize(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles picBox.Resize
        'centerpicture()

    End Sub

    Private Sub Form1_Resize(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Resize
        centerpicture()
        picBox.Width = SplitContainer1.Panel1.Width
        picBox.Height = SplitContainer1.Panel1.Height
    End Sub
    Private ocontroloffsetpoint As Point
    Private Sub picBox_MouseMove(ByVal sender As System.Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles picBox.MouseMove
        ' Dim sx As Integer = RectangleToClient(New Rectangle(Windows.Forms.Cursor.Position.X, Windows.Forms.Cursor.Position.Y, 1, 1)).Left - ocontroloffsetpoint.X
        'Dim sy As Integer = RectangleToClient(New Rectangle(Windows.Forms.Cursor.Position.X, Windows.Forms.Cursor.Position.Y, 1, 1)).Top - ocontroloffsetpoint.Y
        '
        'If e.Button = Windows.Forms.MouseButtons.Middle Then
        'sender.location = New Point(sx, sy)
        ' picBox.Left = sx
        ' picBox.Top = sy
        ' End If

        If e.Button = Windows.Forms.MouseButtons.Middle Then
            Dim controlposition As Point = Me.PointToClient(MousePosition)
            controlposition.Offset(cordinates.X, cordinates.Y)
            sender.location = controlposition
            If picBox.Top > 30 Then
                picBox.Top = 30

            End If
            If picBox.Left > 30 Then
                picBox.Left = 30
            End If
            
        End If
    End Sub
    Dim cordinates As Point
    Private Sub picBox_MouseDown(ByVal sender As System.Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles picBox.MouseDown
        cordinates = New Point(-e.X, -e.Y)

    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        centerpicture()
        picBox.Width = SplitContainer1.Panel1.Width
        picBox.Height = SplitContainer1.Panel1.Height
    End Sub

    Private Sub Form1_MaximumSizeChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.MaximumSizeChanged
        Button2.PerformClick()
        Button2.PerformClick()

    End Sub

    Private Sub Form1_SizeChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.SizeChanged
        Button2.PerformClick()
        Button2.PerformClick()
    End Sub

    Private Sub Button_Ok_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button_Ok.Click
        Dim p As Integer = TextBox1.Text - 1
        currentpage = p
        srcbmp.SelectActiveFrame(FrameDimension.Page, currentpage)
        picBox.Refresh()
    End Sub
End Class

'PictureBox1.Image = System.Drawing.Image.FromFile(Label_directory.Text & "\" & ListBox_Tiff.SelectedItem)
'WebBrowser1.Url.AbsolutePath = Label_directory.Text & "\" & ListBox_Tiff.SelectedItem