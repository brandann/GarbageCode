<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.ftifeet = New System.Windows.Forms.TextBox()
        Me.ftiinch = New System.Windows.Forms.TextBox()
        Me.calc_fti = New System.Windows.Forms.Button()
        Me.calc_itf = New System.Windows.Forms.Button()
        Me.itfinch = New System.Windows.Forms.TextBox()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.resetbutton = New System.Windows.Forms.Button()
        Me.exitbutton = New System.Windows.Forms.Button()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.btnhelp = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'ftifeet
        '
        Me.ftifeet.Font = New System.Drawing.Font("Arial", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.ftifeet.Location = New System.Drawing.Point(12, 52)
        Me.ftifeet.Name = "ftifeet"
        Me.ftifeet.Size = New System.Drawing.Size(100, 20)
        Me.ftifeet.TabIndex = 0
        Me.ftifeet.Text = "Feet"
        Me.ftifeet.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'ftiinch
        '
        Me.ftiinch.Font = New System.Drawing.Font("Arial", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.ftiinch.Location = New System.Drawing.Point(12, 85)
        Me.ftiinch.Name = "ftiinch"
        Me.ftiinch.Size = New System.Drawing.Size(100, 20)
        Me.ftiinch.TabIndex = 1
        Me.ftiinch.Text = "Inches"
        Me.ftiinch.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'calc_fti
        '
        Me.calc_fti.Font = New System.Drawing.Font("Arial", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.calc_fti.Location = New System.Drawing.Point(118, 49)
        Me.calc_fti.Name = "calc_fti"
        Me.calc_fti.Size = New System.Drawing.Size(150, 27)
        Me.calc_fti.TabIndex = 6
        Me.calc_fti.Text = "Feet to Inch >"
        Me.calc_fti.UseVisualStyleBackColor = True
        '
        'calc_itf
        '
        Me.calc_itf.Font = New System.Drawing.Font("Arial", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.calc_itf.Location = New System.Drawing.Point(118, 82)
        Me.calc_itf.Name = "calc_itf"
        Me.calc_itf.Size = New System.Drawing.Size(150, 27)
        Me.calc_itf.TabIndex = 7
        Me.calc_itf.Text = "< Inch to Feet"
        Me.calc_itf.UseVisualStyleBackColor = True
        '
        'itfinch
        '
        Me.itfinch.Font = New System.Drawing.Font("Arial", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.itfinch.Location = New System.Drawing.Point(274, 54)
        Me.itfinch.Name = "itfinch"
        Me.itfinch.Size = New System.Drawing.Size(100, 20)
        Me.itfinch.TabIndex = 11
        Me.itfinch.Text = "Inches"
        Me.itfinch.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Font = New System.Drawing.Font("Arial", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label7.Location = New System.Drawing.Point(123, 10)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(141, 14)
        Me.Label7.TabIndex = 14
        Me.Label7.Text = "Architectural Unit Converter"
        Me.Label7.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'resetbutton
        '
        Me.resetbutton.Font = New System.Drawing.Font("Arial", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.resetbutton.Location = New System.Drawing.Point(12, 151)
        Me.resetbutton.Name = "resetbutton"
        Me.resetbutton.Size = New System.Drawing.Size(100, 29)
        Me.resetbutton.TabIndex = 16
        Me.resetbutton.Text = "Reset"
        Me.resetbutton.UseVisualStyleBackColor = True
        '
        'exitbutton
        '
        Me.exitbutton.BackColor = System.Drawing.SystemColors.Control
        Me.exitbutton.Font = New System.Drawing.Font("Arial", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.exitbutton.Location = New System.Drawing.Point(274, 151)
        Me.exitbutton.Name = "exitbutton"
        Me.exitbutton.Size = New System.Drawing.Size(100, 29)
        Me.exitbutton.TabIndex = 17
        Me.exitbutton.Text = "Exit"
        Me.exitbutton.UseVisualStyleBackColor = False
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Font = New System.Drawing.Font("Arial", 7.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label9.Location = New System.Drawing.Point(12, 114)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(310, 26)
        Me.Label9.TabIndex = 18
        Me.Label9.Text = "By Brandan Haertel 2012 {Brandan@Northshoresheetmetal.com}" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "E-Mail for any bugs, " & _
            "sugestions, comments, ideas, or praise."
        '
        'btnhelp
        '
        Me.btnhelp.Location = New System.Drawing.Point(338, 13)
        Me.btnhelp.Name = "btnhelp"
        Me.btnhelp.Size = New System.Drawing.Size(36, 23)
        Me.btnhelp.TabIndex = 19
        Me.btnhelp.Text = "Help"
        Me.btnhelp.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(386, 192)
        Me.Controls.Add(Me.btnhelp)
        Me.Controls.Add(Me.Label9)
        Me.Controls.Add(Me.exitbutton)
        Me.Controls.Add(Me.resetbutton)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.itfinch)
        Me.Controls.Add(Me.calc_itf)
        Me.Controls.Add(Me.calc_fti)
        Me.Controls.Add(Me.ftiinch)
        Me.Controls.Add(Me.ftifeet)
        Me.Font = New System.Drawing.Font("Arial Narrow", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Name = "Form1"
        Me.Opacity = 0.97R
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Architectural Unit Converter"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents ftifeet As System.Windows.Forms.TextBox
    Friend WithEvents ftiinch As System.Windows.Forms.TextBox
    Friend WithEvents calc_fti As System.Windows.Forms.Button
    Friend WithEvents calc_itf As System.Windows.Forms.Button
    Friend WithEvents itfinch As System.Windows.Forms.TextBox
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents resetbutton As System.Windows.Forms.Button
    Friend WithEvents exitbutton As System.Windows.Forms.Button
    Friend WithEvents Label9 As System.Windows.Forms.Label
    Friend WithEvents btnhelp As System.Windows.Forms.Button

End Class
