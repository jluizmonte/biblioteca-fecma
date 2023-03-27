package com.biblioteca.service;

import com.biblioteca.model.EmprestimoModel;
import com.biblioteca.model.dao.EmprestimoDao;
import java.util.ArrayList;

/**
 *
 * @author José Luiz
 */
public class EmprestimoService {

    EmprestimoDao emprestimoDao = new EmprestimoDao();

    public int salvarEmprestimoDAO(EmprestimoModel pEmprestimoModel) {
        return emprestimoDao.salvarEmprestimoDAO(pEmprestimoModel);
    }

    public EmprestimoModel getEmprestimoDAO(int pIdEmprestimo) {
        return emprestimoDao.getEmprestimoDAO(pIdEmprestimo);
    }

    public ArrayList<EmprestimoModel> getListaEmprestimoDAO() {
        return emprestimoDao.getListaEmprestimoDAO();
    }

    public boolean atualizarEmprestimoDAO(EmprestimoModel pEmprestimoModel) {
        return emprestimoDao.atualizarEmprestimoDAO(pEmprestimoModel);
    }

    public boolean excluirEmprestimoDAO(int pIdEmprestimoModel) {
        return emprestimoDao.excluirEmprestimoDAO(pIdEmprestimoModel);
    }

    public EmprestimoModel getQuantidadeEmprestimo() {
        return emprestimoDao.getQuantidadeEmprestimo();
    }

    public boolean salvarEmprestimosDAO(ArrayList<EmprestimoModel> plistaModelEmprestimos) {
        return emprestimoDao.salvarEmprestimosDAO(plistaModelEmprestimos);
    }

    /**
     * retorna uma lista de emprestimo com JOIN
     *
     * @return
     */
    public ArrayList<EmprestimoModel> getEmprestimoListaDAO() {
        return emprestimoDao.getEmprestimoListaDAO();
    }
}
