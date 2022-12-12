package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.ILocador;
import com.biblioteca.model.LocadorModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Instrutores
 */
public class LocadorDao extends ConnectionMySQL implements ILocador {

    @Override
    public boolean salvarLocadorDAO(LocadorModel pLocadorModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("INSERT INTO tbl_locador (nome_locador, rua_locador, numero_locador, bairro_locador, cidade_locador, uf_locador, cep_locador, telefone_locador, email_locador) "
                    + "VALUES ("
                    + "'" + pLocadorModel.getNomeLocador() + "',"
                    + "'" + pLocadorModel.getLogradouroLocador() + "',"
                    + "'" + pLocadorModel.getNumeroLocador() + "',"
                    + "'" + pLocadorModel.getBairroLocador() + "',"
                    + "'" + pLocadorModel.getCidadeLocador() + "',"
                    + "'" + pLocadorModel.getEstadoLocador() + "',"
                    + "'" + pLocadorModel.getCepLocador() + "',"
                    + "'" + pLocadorModel.getTelefoneLocador() + "',"
                    + "'" + pLocadorModel.getEmailLocador() + "'"
                    + ");");
        } catch (Exception e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public LocadorModel getLocadorDAO(int pIdLocador) {
        LocadorModel locadorModel = new LocadorModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_locador WHERE pk_id_locador = '" + pIdLocador + "';");

            while (this.getResultSet().next()) {
                locadorModel.setIdLocador(this.getResultSet().getInt(1));
                locadorModel.setNomeLocador(this.getResultSet().getString(2));
                locadorModel.setLogradouroLocador(this.getResultSet().getString(3));
                locadorModel.setNumeroLocador(this.getResultSet().getString(4));
                locadorModel.setBairroLocador(this.getResultSet().getString(5));
                locadorModel.setCidadeLocador(this.getResultSet().getString(6));
                locadorModel.setEstadoLocador(this.getResultSet().getString(7));
                locadorModel.setCepLocador(this.getResultSet().getString(8));
                locadorModel.setTelefoneLocador(this.getResultSet().getString(9));
                locadorModel.setEmailLocador(this.getResultSet().getString(10));
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return locadorModel;
    }

    @Override
    public LocadorModel getLocadorDAO(String pLocadorModel) {
        LocadorModel locadorModel = new LocadorModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_locador WHERE nome_locador = '" + pLocadorModel + "'" + ";");

            while (this.getResultSet().next()) {
                locadorModel.setIdLocador(this.getResultSet().getInt(1));
                locadorModel.setNomeLocador(this.getResultSet().getString(2));
                locadorModel.setLogradouroLocador(this.getResultSet().getString(3));
                locadorModel.setNumeroLocador(this.getResultSet().getString(4));
                locadorModel.setBairroLocador(this.getResultSet().getString(5));
                locadorModel.setCidadeLocador(this.getResultSet().getString(6));
                locadorModel.setEstadoLocador(this.getResultSet().getString(7));
                locadorModel.setCepLocador(this.getResultSet().getString(8));
                locadorModel.setTelefoneLocador(this.getResultSet().getString(9));
                locadorModel.setEmailLocador(this.getResultSet().getString(10));
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return locadorModel;
    }

    @Override
    public ArrayList<LocadorModel> getListaLocadorDAO() {
        ArrayList<LocadorModel> listaLocadorModel = new ArrayList<>();
        LocadorModel locadorModel = new LocadorModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_locador;");

            while (this.getResultSet().next()) {
                locadorModel = new LocadorModel();
                locadorModel.setIdLocador(this.getResultSet().getInt(1));
                locadorModel.setNomeLocador(this.getResultSet().getString(2));
                locadorModel.setLogradouroLocador(this.getResultSet().getString(3));
                locadorModel.setNumeroLocador(this.getResultSet().getString(4));
                locadorModel.setBairroLocador(this.getResultSet().getString(5));
                locadorModel.setCidadeLocador(this.getResultSet().getString(6));
                locadorModel.setEstadoLocador(this.getResultSet().getString(7));
                locadorModel.setCepLocador(this.getResultSet().getString(8));
                locadorModel.setTelefoneLocador(this.getResultSet().getString(9));
                locadorModel.setEmailLocador(this.getResultSet().getString(10));
                listaLocadorModel.add(locadorModel);
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return listaLocadorModel;
    }

    @Override
    public boolean atualizarLocadorDAO(LocadorModel pLocadorModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("UPDATE tbl_locador SET "
                    + "pk_id_locador = '" + pLocadorModel.getIdLocador() + "',"
                    + "nome_locador = '" + pLocadorModel.getNomeLocador() + "',"
                    + "rua_locador = '" + pLocadorModel.getLogradouroLocador() + "',"
                    + "numero_locador = '" + pLocadorModel.getNumeroLocador() + "',"
                    + "bairro_locador = '" + pLocadorModel.getBairroLocador() + "',"
                    + "cidade_locador = '" + pLocadorModel.getCidadeLocador() + "',"
                    + "uf_locador = '" + pLocadorModel.getEstadoLocador() + "',"
                    + "cep_locador = '" + pLocadorModel.getCepLocador() + "',"
                    + "telefone_locador = '" + pLocadorModel.getTelefoneLocador() + "',"
                    + "email_locador ='" + pLocadorModel.getEmailLocador() + "'"
                    + " WHERE " + "pk_id_locador = '" + pLocadorModel.getIdLocador() + "'" + ";");
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
    public boolean excluirLocadorDAO(int idLocadorModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM tbl_locador WHERE pk_id_locador = '" + idLocadorModel + "'" + ";");
        } catch (Exception e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
