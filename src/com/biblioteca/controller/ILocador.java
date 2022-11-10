package com.biblioteca.controller;

import com.biblioteca.model.LocadorModel;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public interface ILocador {

    /**
     * salva o registro do locador
     *
     * @param pLocadorModel
     * @return
     */
    public boolean salvarLocadorDAO(LocadorModel pLocadorModel);

    /**
     * retorna, pelo ID, o locador
     *
     * @param pIdLocador
     * @return
     */
    public LocadorModel getLocadorDAO(int pIdLocador); // recupera locador pela pk

    /**
     * retorna, pelo nome, o locador
     *
     * @param pLocadorModel
     * @return
     */
    public LocadorModel getLocadorDAO(String pLocadorModel); // recupera locador pelo titulo

    /**
     * cria uma lista com os locadores cadastrados
     *
     * @return
     */
    public ArrayList<LocadorModel> getListaLocadorDAO();

    /**
     * atualiza o registro de um locador
     *
     * @param pLocadorModel
     * @return
     */
    public boolean atualizarLocadorDAO(LocadorModel pLocadorModel);

    /**
     * exclui o locador pelo ID
     *
     * @param idLocadorModel
     * @return
     */
    public boolean excluirLocadorDAO(int idLocadorModel);

}
