package com.biblioteca.service;

import com.biblioteca.model.LocadorModel;
import com.biblioteca.model.dao.LocadorDao;
import java.util.ArrayList;

/**
 *
 * @author José Luiz
 */
public class LocadorService {

    /**
     * criação da instancia da classe LocadorDAO que se comunica diretamente com
     * o banco de dados
     */
    LocadorDao locadorDao = new LocadorDao();

    /**
     * metodo para salvar um locador
     *
     * @param pLocadorModel
     * @return
     */
    public boolean salvarLocadorDAO(LocadorModel pLocadorModel) {
        return locadorDao.salvarLocadorDAO(pLocadorModel);
    }

    /**
     * retorna um locador pela chave primaria dele
     *
     * @param pIdLocador
     * @return
     */
    public LocadorModel getLocadorDAO(int pIdLocador) {
        return locadorDao.getLocadorDAO(pIdLocador);
    }

    /**
     * retorna um locador pelo nome dele
     *
     * @param pLocadorModel
     * @return
     */
    public LocadorModel getLocadorDAO(String pLocadorModel) {
        return locadorDao.getLocadorDAO(pLocadorModel);
    }

    /**
     * retorna uma lista com todos os locadores cadastrados
     *
     * @return
     */
    public ArrayList<LocadorModel> getListaLocadorDAO() {
        return locadorDao.getListaLocadorDAO();
    }

    /**
     * atualiza um locador (pela chave primaria)
     *
     * @param pLocadorModel
     * @return
     */
    public boolean atualizarLocadorDAO(LocadorModel pLocadorModel) {
        return locadorDao.atualizarLocadorDAO(pLocadorModel);
    }

    /**
     * exclui um locador pela chave primaria
     *
     * @param idLocadorModel
     * @return
     */
    public boolean excluirLocadorDAO(int idLocadorModel) {
        return locadorDao.excluirLocadorDAO(idLocadorModel);
    }
}
