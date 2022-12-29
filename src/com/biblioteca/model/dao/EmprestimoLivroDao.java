package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.IEmprestimoLivro;
import com.biblioteca.model.EmprestimoLivroModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class EmprestimoLivroDao extends ConnectionMySQL implements IEmprestimoLivro {

    @Override
    public boolean salvarEmprestimosLivrosDAO(EmprestimoLivroModel pModelEmprestimosLivros) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL(""
                    + "INSERT INTO tbl_emprestimo_livro (fk_livro, fk_emprestimo, emprestimo_quantidade) VALUES ('"
                    + pModelEmprestimosLivros.getIdLivro() + "','"
                    + pModelEmprestimosLivros.getIdEmprestimo() + "','"
                    + pModelEmprestimosLivros.getQuantidadeEmprestimo() + "');");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean salvarEmprestimosLivrosDAO(ArrayList<EmprestimoLivroModel> plistaModelEmprestimosLivros) {
        try {
            this.conectar();
            int cont = plistaModelEmprestimosLivros.size();
            for (int i = 0; i < cont; i++) {
                this.executarInsertUpdateSQL(
                        "INSERT INTO tbl_emprestimo_livro (fk_livro,fk_emprestimo,emprestimo_quantidade) VALUES('"
                        + plistaModelEmprestimosLivros.get(i).getIdLivro() + "','"
                        + plistaModelEmprestimosLivros.get(i).getIdEmprestimo() + "','"
                        + plistaModelEmprestimosLivros.get(i).getQuantidadeEmprestimo() + "');");
            }
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean excluirEmprestimosLivrosDAO(int pIdEmprestimoLivro) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM tbl_emprestimo_livro " + " WHERE "
                    + "pk_id_emprestimo_livro = '" + pIdEmprestimoLivro + "'" + ";");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean atualizarEmprestimosLivrosDAO(EmprestimoLivroModel pModelEmprestimosLivros) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("UPDATE tbl_emprestimo_livro SET " + "pk_id_emprestimo_livro = '"
                    + pModelEmprestimosLivros.getIdEmprestimoLivro() + "'," + "fk_livro= '"
                    + pModelEmprestimosLivros.getIdLivro() + "'," + "fk_emprestimo = '"
                    + pModelEmprestimosLivros.getIdEmprestimo() + "'," + "emprestimo_quantidade = '"
                    + pModelEmprestimosLivros.getQuantidadeEmprestimo() + "'" + " WHERE " + "pk_id_venda_livro = '"
                    + pModelEmprestimosLivros.getIdEmprestimoLivro() + "'" + ";");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public ArrayList<EmprestimoLivroModel> getListaEmprestimosLivrosDAO() {
        ArrayList<EmprestimoLivroModel> listaEmprestimoModel = new ArrayList<>();
        EmprestimoLivroModel emprestimoLivroModel = new EmprestimoLivroModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM  tbl_emprestimo_livro;");

            while (this.getResultSet().next()) {
                emprestimoLivroModel = new EmprestimoLivroModel();
                emprestimoLivroModel.setIdEmprestimoLivro(1);
                emprestimoLivroModel.setIdLivro(2);
                emprestimoLivroModel.setIdEmprestimo(3);
                emprestimoLivroModel.setQuantidadeEmprestimo(4);
                listaEmprestimoModel.add(emprestimoLivroModel);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaEmprestimoModel;
    }

    @Override
    public EmprestimoLivroModel getEmprestimosLivrosDAO(int pIdEmprestimoLivro) {
        EmprestimoLivroModel emprestimoLivroModel = new EmprestimoLivroModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM  tbl_emprestimo_livro WHERE pk_id_emprestimo_livro = '"
                    + pIdEmprestimoLivro + "'" + ";");

            while (this.getResultSet().next()) {
                emprestimoLivroModel = new EmprestimoLivroModel();
                emprestimoLivroModel.setIdEmprestimoLivro(1);
                emprestimoLivroModel.setIdLivro(2);
                emprestimoLivroModel.setIdEmprestimo(3);
                emprestimoLivroModel.setQuantidadeEmprestimo(4);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return emprestimoLivroModel;
    }

}
