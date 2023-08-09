package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.ILivro;
import com.biblioteca.model.LivroModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Instrutores
 */
public class LivroDao extends ConnectionMySQL implements ILivro {

    @Override
    public boolean salvarLivroDAO(LivroModel pLivroModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("INSERT INTO tbl_livro (tipo_livro,titulo_livro, autor1_livro, editora_livro, genero_livro, ano_livro, data_livro, quantidade_livro, estado_livro, descricao_livro,valor_livro) "
                    + "VALUES ("
                    + "'" + pLivroModel.getTipoLivro() + "',"
                    + "'" + pLivroModel.getTituloLivro() + "',"
                    + "'" + pLivroModel.getAutor1Livro() + "',"
                    + "'" + pLivroModel.getEditoraLivro() + "',"
                    + "'" + pLivroModel.getGeneroLivro() + "',"
                    + "'" + pLivroModel.getAnoLivro() + "',"
                    + "'" + pLivroModel.getDataCadastroLivro() + "',"
                    + "'" + pLivroModel.getQtdeLivro() + "',"
                    + "'" + pLivroModel.getEstadoLivro() + "',"
                    + "'" + pLivroModel.getDescricaoLivro() + "',"
                    + "'" + pLivroModel.getValorLivro() + "'"
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
    public LivroModel getLivroDAO(int pIdLivro) {
        LivroModel livroModel = new LivroModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_livro WHERE pk_id_livro = '" + pIdLivro + "';");
            while (this.getResultSet().next()) {
                livroModel.setIdLivro(this.getResultSet().getInt(1));
                livroModel.setTipoLivro(this.getResultSet().getString(2));
                livroModel.setTituloLivro(this.getResultSet().getString(3));
                livroModel.setAutor1Livro(this.getResultSet().getString(4));
                livroModel.setEditoraLivro(this.getResultSet().getString(5));
                livroModel.setGeneroLivro(this.getResultSet().getString(6));
                livroModel.setAnoLivro(this.getResultSet().getString(7));
                livroModel.setDataCadastroLivro(this.getResultSet().getString(8));
                livroModel.setQtdeLivro(this.getResultSet().getInt(9));
                livroModel.setEstadoLivro(this.getResultSet().getString(10));
                livroModel.setDescricaoLivro(this.getResultSet().getString(11));
                livroModel.setValorLivro(this.getResultSet().getDouble(12));
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return livroModel;
    }

    @Override
    public LivroModel getLivroDAO(String pLivroModel) {
        LivroModel livroModel = new LivroModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_livro WHERE titulo_livro = '" + pLivroModel + "'" + ";");
            while (this.getResultSet().next()) {
                livroModel.setIdLivro(this.getResultSet().getInt(1));
                livroModel.setTipoLivro(this.getResultSet().getString(2));
                livroModel.setTituloLivro(this.getResultSet().getString(3));
                livroModel.setAutor1Livro(this.getResultSet().getString(4));
                livroModel.setEditoraLivro(this.getResultSet().getString(5));
                livroModel.setGeneroLivro(this.getResultSet().getString(6));
                livroModel.setAnoLivro(this.getResultSet().getString(7));
                livroModel.setDataCadastroLivro(this.getResultSet().getString(8));
                livroModel.setQtdeLivro(this.getResultSet().getInt(9));
                livroModel.setEstadoLivro(this.getResultSet().getString(10));
                livroModel.setDescricaoLivro(this.getResultSet().getString(11));
                livroModel.setValorLivro(this.getResultSet().getDouble(12));

            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return livroModel;
    }

    @Override
    public ArrayList<LivroModel> getListaLivroDAO() {
        ArrayList<LivroModel> listaLivroModel = new ArrayList<>();
        LivroModel livroModel = new LivroModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_livro ORDER BY titulo_livro ASC;");
            while (this.getResultSet().next()) {
                livroModel = new LivroModel();
                livroModel.setIdLivro(this.getResultSet().getInt(1));
                livroModel.setTipoLivro(this.getResultSet().getString(2));
                livroModel.setTituloLivro(this.getResultSet().getString(3));
                livroModel.setAutor1Livro(this.getResultSet().getString(4));
                livroModel.setEditoraLivro(this.getResultSet().getString(5));
                livroModel.setGeneroLivro(this.getResultSet().getString(6));
                livroModel.setAnoLivro(this.getResultSet().getString(7));
                livroModel.setDataCadastroLivro(this.getResultSet().getString(8));
                livroModel.setQtdeLivro(this.getResultSet().getInt(9));
                livroModel.setEstadoLivro(this.getResultSet().getString(10));
                livroModel.setDescricaoLivro(this.getResultSet().getString(11));
                livroModel.setValorLivro(this.getResultSet().getDouble(12));

                listaLivroModel.add(livroModel);
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return listaLivroModel;
    }

    @Override
    public boolean atualizarLivroDAO(LivroModel pLivroModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("UPDATE tbl_livro SET "
                    + "pk_id_livro= '" + pLivroModel.getIdLivro() + "',"
                    + "tipo_livro= '" + pLivroModel.getTipoLivro() + "',"
                    + "titulo_livro= '" + pLivroModel.getTituloLivro() + "',"
                    + "autor1_livro= '" + pLivroModel.getAutor1Livro() + "',"
                    + "editora_livro= '" + pLivroModel.getEditoraLivro() + "',"
                    + "genero_livro= '" + pLivroModel.getGeneroLivro() + "',"
                    + "ano_livro= '" + pLivroModel.getAnoLivro() + "',"
                    + "data_livro= '" + pLivroModel.getDataCadastroLivro() + "',"
                    + "quantidade_livro = '" + pLivroModel.getQtdeLivro() + "',"
                    + "estado_livro='" + pLivroModel.getEstadoLivro() + "',"
                    + "descricao_livro='" + pLivroModel.getDescricaoLivro() + "',"
                    + "valor_livro='" + pLivroModel.getValorLivro() + "'"
                    + " WHERE " + "pk_id_livro = '" + pLivroModel.getIdLivro() + "'" + ";");
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
    public boolean excluirLivroDAO(int idLivroModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM tbl_livro WHERE pk_id_livro = '" + idLivroModel + "';");
        } catch (Exception e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean alterarEstoqueListaLivrosDAO(ArrayList<LivroModel> plistaLivroModel) {
        try {
            this.conectar();
            for (int i = 0; i < plistaLivroModel.size(); i++) {
                this.executarInsertUpdateSQL(
                        "UPDATE tbl_livro SET quantidade_livro = '" + plistaLivroModel.get(i).getQtdeLivro()
                        + "' WHERE pk_id_livro = '" + plistaLivroModel.get(i).getIdLivro() + "'");
            }
            return true;
        } catch (Exception e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public LivroModel getQuantidadeLivrosCadastrados() {
        LivroModel livroModel = new LivroModel();
        try {
            this.conectar();
            this.executarSQL("SELECT COUNT(*) FROM tbl_livro;");
            while (this.getResultSet().next()) {
                livroModel.setQtdeLivro(this.getResultSet().getInt(1));
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar a quantidade dos livros!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return livroModel;
    }

    @Override
    public boolean alterarEstoqueLivrosDAO(LivroModel pLivroModel) {
        try {
            this.conectar();
            this.executarInsertUpdateSQL(
                    "UPDATE tbl_livro SET quantidade_livro = '" + pLivroModel.getQtdeLivro()
                    + "' WHERE pk_id_livro = '" + pLivroModel.getIdLivro() + "'");

            return true;
        } catch (Exception e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
