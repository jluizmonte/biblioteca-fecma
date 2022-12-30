package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.IEmprestimoLocatario;
import com.biblioteca.model.EmprestimoLivroModel;
import com.biblioteca.model.EmprestimoLocatarioModel;
import com.biblioteca.model.EmprestimoModel;
import com.biblioteca.model.LivroModel;
import com.biblioteca.model.LocadorModel;
import com.biblioteca.model.LocatarioModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Instrutores
 */
public class EmprestimoLocatarioDao extends ConnectionMySQL implements IEmprestimoLocatario {

    @Override
    public ArrayList<EmprestimoLocatarioModel> getListaEmprestimosLocatarioDAO() {

        LocatarioModel locatarioModel = new LocatarioModel();
        LocadorModel locadorModel = new LocadorModel();
        LivroModel livroModel = new LivroModel();

        EmprestimoModel emprestimoModel = new EmprestimoModel();
        EmprestimoLivroModel emprestimoLivroModel = new EmprestimoLivroModel();
        EmprestimoLocatarioModel emprestimoLocatarioModel = new EmprestimoLocatarioModel();
        ArrayList<EmprestimoLocatarioModel> listaEmprestimoLocatarioModel = new ArrayList<>();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_emprestimo "
                    + "INNER JOIN tbl_locatario ON tbl_locatario.pk_id_locatario = tbl_emprestimo.fk_locatario "
                    + "INNER JOIN tbl_locador ON tbl_locador.pk_id_locador = tbl_emprestimo.fk_locador "
                    + "INNER JOIN tbl_livro ON tbl_livro.pk_id_livro = tbl_emprestimo.fk_livro "
                    + "INNER JOIN tbl_emprestimo_livro ON tbl_emprestimo.pk_id_emprestimo=tbl_emprestimo_livro.pk_id_emprestimo_livro;");
            while (this.getResultSet().next()) {
                locatarioModel = new LocatarioModel();
                locadorModel = new LocadorModel();
                livroModel = new LivroModel();
                emprestimoModel = new EmprestimoModel();
                emprestimoLocatarioModel = new EmprestimoLocatarioModel();
                emprestimoLivroModel = new EmprestimoLivroModel();

                // emprestimo
                emprestimoModel = new EmprestimoModel();
                emprestimoModel.setIdEmprestimo(this.getResultSet().getInt(1));
                emprestimoModel.setIdLocador(this.getResultSet().getInt(2));
                emprestimoModel.setIdLocatario(this.getResultSet().getInt(3));
                emprestimoModel.setIdLivro(this.getResultSet().getInt(4));
                emprestimoModel.setDataEmprestimo(this.getResultSet().getString(5));
                emprestimoModel.setDataDevolucao(this.getResultSet().getString(6));
                emprestimoModel.setStatusEmprestimo(this.getResultSet().getString(7));

                // locatário
                locatarioModel = new LocatarioModel();
                locatarioModel.setIdLocatario(this.getResultSet().getInt(8));
                locatarioModel.setNomeLocatario(this.getResultSet().getString(9));
                locatarioModel.setLogradouroLocatario(this.getResultSet().getString(10));
                locatarioModel.setNumeroLocatario(this.getResultSet().getString(11));
                locatarioModel.setBairroLocatario(this.getResultSet().getString(12));
                locatarioModel.setCidadeLocatario(this.getResultSet().getString(13));
                locatarioModel.setEstadoLocatario(this.getResultSet().getString(14));
                locatarioModel.setCepLocatario(this.getResultSet().getString(15));
                locatarioModel.setTelefoneLocatario(this.getResultSet().getString(16));
                locatarioModel.setEmailLocatario(this.getResultSet().getString(17));
                locatarioModel.setStatusLocatario(this.getResultSet().getString(18));

                // locador
                locadorModel.setIdLocador(this.getResultSet().getInt(19));
                locadorModel.setNomeLocador(this.getResultSet().getString(20));
                locadorModel.setLogradouroLocador(this.getResultSet().getString(21));
                locadorModel.setNumeroLocador(this.getResultSet().getString(22));
                locadorModel.setBairroLocador(this.getResultSet().getString(23));
                locadorModel.setCidadeLocador(this.getResultSet().getString(24));
                locadorModel.setEstadoLocador(this.getResultSet().getString(25));
                locadorModel.setCepLocador(this.getResultSet().getString(26));
                locadorModel.setTelefoneLocador(this.getResultSet().getString(27));
                locadorModel.setEmailLocador(this.getResultSet().getString(28));

                // livro
                livroModel.setIdLivro(this.getResultSet().getInt(29));
                livroModel.setTituloLivro(this.getResultSet().getString(30));
                livroModel.setAutor1Livro(this.getResultSet().getString(31));
                livroModel.setAutor2Livro(this.getResultSet().getString(32));
                livroModel.setAnoLivro(this.getResultSet().getString(33));
                livroModel.setGeneroLivro(this.getResultSet().getString(34));
                livroModel.setDescricaoLivro((this.getResultSet().getString(35)));
                livroModel.setDataCadastroLivro(this.getResultSet().getString(36));
                livroModel.setQtdeLivro(this.getResultSet().getInt(36));

                //emprestimo livro
                emprestimoLivroModel.setIdEmprestimo(this.getResultSet().getInt(37));
                emprestimoLivroModel.setIdLivro(this.getResultSet().getInt(38));
                emprestimoLivroModel.setIdEmprestimoLivro(this.getResultSet().getInt(39));
                emprestimoLivroModel.setQuantidadeEmprestimo(this.getResultSet().getInt(40));
                
                //emprestimo locatario
                emprestimoLocatarioModel.setEmprestimoModel(emprestimoModel);
                emprestimoLocatarioModel.setLocatarioModel(locatarioModel);
                emprestimoLocatarioModel.setLocadorModel(locadorModel);
                emprestimoLocatarioModel.setLivroModel(livroModel);

                listaEmprestimoLocatarioModel.add(emprestimoLocatarioModel);
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return listaEmprestimoLocatarioModel;
    }

}
