package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.controller.ILocatario;
import com.biblioteca.model.LocatarioModel;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class LocatarioDao extends ConnectionMySQL implements ILocatario{

    @Override
    public boolean salvarLocatarioDAO(LocatarioModel pLocatarioModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LocatarioModel getLocatarioDAO(int pIdLocatario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LocatarioModel getLocatarioDAO(String pLocatarioModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<LocatarioModel> getListaLocatarioDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean atualizarLocatarioDAO(LocatarioModel pLocatarioModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluirLocatarioDAO(int idLocatarioModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
