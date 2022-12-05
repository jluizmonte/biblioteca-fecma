package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.IUsuario;
import com.biblioteca.model.UsuarioModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Instrutores
 */
public class UsuarioDao extends ConnectionMySQL implements IUsuario {

    @Override
    public boolean salvarUsuarioDAO(UsuarioModel pUsuarioModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL(
                    "INSERT INTO tbl_usuario (nome_usuario, senha_usuario, login_usuario, nivel_usuario) VALUES('" + pUsuarioModel.getNomeUsuario() + "','" + pUsuarioModel.getSenhaUsuario() + "','" + pUsuarioModel.getLoginUsuario() + "','" + pUsuarioModel.getNivelAcessoUsuario() + "')"
            );
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
        UsuarioModel usuarioModel = new UsuarioModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_usuario WHERE pk_id_usuario='" + pIdUsuario + "';");

            while (this.getResultSet().next()) {
                usuarioModel.setIdUsuario(this.getResultSet().getInt(1));
                usuarioModel.setNomeUsuario(this.getResultSet().getString(2));
                usuarioModel.setSenhaUsuario(this.getResultSet().getString(3));
                usuarioModel.setLoginUsuario(this.getResultSet().getString(4));
                usuarioModel.setNivelAcessoUsuario(this.getResultSet().getString(5));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o usuário",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return usuarioModel;
    }

    @Override
    public UsuarioModel getUsuarioDAO(String pLogin) {
        UsuarioModel usuarioModel = new UsuarioModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_usuario WHERE login_usuario='" + pLogin + "';");

            while (this.getResultSet().next()) {
                usuarioModel.setIdUsuario(this.getResultSet().getInt(1));
                usuarioModel.setNomeUsuario(this.getResultSet().getString(2));
                usuarioModel.setSenhaUsuario(this.getResultSet().getString(3));
                usuarioModel.setLoginUsuario(this.getResultSet().getString(4));
                usuarioModel.setNivelAcessoUsuario(this.getResultSet().getString(5));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o usuário",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return usuarioModel;
    }

    @Override
    public ArrayList<UsuarioModel> getListaUsuarioDAO() {
        ArrayList<UsuarioModel> listaUsuarioModel = new ArrayList<>();
        UsuarioModel usuarioModel = new UsuarioModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_usuario;");

            while (this.getResultSet().next()) {
                usuarioModel = new UsuarioModel();
                usuarioModel.setIdUsuario(this.getResultSet().getInt(1));
                usuarioModel.setNomeUsuario(this.getResultSet().getString(2));
                usuarioModel.setSenhaUsuario(this.getResultSet().getString(3));
                usuarioModel.setLoginUsuario(this.getResultSet().getString(4));
                usuarioModel.setNivelAcessoUsuario(this.getResultSet().getString(5));
                listaUsuarioModel.add(usuarioModel);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o usuários",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return listaUsuarioModel;
    }

    @Override
    public boolean atualizarUsuarioDAO(UsuarioModel pUsuarioModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("UPDATE tbl_usuario SET pk_id_usuario = '"
                    + pUsuarioModel.getIdUsuario() + "'," + "nome_usuario = '" + pUsuarioModel.getNomeUsuario() + "',"
                    + "login_usuario = '" + pUsuarioModel.getLoginUsuario() + "'," + "senha_usuario = '"
                    + pUsuarioModel.getSenhaUsuario() + "," + "nivel_usuario = '"
                    + pUsuarioModel.getNivelAcessoUsuario() + "'"
                    + " WHERE pk_id_usuario = '" + pUsuarioModel.getIdUsuario() + "'" + ";");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o usuário",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean excluirUsuarioDAO(int pIdUsuario) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM tbl_usuario  WHERE pk_id_usuario = '" + pIdUsuario + "'" + ";");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o usuário!", "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean getValidarUsuarioDAO(UsuarioModel pUsuarioModel) {
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_usuario WHERE"
                    + " login_usuario = '" + pUsuarioModel.getLoginUsuario()
                    + "' AND senha_usuario = '" + pUsuarioModel.getSenhaUsuario() + "'" + ";");

            if (this.getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a validação do usuário",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public int getQuantidadeUsuariosCadastrados() {
        int valor = 0;
        try {
            this.conectar();
            this.executarSQL("SELECT COUNT(*) FROM tbl_usuario;");

            while (this.getResultSet().next()) {
                valor = this.getResultSet().getInt(1);
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return valor;
    }
}
