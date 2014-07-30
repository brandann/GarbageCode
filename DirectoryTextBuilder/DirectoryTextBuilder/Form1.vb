Public Class Form1

    Private Sub Form1_Load(sender As System.Object, e As System.EventArgs) Handles MyBase.Load
        Dim openInt As Integer = 0
        Dim closedInt As Integer = 0

        Dim openfile As New System.IO.StreamWriter("P:\Northshore Time Sheet\CurrentJobs.txt")
        Dim jobs As String = ""
        For Each jobs In My.Computer.FileSystem.GetDirectories("P:\Job File")
            openfile.WriteLine(jobs)
        Next
        openfile.Close()


        Dim closedfile As New System.IO.StreamWriter("P:\Northshore Time Sheet\ClosedJobs.txt")
        For Each file06 In My.Computer.FileSystem.GetDirectories("P:\Job File\1-Closed Jobs\2006 Closed Jobs")
            closedfile.WriteLine(file06)
        Next
        For Each file07 In My.Computer.FileSystem.GetDirectories("P:\Job File\1-Closed Jobs\2007 Closed Jobs")
            closedfile.WriteLine(file07)
        Next
        For Each file08 In My.Computer.FileSystem.GetDirectories("P:\Job File\1-Closed Jobs\2008 Closed Jobs")
            closedfile.WriteLine(file08)
        Next
        For Each file09 In My.Computer.FileSystem.GetDirectories("P:\Job File\1-Closed Jobs\2009 Closed Jobs")
            closedfile.WriteLine(file09)
        Next
        For Each file10 In My.Computer.FileSystem.GetDirectories("P:\Job File\1-Closed Jobs\2010 Closed Jobs")
            closedfile.WriteLine(file10)
        Next
        For Each file11 In My.Computer.FileSystem.GetDirectories("P:\Job File\1-Closed Jobs\2011 Closed Jobs")
            closedfile.WriteLine(file11)
        Next
        For Each file12 In My.Computer.FileSystem.GetDirectories("P:\Job File\1-Closed Jobs\2012 Closed Jobs")
            closedfile.WriteLine(file12)
        Next
        For Each file13 In My.Computer.FileSystem.GetDirectories("P:\Job File\1-Closed Jobs\2013 Closed Jobs")
            closedfile.WriteLine(file13)
        Next
        closedfile.Close()

        Me.Close()
    End Sub
End Class
