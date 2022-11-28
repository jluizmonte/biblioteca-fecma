package com.biblioteca.model.dao;

import com.biblioteca.controller.IEmprestimoLocatario;
import com.biblioteca.model.EmprestimoLocatarioModel;
import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class EmprestimoLocatarioDao extends MysqlConnectionPoolDataSource implements IEmprestimoLocatario {

    @Override
    public ArrayList<EmprestimoLocatarioModel> getListaEmprestimosLocatarioDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
