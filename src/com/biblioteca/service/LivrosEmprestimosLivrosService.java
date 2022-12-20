package com.biblioteca.service;

import com.biblioteca.model.LivrosEmprestimosLivrosModel;
import com.biblioteca.model.dao.LivrosEmprestimosLivrosDao;
import java.util.ArrayList;

/**
 *
 * @author joseluiz
 */
public class LivrosEmprestimosLivrosService {

    LivrosEmprestimosLivrosDao livrosEmprestimosLivrosDao = new LivrosEmprestimosLivrosDao();

    public ArrayList<LivrosEmprestimosLivrosModel> getListaLivrosEmprestimosLivrosDAO(int pCodigoEmprestimo) {
        return livrosEmprestimosLivrosDao.getListaLivrosEmprestimoLivrosDAO(pCodigoEmprestimo);
    }
}
