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
        Me.boxManufacture = New System.Windows.Forms.ComboBox()
        Me.lblManufacture = New System.Windows.Forms.Label()
        Me.lblProfile = New System.Windows.Forms.Label()
        Me.boxProfile = New System.Windows.Forms.ComboBox()
        Me.lblWall = New System.Windows.Forms.Label()
        Me.boxWall = New System.Windows.Forms.ComboBox()
        Me.lblConditionA = New System.Windows.Forms.Label()
        Me.boxConditionA = New System.Windows.Forms.ComboBox()
        Me.lblCondtionB = New System.Windows.Forms.Label()
        Me.boxConditionB = New System.Windows.Forms.ComboBox()
        Me.LstResults = New System.Windows.Forms.ListBox()
        Me.btnStart = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'boxManufacture
        '
        Me.boxManufacture.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.boxManufacture.FormattingEnabled = True
        Me.boxManufacture.Location = New System.Drawing.Point(13, 37)
        Me.boxManufacture.Name = "boxManufacture"
        Me.boxManufacture.Size = New System.Drawing.Size(259, 21)
        Me.boxManufacture.TabIndex = 0
        '
        'lblManufacture
        '
        Me.lblManufacture.AutoSize = True
        Me.lblManufacture.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblManufacture.Location = New System.Drawing.Point(13, 10)
        Me.lblManufacture.Name = "lblManufacture"
        Me.lblManufacture.Size = New System.Drawing.Size(139, 17)
        Me.lblManufacture.TabIndex = 1
        Me.lblManufacture.Text = "Panel Manufacture..."
        '
        'lblProfile
        '
        Me.lblProfile.AutoSize = True
        Me.lblProfile.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblProfile.Location = New System.Drawing.Point(13, 68)
        Me.lblProfile.Name = "lblProfile"
        Me.lblProfile.Size = New System.Drawing.Size(100, 17)
        Me.lblProfile.TabIndex = 3
        Me.lblProfile.Text = "Panel Profile..."
        Me.lblProfile.Visible = False
        '
        'boxProfile
        '
        Me.boxProfile.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.boxProfile.FormattingEnabled = True
        Me.boxProfile.Location = New System.Drawing.Point(13, 95)
        Me.boxProfile.Name = "boxProfile"
        Me.boxProfile.Size = New System.Drawing.Size(259, 21)
        Me.boxProfile.TabIndex = 2
        Me.boxProfile.Visible = False
        '
        'lblWall
        '
        Me.lblWall.AutoSize = True
        Me.lblWall.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblWall.Location = New System.Drawing.Point(13, 126)
        Me.lblWall.Name = "lblWall"
        Me.lblWall.Size = New System.Drawing.Size(104, 17)
        Me.lblWall.TabIndex = 5
        Me.lblWall.Text = "Wall Build Up..."
        Me.lblWall.Visible = False
        '
        'boxWall
        '
        Me.boxWall.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.boxWall.FormattingEnabled = True
        Me.boxWall.Location = New System.Drawing.Point(13, 153)
        Me.boxWall.Name = "boxWall"
        Me.boxWall.Size = New System.Drawing.Size(259, 21)
        Me.boxWall.TabIndex = 4
        Me.boxWall.Visible = False
        '
        'lblConditionA
        '
        Me.lblConditionA.AutoSize = True
        Me.lblConditionA.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblConditionA.Location = New System.Drawing.Point(13, 184)
        Me.lblConditionA.Name = "lblConditionA"
        Me.lblConditionA.Size = New System.Drawing.Size(92, 17)
        Me.lblConditionA.TabIndex = 7
        Me.lblConditionA.Text = "Condition A..."
        Me.lblConditionA.Visible = False
        '
        'boxConditionA
        '
        Me.boxConditionA.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.boxConditionA.FormattingEnabled = True
        Me.boxConditionA.Location = New System.Drawing.Point(13, 211)
        Me.boxConditionA.Name = "boxConditionA"
        Me.boxConditionA.Size = New System.Drawing.Size(259, 21)
        Me.boxConditionA.TabIndex = 6
        Me.boxConditionA.Visible = False
        '
        'lblCondtionB
        '
        Me.lblCondtionB.AutoSize = True
        Me.lblCondtionB.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblCondtionB.Location = New System.Drawing.Point(13, 242)
        Me.lblCondtionB.Name = "lblCondtionB"
        Me.lblCondtionB.Size = New System.Drawing.Size(92, 17)
        Me.lblCondtionB.TabIndex = 9
        Me.lblCondtionB.Text = "Condition B..."
        Me.lblCondtionB.Visible = False
        '
        'boxConditionB
        '
        Me.boxConditionB.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.boxConditionB.FormattingEnabled = True
        Me.boxConditionB.Location = New System.Drawing.Point(13, 269)
        Me.boxConditionB.Name = "boxConditionB"
        Me.boxConditionB.Size = New System.Drawing.Size(259, 21)
        Me.boxConditionB.TabIndex = 8
        Me.boxConditionB.Visible = False
        '
        'LstResults
        '
        Me.LstResults.FormattingEnabled = True
        Me.LstResults.Location = New System.Drawing.Point(13, 300)
        Me.LstResults.Name = "LstResults"
        Me.LstResults.Size = New System.Drawing.Size(259, 95)
        Me.LstResults.TabIndex = 10
        Me.LstResults.Visible = False
        '
        'btnStart
        '
        Me.btnStart.Location = New System.Drawing.Point(197, 405)
        Me.btnStart.Name = "btnStart"
        Me.btnStart.Size = New System.Drawing.Size(75, 23)
        Me.btnStart.TabIndex = 11
        Me.btnStart.Text = "Start"
        Me.btnStart.UseVisualStyleBackColor = True
        Me.btnStart.Visible = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(284, 439)
        Me.Controls.Add(Me.btnStart)
        Me.Controls.Add(Me.LstResults)
        Me.Controls.Add(Me.lblCondtionB)
        Me.Controls.Add(Me.boxConditionB)
        Me.Controls.Add(Me.lblConditionA)
        Me.Controls.Add(Me.boxConditionA)
        Me.Controls.Add(Me.lblWall)
        Me.Controls.Add(Me.boxWall)
        Me.Controls.Add(Me.lblProfile)
        Me.Controls.Add(Me.boxProfile)
        Me.Controls.Add(Me.lblManufacture)
        Me.Controls.Add(Me.boxManufacture)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents boxManufacture As System.Windows.Forms.ComboBox
    Friend WithEvents lblManufacture As System.Windows.Forms.Label
    Friend WithEvents lblProfile As System.Windows.Forms.Label
    Friend WithEvents boxProfile As System.Windows.Forms.ComboBox
    Friend WithEvents lblWall As System.Windows.Forms.Label
    Friend WithEvents boxWall As System.Windows.Forms.ComboBox
    Friend WithEvents lblConditionA As System.Windows.Forms.Label
    Friend WithEvents boxConditionA As System.Windows.Forms.ComboBox
    Friend WithEvents lblCondtionB As System.Windows.Forms.Label
    Friend WithEvents boxConditionB As System.Windows.Forms.ComboBox
    Friend WithEvents LstResults As System.Windows.Forms.ListBox
    Friend WithEvents btnStart As System.Windows.Forms.Button

End Class
