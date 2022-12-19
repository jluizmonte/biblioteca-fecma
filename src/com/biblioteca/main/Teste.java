package com.biblioteca.main;

import com.biblioteca.model.SessaoUsuarioModel;
import com.biblioteca.view.FrmLogin;
import com.biblioteca.view.FrmTelaPrincipal;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Teste {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {

        java.awt.EventQueue.invokeLater(() -> {
//            new FrmLogin().setVisible(true);
//            new FrmLocador().setVisible(true);
            SessaoUsuarioModel.codigoUsuario = 1;
            SessaoUsuarioModel.loginUsuario = "luiz";
            SessaoUsuarioModel.nivelAcesso = "ADMINISTRADOR";
            SessaoUsuarioModel.nomeUsuario = "José Luiz";
            new FrmTelaPrincipal().setVisible(true);
        });
    }

}
