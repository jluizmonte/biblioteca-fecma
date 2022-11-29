package com.biblioteca.controller;

import com.biblioteca.model.UsuarioModel;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public interface IUsuario {

    /**
     * salva o regsitro de um usuario
     *
     * @param pUsuarioModel
     * @return
     */
    public boolean salvarUsuarioDAO(UsuarioModel pUsuarioModel);

    /**
     * retorna o usuario pelo ID
     *
     * @param pIdUsuario
     * @return
     */
    public UsuarioModel getUsuarioDAO(int pIdUsuario);

    /**
     * retorna o usuario pelo login
     *
     * @param pLogin
     * @return
     */
    public UsuarioModel getUsuarioDAO(String pLogin);

    /**
     * retorna uma lista com os usuarios cadastrados
     *
     * @return
     */
    public ArrayList<UsuarioModel> getListaUsuarioDAO();

    /**
     * atualiza um usuario
     *
     * @param pUsuarioModel
     * @return
     */
    public boolean atualizarUsuarioDAO(UsuarioModel pUsuarioModel);

    /**
     * exclui, pelo ID, um usuario
     *
     * @param pIdUsuario
     * @return
     */
    public boolean excluirUsuarioDAO(int pIdUsuario);

    /**
     * valida o usuario na teal de login
     *
     * @param pUsuarioModel
     * @return
     */
    public boolean getValidarUsuarioDAO(UsuarioModel pUsuarioModel);

    /**
     * retorna a quantidade de usuarios cadastrados no sistema
     *
     * @return
     */
    public UsuarioModel getQuantidadeUsuariosCadastrados();
}
