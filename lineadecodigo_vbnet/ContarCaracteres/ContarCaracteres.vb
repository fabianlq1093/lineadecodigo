Public Class ContarCaracteres

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        TextCaracteres.Text = CStr(Len(TextTexto.Text))
    End Sub
End Class
