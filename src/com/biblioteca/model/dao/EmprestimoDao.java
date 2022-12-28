package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.IEmprestimo;
import com.biblioteca.model.EmprestimoModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class EmprestimoDao extends ConnectionMySQL implements IEmprestimo {

    @Override
    public int salvarEmprestimoDAO(EmprestimoModel pEmprestimoModel) {
        try {
            this.conectar();
            this.executarInsertUpdateSQL("INSERT INTO tbl_emprestimo fk_locador,fk_locatario,fk_livro,"
                    + "data_emprestimo,devolucao_emprestimo,status_emprestimo" + ") VALUES (" + "'"
                    + pEmprestimoModel.getIdLocador() + "'," + "'" + pEmprestimoModel.getIdLocatario() + "'," + "'"
                    + pEmprestimoModel.getIdLivro() + "'," + "'" + pEmprestimoModel.getDataEmprestimo() + "'," + "'"
                    + pEmprestimoModel.getDataDevolucao() + "','" + pEmprestimoModel.getStatusEmprestimo() + "');");
            return 1;
        } catch (Exception e) {
            e.toString();
            return 0;
        } finally {
            this.fecharConexao();
        }

    }

    @Override
    public EmprestimoModel getEmprestimoDAO(int pIdEmprestimo) {
        EmprestimoModel emprestimoModel = new EmprestimoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_emprestimo WHERE pk_id_emprestimo = '" + pIdEmprestimo + "';");
            while (this.getResultSet().next()) {
                emprestimoModel.setIdEmprestimo(this.getResultSet().getInt(1));
                emprestimoModel.setIdLocador(this.getResultSet().getInt(2));
                emprestimoModel.setIdLocatario(this.getResultSet().getInt(3));
                emprestimoModel.setIdLivro(this.getResultSet().getInt(4));
                emprestimoModel.setDataEmprestimo(this.getResultSet().getString(5));
                emprestimoModel.setDataDevolucao(this.getResultSet().getString(6));
                emprestimoModel.setStatusEmprestimo(this.getResultSet().getString(7));
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return emprestimoModel;
    }

    @Override
    public ArrayList<EmprestimoModel> getListaEmprestimoDAO() {
        ArrayList<EmprestimoModel> listaEmprestimoModel = new ArrayList<>();
        EmprestimoModel emprestimoModel = new EmprestimoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_emprestimo;");
            while (this.getResultSet().next()) {
                emprestimoModel.setIdEmprestimo(this.getResultSet().getInt(1));
                emprestimoModel.setIdLocador(this.getResultSet().getInt(2));
                emprestimoModel.setIdLocatario(this.getResultSet().getInt(3));
                emprestimoModel.setIdLivro(this.getResultSet().getInt(4));
                emprestimoModel.setDataEmprestimo(this.getResultSet().getString(5));
                emprestimoModel.setDataDevolucao(this.getResultSet().getString(6));
                emprestimoModel.setStatusEmprestimo(this.getResultSet().getString(7));
                listaEmprestimoModel.add(emprestimoModel);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaEmprestimoModel;
    }

    @Override
    public boolean atualizarEmprestimoDAO(EmprestimoModel pEmprestimoModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL(
                    "UPDATE tbl_emprestimo SET " + "pk_id_emprestimo = '" + pEmprestimoModel.getIdEmprestimo() + "',"
                    + "fk_locador ='" + pEmprestimoModel.getIdLocador()
                    + "'," + "fk_locatario = '" + pEmprestimoModel.getIdLocatario() + "',"
                    + "fk_livro ='" + pEmprestimoModel.getIdLivro() + "',"
                    + "data_emprestimo = '" + pEmprestimoModel.getDataEmprestimo() + "',"
                    + "devolucao_emprestimo = '" + pEmprestimoModel.getDataDevolucao() + "',"
                    + "status_emprestimo = '" + pEmprestimoModel.getStatusEmprestimo() + "'" + " WHERE "
                    + "pk_id_emprestimo = '" + pEmprestimoModel.getIdEmprestimo() + "'" + ";");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean excluirEmprestimoDAO(int pIdEmprestimoModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM tbl_emprestimo  WHERE pk_id_emprestimo = '" + pIdEmprestimoModel + "'" + ";");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public EmprestimoModel getQuantidadeEmprestimo() {
        EmprestimoModel emprestimoModel = new EmprestimoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT COUNT(*) FROM tbl_emprestimo;");
            while (this.getResultSet().next()) {
                emprestimoModel.setQuantidadeEmprestimo(this.getResultSet().getInt(1));
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return emprestimoModel;
    }

    @Override
    public boolean salvarEmprestimosDAO(ArrayList<EmprestimoModel> plistaModelEmprestimos) {
        try {
            this.conectar();
            int cont = plistaModelEmprestimos.size();
            for (int i = 0; i < cont; i++) {
                this.executarInsertUpdateSQL("INSERT INTO tbl_emprestimo (" + "fk_locador," + "fk_locatario," + "fk_livro,"
                        + "data_emprstimo," + "devolucao_emprestimo," + "status_emprestimo" + ") VALUES (" + "'"
                        + plistaModelEmprestimos.get(i).getIdLocador() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getIdLocatario() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getIdLivro() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getDataEmprestimo() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getDataDevolucao() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getStatusEmprestimo() + "'" + ");");
            }
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
