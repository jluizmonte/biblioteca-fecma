package com.biblioteca.model;

/**
 *
 * @author Instrutores
 */
public class LivroModel {

    private int idLivro;
    private String tipoLivro; // venda ou empréstimo
    private String tituloLivro;
    private String autor1Livro;
    private String editoraLivro;
    private String anoLivro;
    private String generoLivro;
    private String dataCadastroLivro;
    private String descricaoLivro;
    private int qtdeLivro;
    private String estadoLivro; // conservado, usado, novo etc
    private double valorLivro;

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTipoLivro() {
        return tipoLivro;
    }

    public void setTipoLivro(String tipoLivro) {
        this.tipoLivro = tipoLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutor1Livro() {
        return autor1Livro;
    }

    public void setAutor1Livro(String autor1Livro) {
        this.autor1Livro = autor1Livro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public String getAnoLivro() {
        return anoLivro;
    }

    public void setAnoLivro(String anoLivro) {
        this.anoLivro = anoLivro;
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }

    public String getDataCadastroLivro() {
        return dataCadastroLivro;
    }

    public void setDataCadastroLivro(String dataCadastroLivro) {
        this.dataCadastroLivro = dataCadastroLivro;
    }

    public String getDescricaoLivro() {
        return descricaoLivro;
    }

    public void setDescricaoLivro(String descricaoLivro) {
        this.descricaoLivro = descricaoLivro;
    }

    public int getQtdeLivro() {
        return qtdeLivro;
    }

    public void setQtdeLivro(int qtdeLivro) {
        this.qtdeLivro = qtdeLivro;
    }

    public String getEstadoLivro() {
        return estadoLivro;
    }

    public void setEstadoLivro(String estadoLivro) {
        this.estadoLivro = estadoLivro;
    }

    public double getValorLivro() {
        return valorLivro;
    }

    public void setValorLivro(double valorLivro) {
        this.valorLivro = valorLivro;
    }

}
