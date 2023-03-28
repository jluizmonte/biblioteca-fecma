package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.IEmprestimo;
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
public class EmprestimoDao extends ConnectionMySQL implements IEmprestimo {

    @Override
    public int salvarEmprestimoDAO(EmprestimoModel pEmprestimoModel) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_emprestimo (fk_locador,fk_locatario,fk_livro,"
                    + "data_emprestimo,devolucao_emprestimo, quantidade,status_emprestimo" + ") VALUES (" + "'"
                    + pEmprestimoModel.getIdLocador() + "'," + "'" + pEmprestimoModel.getIdLocatario() + "'," + "'"
                    + pEmprestimoModel.getIdLivro() + "'," + "'" + pEmprestimoModel.getDataEmprestimo() + "'," + "'"
                    + pEmprestimoModel.getDataDevolucao() + "','"
                    + pEmprestimoModel.getQuantidadeEmprestimo() + "','"
                    + pEmprestimoModel.getStatusEmprestimo() + "');");
            //   return 1;
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
                    "UPDATE tbl_emprestimo SET "
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
                        + "data_emprestimo," + "devolucao_emprestimo," + "quantidade," + "status_emprestimo" + ") VALUES (" + "'"
                        + plistaModelEmprestimos.get(i).getIdLocador() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getIdLocatario() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getIdLivro() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getDataEmprestimo() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getDataDevolucao() + "'," + ""
                        + plistaModelEmprestimos.get(i).getQuantidadeEmprestimo() + "," + "'"
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

    /**
     *
     * @return
     */
    @Override
    public ArrayList<EmprestimoModel> getEmprestimoListaDAO() {

        LocatarioModel locatarioModel = new LocatarioModel();
        LocadorModel locadorModel = new LocadorModel();
        LivroModel livroModel = new LivroModel();

        EmprestimoModel emprestimoModel = new EmprestimoModel();
        ArrayList<EmprestimoModel> ListaEmprestimoModel = new ArrayList<>();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_emprestimo "
                    + "INNER JOIN tbl_locatario ON tbl_locatario.pk_id_locatario = tbl_emprestimo.fk_locatario "
                    + "INNER JOIN tbl_locador ON tbl_locador.pk_id_locador = tbl_emprestimo.fk_locador "
                    + "INNER JOIN tbl_livro ON tbl_livro.pk_id_livro = tbl_emprestimo.fk_livro order by pk_id_emprestimo asc;");

