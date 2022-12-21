package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.ILocatario;
import com.biblioteca.model.LocatarioModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Instrutores
 */
public class LocatarioDao extends ConnectionMySQL implements ILocatario {

    @Override
    public boolean salvarLocatarioDAO(LocatarioModel pLocatarioModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("INSERT INTO tbl_locatario (nome_locatario, rua_locatario, numero_locatario, bairro_locatario, cidade_locatario, uf_locatario, cep_locatario, telefone_locatario, email_locatario, status_locatario) "
                    + "VALUES ("
                    + "'" + pLocatarioModel.getNomeLocatario() + "',"
                    + "'" + pLocatarioModel.getLogradouroLocatario() + "',"
                    + "'" + pLocatarioModel.getNumeroLocatario() + "',"
                    + "'" + pLocatarioModel.getBairroLocatario() + "',"
                    + "'" + pLocatarioModel.getCidadeLocatario() + "',"
                    + "'" + pLocatarioModel.getEstadoLocatario() + "',"
                    + "'" + pLocatarioModel.getCepLocatario() + "',"
                    + "'" + pLocatarioModel.getTelefoneLocatario() + "',"
                    + "'" + pLocatarioModel.getEmailLocatario() + "',"
                    + "'" + pLocatarioModel.getStatusLocatario() + "'"
                    + ");");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public LocatarioModel getLocatarioDAO(int pIdLocatario) {
        LocatarioModel locatarioModel = new LocatarioModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_locatario WHERE pk_id_locatario = '" + pIdLocatario + "'" + ";");

            while (this.getResultSet().next()) {
                locatarioModel.setIdLocatario(this.getResultSet().getInt(1));
                locatarioModel.setNomeLocatario(this.getResultSet().getString(2));
                locatarioModel.setLogradouroLocatario(this.getResultSet().getString(3));
                locatarioModel.setNumeroLocatario(this.getResultSet().getString(4));
                locatarioModel.setBairroLocatario(this.getResultSet().getString(5));
                locatarioModel.setCidadeLocatario(this.getResultSet().getString(6));
                locatarioModel.setEstadoLocatario(this.getResultSet().getString(7));
                locatarioModel.setCepLocatario(this.getResultSet().getString(8));
                locatarioModel.setTelefoneLocatario(this.getResultSet().getString(9));
                locatarioModel.setEmailLocatario(this.getResultSet().getString(10));
                locatarioModel.setStatusLocatario(this.getResultSet().getString(11));
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return locatarioModel;
    }

    @Override
    public LocatarioModel getLocatarioDAO(String pLocatarioModel) {
        LocatarioModel locatarioModel = new LocatarioModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_locatario WHERE nome_locatario= '" + pLocatarioModel + "'" + ";");

            while (this.getResultSet().next()) {
                locatarioModel.setIdLocatario(this.getResultSet().getInt(1));
                locatarioModel.setNomeLocatario(this.getResultSet().getString(2));
                locatarioModel.setLogradouroLocatario(this.getResultSet().getString(3));
                locatarioModel.setNumeroLocatario(this.getResultSet().getString(4));
                locatarioModel.setBairroLocatario(this.getResultSet().getString(5));
                locatarioModel.setCidadeLocatario(this.getResultSet().getString(6));
                locatarioModel.setEstadoLocatario(this.getResultSet().getString(7));
                locatarioModel.setCepLocatario(this.getResultSet().getString(8));
                locatarioModel.setTelefoneLocatario(this.getResultSet().getString(9));
                locatarioModel.setEmailLocatario(this.getResultSet().getString(10));
                locatarioModel.setStatusLocatario(this.getResultSet().getString(11));
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return locatarioModel;
    }

    @Override
    public ArrayList<LocatarioModel> getListaLocatarioDAO() {
        ArrayList<LocatarioModel> listaLocatarioModel = new ArrayList<>();
        LocatarioModel locatarioModel = new LocatarioModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_locatario");

            while (this.getResultSet().next()) {
                locatarioModel = new LocatarioModel();
                locatarioModel.setIdLocatario(this.getResultSet().getInt(1));
                locatarioModel.setNomeLocatario(this.getResultSet().getString(2));
                locatarioModel.setLogradouroLocatario(this.getResultSet().getString(3));
                locatarioModel.setNumeroLocatario(this.getResultSet().getString(4));
                locatarioModel.setBairroLocatario(this.getResultSet().getString(5));
                locatarioModel.setCidadeLocatario(this.getResultSet().getString(6));
                locatarioModel.setEstadoLocatario(this.getResultSet().getString(7));
                locatarioModel.setCepLocatario(this.getResultSet().getString(8));
                locatarioModel.setTelefoneLocatario(this.getResultSet().getString(9));
                locatarioModel.setEmailLocatario(this.getResultSet().getString(10));
                locatarioModel.setStatusLocatario(this.getResultSet().getString(11));
                listaLocatarioModel.add(locatarioModel);
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar  os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return listaLocatarioModel;
    }

    @Override
    public boolean atualizarLocatarioDAO(LocatarioModel pLocatarioModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("UPDATE tbl_locatario SET "
                    + "pk_id_locatario = '" + pLocatarioModel.getIdLocatario() + "',"
                    + "nome_locatario = '" + pLocatarioModel.getNomeLocatario() + "',"
                    + "rua_locatario = '" + pLocatarioModel.getLogradouroLocatario() + "',"
                    + "numero_locatario = '" + pLocatarioModel.getNumeroLocatario() + "',"
                    + "bairro_locatario = '" + pLocatarioModel.getBairroLocatario() + "',"
                    + "cidade_locatario = '" + pLocatarioModel.getCidadeLocatario() + "',"
                    + "uf_locatario = '" + pLocatarioModel.getEstadoLocatario() + "',"
                    + "cep_locatario = '" + pLocatarioModel.getCepLocatario() + "',"
                    + "telefone_locatario = '" + pLocatarioModel.getTelefoneLocatario() + "',"
                    + "email_locatario ='" + pLocatarioModel.getEmailLocatario() + "',"
                    + "status_locatario ='" + pLocatarioModel.getStatusLocatario() + "'"
                    + " WHERE " + "pk_id_locatario = '" + pLocatarioModel.getIdLocatario() + "'" + ";");
        } catch (Exception e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean excluirLocatarioDAO(int idLocatarioModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM tbl_locatario " + " WHERE " + "pk_id_locatario = '" + idLocatarioModel + "'" + ";");
        } catch (Exception e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
