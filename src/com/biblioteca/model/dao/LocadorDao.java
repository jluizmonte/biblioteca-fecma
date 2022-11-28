package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.ILocador;
import com.biblioteca.model.LocadorModel;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class LocadorDao extends ConnectionMySQL implements ILocador {

    @Override
    public boolean salvarLocadorDAO(LocadorModel pLocadorModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LocadorModel getLocadorDAO(int pIdLocador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LocadorModel getLocadorDAO(String pLocadorModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<LocadorModel> getListaLocadorDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean atualizarLocadorDAO(LocadorModel pLocadorModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluirLocadorDAO(int idLocadorModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
