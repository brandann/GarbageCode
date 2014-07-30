Public Class Form1

    Private Sub Form1_Load(sender As System.Object, e As System.EventArgs) Handles MyBase.Load
        Try
            Process.Start("C:\\Users\\brandan.NSSM\\Desktop\\Brandan Job File\\Standards\\Brandans Standards.dwg")
            Process.Start("P:\\CADD\\Drafting\\PE Stuff\\4-17-2012-STANDARDS.dwg")
            Me.Close()
        Catch ex As Exception
            MessageBox.Show("Error")
        End Try
    End Sub
End Class
