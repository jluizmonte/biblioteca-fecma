package com.biblioteca.model;

import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class EmprestimoLocatarioModel {

    private EmprestimoModel emprestimoModel;
    private LocatarioModel locatarioModel;
    private LocadorModel locadorModel;
    private LivroModel livroModel;
    private EmprestimoLivroModel emprestimoLivroModel;
    private ArrayList<EmprestimoLivroModel> listaEmprestimoLivroModel;

    public EmprestimoModel getEmprestimoModel() {
        return emprestimoModel;
    }

    public void setEmprestimoModel(EmprestimoModel emprestimoModel) {
        this.emprestimoModel = emprestimoModel;
    }

    public LocatarioModel getLocatarioModel() {
        return locatarioModel;
    }

    public void setLocatarioModel(LocatarioModel locatarioModel) {
        this.locatarioModel = locatarioModel;
    }

    public LocadorModel getLocadorModel() {
        return locadorModel;
    }

    public void setLocadorModel(LocadorModel locadorModel) {
        this.locadorModel = locadorModel;
    }

    public LivroModel getLivroModel() {
        return livroModel;
    }

    public void setLivroModel(LivroModel livroModel) {
        this.livroModel = livroModel;
    }

    public EmprestimoLivroModel getEmprestimoLivroModel() {
        return emprestimoLivroModel;
    }

    public void setEmprestimoLivroModel(EmprestimoLivroModel emprestimoLivroModel) {
        this.emprestimoLivroModel = emprestimoLivroModel;
    }

    public ArrayList<EmprestimoLivroModel> getListaEmprestimoLivroModel() {
        return listaEmprestimoLivroModel;
    }

    public void setListaEmprestimoLivroModel(ArrayList<EmprestimoLivroModel> listaEmprestimoLivroModel) {
        this.listaEmprestimoLivroModel = listaEmprestimoLivroModel;
    }

}
