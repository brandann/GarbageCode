Public Class Form1

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub

    Private Sub exitbutton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles exitbutton.Click
        Close()
    End Sub

    Private Sub resetbutton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles resetbutton.Click
        ftifeet.Text = "Feet"
        ftiinch.Text = "Inches"
        itfinch.Text = "Inches"
    End Sub

    Private Sub calc_fti_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles calc_fti.Click
        itfinch.Text = (ftifeet.Text * 12) + ftiinch.Text
    End Sub

    Private Sub calc_itf_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles calc_itf.Click
        ftifeet.Text = Int(itfinch.Text / 12)
        ftiinch.Text = itfinch.Text - (ftifeet.Text * 12)
    End Sub

    Private Sub fti_i_inch_MouseClick(ByVal sender As System.Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles ftiinch.MouseClick
        ftiinch.Text = ""
    End Sub

    Private Sub ftiinch_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ftiinch.TextChanged

    End Sub

    Private Sub ftifeet_MouseClick(ByVal sender As System.Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles ftifeet.MouseClick
        ftifeet.Text = ""
    End Sub

    Private Sub itfinch_MouseClick(ByVal sender As System.Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles itfinch.MouseClick
        itfinch.Text = ""
    End Sub

    Private Sub btnhelp_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnhelp.Click
        MsgBox("Welcome to the architectural unit converter, here you can turn feet and icnhes to inches, or inches to feet and inches! Please note that at this time we can only support decimal inches. Fractional conversion will be on its way if their is a demand for it. Please send all question about the program, sugestions for improving the program, bugs you may have found, or even just ideas for new and exciting programs that have nothing to do with this one to: Brandan@northshoresheetmetal.com Thank you")
    End Sub
End Class
