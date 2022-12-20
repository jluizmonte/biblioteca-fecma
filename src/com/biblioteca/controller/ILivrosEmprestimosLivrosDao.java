package com.biblioteca.controller;

import com.biblioteca.model.LivrosEmprestimosLivrosModel;
import java.util.ArrayList;

/**
 *
 * @author joseluiz
 */
public interface ILivrosEmprestimosLivrosDao {

    public ArrayList<LivrosEmprestimosLivrosModel> getListaLivrosEmprestimoLivrosDAO(int pCodigoEmprestimo);

}
