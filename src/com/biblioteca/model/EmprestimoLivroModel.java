package com.biblioteca.model;

/**
 *
 * @author Instrutores
 */
public class EmprestimoLivroModel {

    private int idEmprestimoLivro;
    private int idLivro;
    private int idEmprestimo;
    private int quantidadeEmprestimo;

    public void teste(){
        
    }
    public int getIdEmprestimoLivro() {
        return idEmprestimoLivro;
    }

    public void setIdEmprestimoLivro(int idEmprestimoLivro) {
        this.idEmprestimoLivro = idEmprestimoLivro;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getQuantidadeEmprestimo() {
        return quantidadeEmprestimo;
    }

    public void setQuantidadeEmprestimo(int quantidadeEmprestimo) {
        this.quantidadeEmprestimo = quantidadeEmprestimo;
    }

}
