package com.biblioteca.service;

import com.biblioteca.model.LivroModel;
import com.biblioteca.model.dao.LivroDao;
import java.util.ArrayList;

/**
 *
 * @author José Luiz
 */
public class LivroService {

    LivroDao livroDao = new LivroDao();

    public boolean salvarLivroDAO(LivroModel pLivroModel) {
        return livroDao.salvarLivroDAO(pLivroModel);
    }

    public LivroModel getLivroDAO(int pIdLivro) {
        return livroDao.getLivroDAO(pIdLivro);
    }

    public LivroModel getLivroDAO(String pLivroModel) {
        return livroDao.getLivroDAO(pLivroModel);
    }

    public ArrayList<LivroModel> getListaLivroDAO() {
        return livroDao.getListaLivroDAO();
    }

    public ArrayList<LivroModel> getListaLivroEmprestimoDAO() {
        return livroDao.getListaLivroEmprestimoDAO();
    }

    public boolean atualizarLivroDAO(LivroModel pLivroModel) {
        return livroDao.atualizarLivroDAO(pLivroModel);
    }

    public boolean excluirLivroDAO(int idLivroModel) {
        return livroDao.excluirLivroDAO(idLivroModel);
    }

    public boolean alterarEstoqueLivrosDAO(LivroModel pLivroModel) {
        return livroDao.alterarEstoqueLivrosDAO(pLivroModel);
    }

    public boolean alterarEstoqueListaLivrosDAO(ArrayList<LivroModel> plistaLivroModels) {
        return livroDao.alterarEstoqueListaLivrosDAO(plistaLivroModels);
    }

    public LivroModel getQuantidadeLivrosCadastrados() {
        return livroDao.getQuantidadeLivrosCadastrados();
    }

    public int ultimoIdLivro() {
        return livroDao.ultimoIdLivro();
    }
}
