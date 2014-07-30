Imports System.Threading

Public Class Form1

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Label1.Text = (My.Settings.intMoney + 1).ToString
        My.Settings.intMoney = CInt(Label1.Text)

        Dim x1 As Integer = Button1.Location.X
        Dim y1 As Integer = 812
        Dim x2 As Integer = 0
        Dim y2 As Double
        Dim xstart As Integer = Button1.Location.X
        Dim ystart As Integer = Button1.Location.Y
        Dim a As Double = 0.16 * -1


        For i = 0 To 50
            y2 = (a * (((x2 - 25) ^ 2) - 625))
            y1 = ystart - y2
            'MessageBox.Show(x2 & "Times " & x1 & "," & y1 & "- " & y2)
            Button1.Location = New Point(x1, y1)
            Thread.Sleep(15)
            x1 += 1
            x2 += 1
        Next

        x2 = 50
        For i = 0 To 50
            y2 = (a * (((x2 - 25) ^ 2) - 625))
            y1 = ystart - y2
            'MessageBox.Show(x2 & "Times " & x1 & "," & y1 & "- " & y2)
            Button1.Location = New Point(x1, y1)
            Thread.Sleep(15)
            x1 -= 1
            x2 -= 1
        Next

        For i = 0 To 50
            y2 = (a * (((x2 - 25) ^ 2) - 625))
            y1 = ystart - y2
            'MessageBox.Show(x2 & "Times " & x1 & "," & y1 & "- " & y2)
            Button1.Location = New Point(xstart, y1)
            Thread.Sleep(15)

            x2 += 1
        Next


    End Sub

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Label1.Text = My.Settings.intMoney
    End Sub

    Private Sub Form1_FormClosing(ByVal sender As System.Object, ByVal e As System.Windows.Forms.FormClosingEventArgs) Handles MyBase.FormClosing
        My.Settings.intMoney = CInt(Label1.Text)
        My.Settings.Save()
    End Sub
End Class
