package com.biblioteca.connection;

import com.biblioteca.util.CaminhosIcones;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ConnectionMySQL {

    CaminhosIcones c = new CaminhosIcones();

    private Connection con = null;
    private Statement statement;
    private ResultSet resultSet;
    private boolean status = false;
    //   private String servidor = "192.168.1.138";
    private String servidor = "localhost";
    private String banco = "livraria";
 //   private String usuario = "root";
   private String usuario = "fecma";
    private String senha = "Fecma@1946";

    /**
     *
     * @return getCon() retorna a conexão com sucesso ou não
     */
    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://" + servidor + "/" + banco + "?autoReconnect=true&useSSL=false";
            this.setCon(DriverManager.getConnection(url, usuario, senha));
            this.status = true;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao MySQL\nBanco de dados indisponível!",
                    "Erro", JOptionPane.PLAIN_MESSAGE, c.excluirGif);
            System.out.print(e.toString());
        }
        return this.getCon();
    }

    /**
     *
     * @param pSQL
     * @return metodo para executar consultas SQL SELECT
     */
    public boolean executarSQL(String pSQL) {
        try {
            this.setStatement(getCon().createStatement());
            // ResultSet rs = getStatement().executeQuery(pSQL);
            setResultSet(getStatement().executeQuery(pSQL));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO AO EXECUTAR A INSTRUÇÃO SQL\n ERRO AO CONECTAR AO BANCO DE DADOS", "ERRO", JOptionPane.PLAIN_MESSAGE, c.excluirGif);
            System.out.println(e.toString());
            return false;
        }
        return true;
    }

    public int retornarUltimoID(String pSQL) {
        int ultimoID = 0;
        try {
            this.setStatement(getCon().createStatement());
            this.setResultSet(this.getStatement().executeQuery(pSQL));
            while (this.resultSet.next()) {
                ultimoID = this.resultSet.getInt(1) + 1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
            return 0;
        }
        return ultimoID;
    }

    /**
     *
     * @param pSQL
     * @return INSERT UPDATE e DELETE
     */
    public boolean executarInsertUpdateSQL(String pSQL) {
        try {
            this.setStatement(getCon().createStatement());
            getStatement().executeUpdate(pSQL);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir/atualizar registro!\n" + e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public int insertSQL(String pSQL) {
        int status = 0;
        try {
            // createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(pSQL);

            // consulta o ultimo id inserido
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));

            // recupera o ultimo id inserido
            while (this.resultSet.next()) {
                status = this.resultSet.getInt(1);
            }
            // retorna o ultimo id inserido
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
    }

    /**
     *
     * @return boolean metodo para fechar a conexão
     */
    public boolean fecharConexao() {
        try {
            if (this.getResultSet() != null && (this.statement != null)) {
                this.getResultSet().close();
                this.statement.close();
            }
            this.getCon().close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
