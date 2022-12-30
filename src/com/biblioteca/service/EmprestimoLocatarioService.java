package com.biblioteca.service;

import com.biblioteca.model.EmprestimoLocatarioModel;
import com.biblioteca.model.dao.EmprestimoLocatarioDao;
import java.util.ArrayList;

/**
 *
 * @author José Luiz
 */
public class EmprestimoLocatarioService {

    EmprestimoLocatarioDao emprestimoLocatarioDao = new EmprestimoLocatarioDao();

    public ArrayList<EmprestimoLocatarioModel> getListaEmprestimosLocatarioDAO() {
        return emprestimoLocatarioDao.getListaEmprestimosLocatarioDAO();
    }
}
