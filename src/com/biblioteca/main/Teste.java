package com.biblioteca.main;

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
            //   new frmLogin().setVisible(true);
            new FrmTelaPrincipal().setVisible(true);
            //new FrmLocador().setVisible(true);
        });
    }

}
