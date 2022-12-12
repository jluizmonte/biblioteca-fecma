package com.biblioteca.service;

import com.biblioteca.model.LocatarioModel;
import com.biblioteca.model.dao.LocatarioDao;
import java.util.ArrayList;

/**
 *
 * @author José Luiz
 */
public class LocatarioService {

    LocatarioDao locatarioDao = new LocatarioDao();

    public boolean salvarLocatarioDAO(LocatarioModel pLocatarioModel) {
        return locatarioDao.salvarLocatarioDAO(pLocatarioModel);
    }

    public LocatarioModel getLocatarioDAO(int pIdLocatario) {
        return locatarioDao.getLocatarioDAO(pIdLocatario);
    }

    public LocatarioModel getLocatarioDAO(String pLocatarioModel) {
        return locatarioDao.getLocatarioDAO(pLocatarioModel);
    }

    public ArrayList<LocatarioModel> getListaLocatarioDAO() {
        return locatarioDao.getListaLocatarioDAO();
    }

    public boolean atualizarLocatarioDAO(LocatarioModel pLocatarioModel) {
        return locatarioDao.atualizarLocatarioDAO(pLocatarioModel);
    }

    public boolean excluirLocatarioDAO(int idLocatarioModel) {
        return locatarioDao.excluirLocatarioDAO(idLocatarioModel);
    }
}
