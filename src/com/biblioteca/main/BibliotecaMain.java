package com.biblioteca.main;

import com.biblioteca.model.SessaoUsuarioModel;
import com.biblioteca.view.FrmTelaPrincipal;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class BibliotecaMain {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {


        SessaoUsuarioModel.codigoUsuario = 1;
        SessaoUsuarioModel.loginUsuario = "luiz";
        SessaoUsuarioModel.nivelAcesso = "ADMINISTRADOR";
        SessaoUsuarioModel.nomeUsuario = "José Luiz do Monte Gomes";
        SessaoUsuarioModel.instituicao="FECMA";
        new FrmTelaPrincipal().setVisible(true);
//        SplashView Splash = new SplashView();
//        Splash.setVisible(true);
//        for (int i = 0; i <= 50; i++) {
//            try {
//                Thread.sleep(30);
//            } catch (InterruptedException ex) {
//            }
//            if (i == 50) {
//
//                FrmLogin loginView = new FrmLogin();
//                Splash.setVisible(false);
//                loginView.setVisible(true);
//            }
//        }
    }

}
