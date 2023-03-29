package com.biblioteca.controller;

import com.biblioteca.model.LivroModel;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public interface ILivro {

    /**
     * salva um novo livro
     *
     * @param pLivroModel
     * @return
     */
    public boolean salvarLivroDAO(LivroModel pLivroModel);

    /**
     * retorna o livro pelo ID
     *
     * @param pIdLivro
     * @return
     */
    public LivroModel getLivroDAO(int pIdLivro); // recupera livro pela pk

    /**
     * retorna o livro pelo titulo
     *
     * @param pLivroModel
     * @return
     */
    public LivroModel getLivroDAO(String pLivroModel); // recupera livro pelo titulo

    /**
     * retorna uma lista com os livros cadastrados
     *
     * @return
     */
    public ArrayList<LivroModel> getListaLivroDAO();

    /**
     * atualiza um livro cadastrado
     *
     * @param pLivroModel
     * @return
     */
    public boolean atualizarLivroDAO(LivroModel pLivroModel);

    /**
     * exclui o livro pelo id
     *
     * @param idLivroModel
     * @return
     */
    public boolean excluirLivroDAO(int idLivroModel);

    /**
     * altera o estoque de livros (quantidade salva)
     *
     * @param pLivroModel
     * @return
     */
    public boolean alterarEstoqueLivrosDAO(LivroModel pLivroModel);

    /**
     *
     * @param pListaLivroModel
     * @return
     */
    public boolean alterarEstoqueListaLivrosDAO(ArrayList<LivroModel> pListaLivroModel);

    /**
     * retorna a quantidade de livros cadastrados
     *
     * @return
     */
    public LivroModel getQuantidadeLivrosCadastrados();
}
