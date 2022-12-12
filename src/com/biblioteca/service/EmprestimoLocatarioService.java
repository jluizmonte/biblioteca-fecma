/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.service;

import com.biblioteca.model.EmprestimoLocatarioModel;
import com.biblioteca.model.dao.EmprestimoLocatarioDao;
import java.util.ArrayList;

/**
 *
 * @author José Luiz
 */
public class EmprestimoLocatarioService {

    EmprestimoLocatarioDao emprestimoLocatarioDao = new EmprestimoLocatarioDao();

    public ArrayList<EmprestimoLocatarioModel> getListaEmprestimosLocatarioDAO() {
        return emprestimoLocatarioDao.getListaEmprestimosLocatarioDAO();
    }
}
