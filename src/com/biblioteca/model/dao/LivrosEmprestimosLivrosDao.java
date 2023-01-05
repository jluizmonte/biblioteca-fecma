package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.model.EmprestimoLivroModel;
import com.biblioteca.model.LivroModel;
import com.biblioteca.model.LivrosEmprestimosLivrosModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.biblioteca.controller.ILivrosEmprestimosLivros;

/**
 *
 * @author joseluiz
 */
public class LivrosEmprestimosLivrosDao extends ConnectionMySQL implements ILivrosEmprestimosLivros {

    @Override
    public ArrayList<LivrosEmprestimosLivrosModel> getListaLivrosEmprestimoLivrosDAO(int pCodigoEmprestimo) {
        ArrayList<LivrosEmprestimosLivrosModel> listaLivroEmprestimoLivroModel = new ArrayList<>();
        LivrosEmprestimosLivrosModel livrosEprestimoLivroModel = new LivrosEmprestimosLivrosModel();
        LivroModel livroModel = new LivroModel();
        EmprestimoLivroModel emprestimoLivroModel = new EmprestimoLivroModel();
        try {
            this.conectar();
            this.executarSQL("select * from tbl_livro join tbl_emprestimo_livro on pk_id_livro=pk_id_emprestimo_livro where fk_emprestimo='" + pCodigoEmprestimo + "';");

            while (this.getResultSet().next()) {
                livrosEprestimoLivroModel = new LivrosEmprestimosLivrosModel();
                livroModel = new LivroModel();
                emprestimoLivroModel = new EmprestimoLivroModel();

                livroModel.setIdLivro(this.getResultSet().getInt(1));
                livroModel.setTituloLivro(this.getResultSet().getString(2));
                livroModel.setAutor1Livro(this.getResultSet().getString(3));
                livroModel.setAutor2Livro(this.getResultSet().getString(4));
                livroModel.setGeneroLivro(this.getResultSet().getString(5));
                livroModel.setAnoLivro(this.getResultSet().getString(6));
                livroModel.setDataCadastroLivro(this.getResultSet().getString(7));
                livroModel.setQtdeLivro(this.getResultSet().getInt(8));
                livroModel.setEstadoLivro(this.getResultSet().getString(9));
                livroModel.setDescricaoLivro(this.getResultSet().getString(10));

                // emprestimo-->
                emprestimoLivroModel.setIdEmprestimoLivro(this.getResultSet().getInt(11));
                emprestimoLivroModel.setIdLivro(this.getResultSet().getInt(12));
                emprestimoLivroModel.setIdEmprestimo(this.getResultSet().getInt(13));
                emprestimoLivroModel.setQuantidadeEmprestimo(this.getResultSet().getInt(14));

                livrosEprestimoLivroModel.setLivroModel(livroModel);
                livrosEprestimoLivroModel.setEmprestimoLivroModel(emprestimoLivroModel);
 
                listaLivroEmprestimoLivroModel.add(livrosEprestimoLivroModel);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaLivroEmprestimoLivroModel;
    }

}
