Public Class btnBrandan
    Dim strUserName As String
    Private Sub Button4_Click(sender As System.Object, e As System.EventArgs) Handles Button4.Click
        setUser("Brandan")
    End Sub

    Private Sub btnCorey_Click(sender As System.Object, e As System.EventArgs) Handles btnCorey.Click
        setUser("Corey")
    End Sub

    Private Sub btnTristen_Click(sender As System.Object, e As System.EventArgs) Handles btnTristen.Click
        setUser("Tristen")
    End Sub

    Public Sub setUser(Name)
        lblUser.Text = Name
        strUserName = Name
    End Sub


End Class
