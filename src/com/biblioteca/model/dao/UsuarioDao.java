package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.IUsuario;
import com.biblioteca.model.UsuarioModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Instrutores
 */
public class UsuarioDao extends ConnectionMySQL implements IUsuario{

    @Override
    public boolean salvarUsuarioDAO(UsuarioModel pUsuarioModel) {
        try {
            this.conectar();
          return this.executarInsertUpdateSQL("INSERT INTO tbl_usuario VALUES (nome_usuario, senha_usuario, login_usuario, nivel_usuario)");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o usuário",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public UsuarioModel getUsuarioDAO(int pIdUsuario) {
    
    }

    @Override
    public UsuarioModel getUsuarioDAO(String pLogin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<UsuarioModel> getListaUsuarioDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean atualizarUsuarioDAO(UsuarioModel pUsuarioModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluirUsuarioDAO(int pIdUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean getValidarUsuarioDAO(UsuarioModel pUsuarioModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsuarioModel getQuantidadeUsuariosCadastrados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
