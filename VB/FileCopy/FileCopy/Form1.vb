Public Class Form1
    Dim filepath As String
    Dim fileroot As String = ""
    Dim filename As String
    Dim filecount As Short
    Dim filesubstring As String = ".jpg"
    Dim fileprefix As String = "f"
    Dim filepathlength As Integer
    Dim i As Integer = 0

    Private Sub Button1_Click(sender As System.Object, e As System.EventArgs) Handles btnFile.Click
        OpenFileDialog1.ShowDialog()
        filepath = OpenFileDialog1.FileName
        'MessageBox.Show(filepath)

        Dim filepatharray As Array = filepath.Split("\")
        filepathlength = filepatharray.Length
        'MessageBox.Show(filepathlength)

        i = 0
        While (i < (filepatharray.Length - 1))
            fileroot = fileroot & filepatharray(i) & "\"
            i = i + 1
        End While
        'MessageBox.Show(fileroot)

        While filecount < 100
            filename = fileprefix & filecount.ToString("D4") & filesubstring
            'MessageBox.Show(filename)
            filecount = filecount + 1

            My.Computer.FileSystem.CopyFile(filepath, fileroot & filename, True)

        End While
    End Sub
End Class
