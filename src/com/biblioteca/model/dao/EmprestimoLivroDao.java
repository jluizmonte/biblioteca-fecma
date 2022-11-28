package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.IEmprestimoLivro;
import com.biblioteca.model.EmprestimoLivroModel;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class EmprestimoLivroDao extends ConnectionMySQL implements IEmprestimoLivro {

    @Override
    public boolean salvarEmprestimosLivrosDAO(EmprestimoLivroModel pModelEmprestimosLivros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean salvarEmprestimosLivrosDAO(ArrayList<EmprestimoLivroModel> plistaModelEmprestimosLivros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluirEmprestimosLivrosDAO(int pIdEmprestimoLivro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean atualizarEmprestimosLivrosDAO(EmprestimoLivroModel pModelEmprestimosLivros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<EmprestimoLivroModel> getListaEmprestimosLivrosDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmprestimoLivroModel getEmprestimosLivrosDAO(int pIdEmprestimoLivro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
