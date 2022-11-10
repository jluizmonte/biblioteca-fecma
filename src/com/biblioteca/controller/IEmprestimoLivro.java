package com.biblioteca.controller;

import com.biblioteca.model.EmprestimoLivroModel;
import com.biblioteca.model.EmprestimoModel;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public interface IEmprestimoLivro {

    public boolean salvarEmprestimosLivrosDAO(EmprestimoLivroModel pModelEmprestimosLivros);

    public boolean salvarEmprestimosLivrosDAO(ArrayList<EmprestimoModel> plistaModelEmprestimosLivros);

    public boolean excluirEmprestimosLivrosDAO(int pIdEmprestimoLivro);

    public boolean atualizarEmprestimosLivrosDAO(EmprestimoLivroModel pModelEmprestimosLivros);

    public ArrayList<EmprestimoLivroModel> getListaEmprestimosLivrosDAO();

    public EmprestimoModel getEmprestimosLivrosDAO(int pIdEmprestimoLivro);

}
