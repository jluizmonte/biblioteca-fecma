package com.biblioteca.model;

import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class EmprestimoModel {

    private int idEmprestimo;
    private int idLocatario;
    private int idLocador;
    private int idLivro;
    private String dataEmprestimo;
    private String dataDevolucao;
    private int quantidadeEmprestimo;
    private String statusEmprestimo;
    private LocatarioModel locatarioModel;
    private LocadorModel locadorModel;
    private LivroModel livroModel;
    private ArrayList<EmprestimoModel> listaEmprestimoModel;
    private int idEmprestimoLivro;

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdLocatario() {
        return idLocatario;
    }

    public void setIdLocatario(int idLocatario) {
        this.idLocatario = idLocatario;
    }

    public int getIdLocador() {
        return idLocador;
    }

    public void setIdLocador(int idLocador) {
        this.idLocador = idLocador;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }
    
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(String statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }

    public int getQuantidadeEmprestimo() {
        return quantidadeEmprestimo;
    }

    public void setQuantidadeEmprestimo(int quantidadeEmprestimo) {
        this.quantidadeEmprestimo = quantidadeEmprestimo;
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

    public ArrayList<EmprestimoModel> getListaEmprestimoModel() {
        return listaEmprestimoModel;
    }

    public void setListaEmprestimoModel(ArrayList<EmprestimoModel> listaEmprestimoModel) {
        this.listaEmprestimoModel = listaEmprestimoModel;
    }

    public int getIdEmprestimoLivro() {
        return idEmprestimoLivro;
    }

    public void setIdEmprestimoLivro(int idEmprestimoLivro) {
        this.idEmprestimoLivro = idEmprestimoLivro;
    }

}
