package com.biblioteca.service;

import com.biblioteca.model.UsuarioModel;
import com.biblioteca.model.dao.UsuarioDao;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class UsuarioService {

    UsuarioDao usuarioDao = new UsuarioDao();

    public boolean salvarUsuarioDAO(UsuarioModel pUsuarioModel) {
        return usuarioDao.salvarUsuarioDAO(pUsuarioModel);
    }

    public UsuarioModel getUsuarioDAO(int pIdUsuario) {
        return usuarioDao.getUsuarioDAO(pIdUsuario);
    }
    public UsuarioModel getUsuarioDAO(String pLogin) {
        return usuarioDao.getUsuarioDAO(pLogin);
    }
    public ArrayList<UsuarioModel> getListaUsuarioDAO() {
        return usuarioDao.getListaUsuarioDAO();
    }

    public boolean atualizarUsuarioDAO(UsuarioModel pUsuarioModel) {
        return usuarioDao.atualizarUsuarioDAO(pUsuarioModel);
    }

    public boolean excluirUsuarioDAO(int pIdUsuario) {
        return usuarioDao.excluirUsuarioDAO(pIdUsuario);
    }

    public int getQuantidadeUsuariosCadastrados() {
        return usuarioDao.getQuantidadeUsuariosCadastrados();
    }
}
