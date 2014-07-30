Public Class Form1

    Private Sub boxManufacture_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles boxManufacture.SelectedIndexChanged
        If boxManufacture.SelectedItem = "None" Then
            lblConditionA.Visible = True
            boxConditionA.Visible = True
        ElseIf boxManufacture.SelectedItem <> "" Then
            lblManufacture.Visible = True
            boxManufacture.Visible = True
        Else

        End If
        Try
            Dim manu As String = boxManufacture.SelectedItem
            For Each i As String In My.Resources.Criteria
                i.Split(",")
                If i(0) = manu Then
                    boxProfile.Items.Add(i(1))
                End If

            Next
        Catch ex As Exception

        End Try
    End Sub

    Private Sub boxProfile_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles boxProfile.SelectedIndexChanged
        If boxManufacture.SelectedItem <> "" Then
            lblWall.Visible = True
            boxWall.Visible = True

        End If
    End Sub

    Private Sub boxWall_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles boxWall.SelectedIndexChanged
        If boxManufacture.SelectedItem <> "" Then
            lblConditionA.Visible = True
            boxConditionA.Visible = True

        End If
    End Sub

    Private Sub boxConditionA_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles boxConditionA.SelectedIndexChanged
        If boxManufacture.SelectedItem <> "" Then
            lblCondtionB.Visible = True
            boxConditionB.Visible = True

        End If
    End Sub

    Private Sub boxConditionB_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles boxConditionB.SelectedIndexChanged
        If boxManufacture.SelectedItem <> "" Then
            btnStart.Visible = True
        End If
    End Sub

    Private Sub btnStart_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnStart.Click
        LstResults.Visible = True
    End Sub
End Class
