package com.biblioteca.controller;

import com.biblioteca.model.LocatarioModel;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public interface ILocatario {

    /**
     * salva os dados do locatario cadastrado
     *
     * @param pLocatarioModel
     * @return
     */
    public boolean salvarLocatarioDAO(LocatarioModel pLocatarioModel);

    /**
     * recupera o locatario definido pelo ID
     *
     * @param pIdLocatario
     * @return
     */
    public LocatarioModel getLocatarioDAO(int pIdLocatario); 

    /**
     * recupera o locatario pelo nome
     *
     * @param pLocatarioModel
     * @return
     */
    public LocatarioModel getLocatarioDAO(String pLocatarioModel); 

    /**
     * cria uma lista com todos os locatarios cadastrados
     *
     * @return
     */
    public ArrayList<LocatarioModel> getListaLocatarioDAO();

    /**
     * atualiza o registro de um locatartio
     *
     * @param pLocatarioModel
     * @return
     */
    public boolean atualizarLocatarioDAO(LocatarioModel pLocatarioModel);

    /**
     * excluir, pelo ID, o locatario
     *
     * @param idLocatarioModel
     * @return
     */
    public boolean excluirLocatarioDAO(int idLocatarioModel);
}
