package com.biblioteca.service;

import com.biblioteca.model.EmprestimoLivroModel;
import com.biblioteca.model.dao.EmprestimoLivroDao;
import java.util.ArrayList;

/**
 *
 * @author José Luiz
 */
public class EmprestimoLivroService {

    EmprestimoLivroDao emprestimoLivroDao = new EmprestimoLivroDao();

    public boolean salvarEmprestimosLivrosDAO(EmprestimoLivroModel pModelEmprestimosLivros) {
        return emprestimoLivroDao.salvarEmprestimosLivrosDAO(pModelEmprestimosLivros);
    }

    public boolean salvarEmprestimosLivrosDAO(ArrayList<EmprestimoLivroModel> plistaModelEmprestimosLivros) {
        return emprestimoLivroDao.salvarEmprestimosLivrosDAO(plistaModelEmprestimosLivros);
    }

    public boolean excluirEmprestimosLivrosDAO(int pIdEmprestimoLivro) {
        return emprestimoLivroDao.excluirEmprestimosLivrosDAO(pIdEmprestimoLivro);
    }

    public boolean atualizarEmprestimosLivrosDAO(EmprestimoLivroModel pModelEmprestimosLivros) {
        return emprestimoLivroDao.atualizarEmprestimosLivrosDAO(pModelEmprestimosLivros);
    }

    public ArrayList<EmprestimoLivroModel> getListaEmprestimosLivrosDAO() {
        return emprestimoLivroDao.getListaEmprestimosLivrosDAO();
    }

    public EmprestimoLivroModel getEmprestimosLivrosDAO(int pIdEmprestimoLivro) {
        return emprestimoLivroDao.getEmprestimosLivrosDAO(pIdEmprestimoLivro);
    }

}
