<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class ContarCaracteres
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
        Me.TextTexto = New System.Windows.Forms.TextBox
        Me.Label1 = New System.Windows.Forms.Label
        Me.Button1 = New System.Windows.Forms.Button
        Me.TextCaracteres = New System.Windows.Forms.TextBox
        Me.SuspendLayout()
        '
        'TextTexto
        '
        Me.TextTexto.Location = New System.Drawing.Point(24, 41)
        Me.TextTexto.Multiline = True
        Me.TextTexto.Name = "TextTexto"
        Me.TextTexto.Size = New System.Drawing.Size(268, 131)
        Me.TextTexto.TabIndex = 0
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(21, 25)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(84, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Inserta un Texto"
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(27, 198)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(123, 26)
        Me.Button1.TabIndex = 2
        Me.Button1.Text = "Contar Caracteres"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'TextCaracteres
        '
        Me.TextCaracteres.Location = New System.Drawing.Point(178, 203)
        Me.TextCaracteres.Name = "TextCaracteres"
        Me.TextCaracteres.Size = New System.Drawing.Size(113, 20)
        Me.TextCaracteres.TabIndex = 3
        '
        'ContarCaracteres
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(325, 243)
        Me.Controls.Add(Me.TextCaracteres)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.TextTexto)
        Me.Name = "ContarCaracteres"
        Me.Text = "Contar Caracteres"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents TextTexto As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents TextCaracteres As System.Windows.Forms.TextBox

End Class
