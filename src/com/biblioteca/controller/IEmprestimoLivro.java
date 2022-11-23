package com.biblioteca.controller;

import com.biblioteca.model.EmprestimoLivroModel;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public interface IEmprestimoLivro {

    public boolean salvarEmprestimosLivrosDAO(EmprestimoLivroModel pModelEmprestimosLivros);
    public boolean salvarEmprestimosLivrosDAO(ArrayList<EmprestimoLivroModel> plistaModelEmprestimosLivros);
    public boolean excluirEmprestimosLivrosDAO(int pIdEmprestimoLivro);
    public boolean atualizarEmprestimosLivrosDAO(EmprestimoLivroModel pModelEmprestimosLivros);
    public ArrayList<EmprestimoLivroModel> getListaEmprestimosLivrosDAO();
    public EmprestimoLivroModel getEmprestimosLivrosDAO(int pIdEmprestimoLivro);
}
