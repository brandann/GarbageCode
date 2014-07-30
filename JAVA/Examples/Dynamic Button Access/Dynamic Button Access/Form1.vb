Public Class Form1
    Dim x As Integer = 0
    Dim y As Integer = 0
    Dim z As Integer = 0
    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim mybutton As New Button
        x += 10
        y += 50
        mybutton.Left = x
        mybutton.Top = y
        mybutton.Text = String.Empty
        mybutton.Height = 100
        mybutton.Width = 100
        mybutton.BackColor = Color.Red


        z += 1

        ' Use the addhandler and pass it first the event we want it to handle (here we use the click event)
        ' Then we give it the address of our custom function called PrintMessage.
        ' AddressOf is used to get the address of our function... think of it as pointing to the function.

        AddHandler mybutton.Click, AddressOf PrintMessage

        ' Now we add the button to the form.

        Me.Controls.Add(mybutton)
    End Sub

    Private Sub PrintMessage(ByVal sender As System.Object, ByVal e As System.EventArgs)
        If TypeOf sender Is Button Then
            MsgBox(CType(sender, Button).Name)
        End If
    End Sub
End Class