            while (this.getResultSet().next()) {
                locatarioModel = new LocatarioModel();
                locadorModel = new LocadorModel();
                livroModel = new LivroModel();
                emprestimoModel = new EmprestimoModel();

                // emprestimo
                emprestimoModel.setIdEmprestimo(this.getResultSet().getInt(1));
                emprestimoModel.setIdLocador(this.getResultSet().getInt(2));
                emprestimoModel.setIdLocatario(this.getResultSet().getInt(3));
                emprestimoModel.setIdLivro(this.getResultSet().getInt(4));
                emprestimoModel.setDataEmprestimo(this.getResultSet().getString(5));
                emprestimoModel.setDataDevolucao(this.getResultSet().getString(6));
                emprestimoModel.setQuantidadeEmprestimo(this.getResultSet().getInt(7));
                emprestimoModel.setStatusEmprestimo(this.getResultSet().getString(8));

                // locatário
                locatarioModel.setIdLocatario(this.getResultSet().getInt(9));
                locatarioModel.setNomeLocatario(this.getResultSet().getString(10));
                locatarioModel.setLogradouroLocatario(this.getResultSet().getString(11));
                locatarioModel.setNumeroLocatario(this.getResultSet().getString(12));
                locatarioModel.setBairroLocatario(this.getResultSet().getString(13));
                locatarioModel.setCidadeLocatario(this.getResultSet().getString(14));
                locatarioModel.setEstadoLocatario(this.getResultSet().getString(15));
                locatarioModel.setCepLocatario(this.getResultSet().getString(16));
                locatarioModel.setTelefoneLocatario(this.getResultSet().getString(17));
                locatarioModel.setEmailLocatario(this.getResultSet().getString(18));
                locatarioModel.setStatusLocatario(this.getResultSet().getString(19));

                // locador
                locadorModel.setIdLocador(this.getResultSet().getInt(20));
                locadorModel.setNomeLocador(this.getResultSet().getString(21));
                locadorModel.setLogradouroLocador(this.getResultSet().getString(22));
                locadorModel.setNumeroLocador(this.getResultSet().getString(23));
                locadorModel.setBairroLocador(this.getResultSet().getString(24));
                locadorModel.setCidadeLocador(this.getResultSet().getString(25));
                locadorModel.setEstadoLocador(this.getResultSet().getString(26));
                locadorModel.setCepLocador(this.getResultSet().getString(27));
                locadorModel.setTelefoneLocador(this.getResultSet().getString(28));
                locadorModel.setEmailLocador(this.getResultSet().getString(29));

                // livro
                livroModel.setIdLivro(this.getResultSet().getInt(30));
                livroModel.setTituloLivro(this.getResultSet().getString(31));
                livroModel.setAutor1Livro(this.getResultSet().getString(32));
                livroModel.setAutor2Livro(this.getResultSet().getString(33));
                livroModel.setGeneroLivro(this.getResultSet().getString(34));
                livroModel.setAnoLivro(this.getResultSet().getString(35));
                livroModel.setDataCadastroLivro(this.getResultSet().getString(36));
                livroModel.setQtdeLivro(this.getResultSet().getInt(37));
                livroModel.setEstadoLivro((this.getResultSet().getString(38)));
                livroModel.setDescricaoLivro(this.getResultSet().getString(39));

                //emprestimo livro
//                emprestimoModel.setIdEmprestimo(this.getResultSet().getInt(39));
//                emprestimoModel.setIdLivro(this.getResultSet().getInt(40));
//                emprestimoModel.setIdEmprestimoLivro(this.getResultSet().getInt(41));
//                emprestimoModel.setQuantidadeEmprestimo(this.getResultSet().getInt(42));
//                //emprestimo locatario
                // emprestimoModel.setEmprestimoModel(emprestimoModel);
                emprestimoModel.setLocatarioModel(locatarioModel);
                emprestimoModel.setLocadorModel(locadorModel);
                emprestimoModel.setLivroModel(livroModel);
                //  emprestimoModel.setEmprestimoLivroModel(emprestimoLivroModel);
                ListaEmprestimoModel.add(emprestimoModel);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!\n" + e.toString(),
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return ListaEmprestimoModel;
    }

    public ArrayList<EmprestimoModel> getListaLivrosEmprestimoLivrosDAO(int pCodigoEmprestimo) {
        ArrayList<EmprestimoModel> listaLivroEmprestimoLivroModel = new ArrayList<>();
        LivroModel livroModel = new LivroModel();
        EmprestimoModel emprestimoModel = new EmprestimoModel();
        try {
            this.conectar();
            this.executarSQL("select * from tbl_livro join tbl_emprestimo"
                    + "on pk_id_livro=fk_livro where fk_emprestimo='" + pCodigoEmprestimo + "';");

            while (this.getResultSet().next()) {
                livroModel = new LivroModel();

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
                emprestimoModel.setIdEmprestimoLivro(this.getResultSet().getInt(11));
                emprestimoModel.setIdLivro(this.getResultSet().getInt(12));
                emprestimoModel.setIdEmprestimo(this.getResultSet().getInt(13));
                emprestimoModel.setQuantidadeEmprestimo(this.getResultSet().getInt(14));
              

                listaLivroEmprestimoLivroModel.add(emprestimoModel);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaLivroEmprestimoLivroModel;
    }
}
