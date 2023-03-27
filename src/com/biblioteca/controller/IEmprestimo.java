package com.biblioteca.controller;

import com.biblioteca.model.EmprestimoModel;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public interface IEmprestimo {

    /**
     * salva o emprestimo realizado
     *
     * @param pEmprestimoModel
     * @return
     */
    public int salvarEmprestimoDAO(EmprestimoModel pEmprestimoModel);

    /**
     * salva uma lista de emprestimo de livros
     *
     * @param plistaModelEmprestimos
     * @return
     */
    public boolean salvarEmprestimosDAO(ArrayList<EmprestimoModel> plistaModelEmprestimos);

    /**
     * retorna, pelo ID, um emprestimo
     *
     * @param pIdEmprestimo
     * @return
     */
    public EmprestimoModel getEmprestimoDAO(int pIdEmprestimo);

    /**
     * retorna uma lista de emprestimos cadastrados
     *
     * @return
     */
    public ArrayList<EmprestimoModel> getListaEmprestimoDAO();

    /**
     * atualizar um emprestimo
     *
     * @param pEmprestimoModel
     * @return
     */
    public boolean atualizarEmprestimoDAO(EmprestimoModel pEmprestimoModel);

    /**
     * excluir um emprestimo salvo
     *
     * @param pIdEmprestimoModel
     * @return
     */
    public boolean excluirEmprestimoDAO(int pIdEmprestimoModel);

    /**
     * retorna a quantidade de emprestimo
     *
     * @return
     */
    public EmprestimoModel getQuantidadeEmprestimo();

    public ArrayList<EmprestimoModel> getEmprestimoListaDAO();
}
