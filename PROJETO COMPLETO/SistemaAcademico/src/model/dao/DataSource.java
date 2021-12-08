/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 
 */
public class DataSource {
    
    private String hostname;
    private int    port;
    private String database;
    private String username;
    private String password;
    
    private Connection Connection;
    
    public DataSource(){
       try{
           hostname = "localhost";
           port     = 3306;
           database = "DB_SISA";
           username = "root";
           password = "";
           
           String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
           
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           
       } 
       catch(SQLException ex){
           System.err.println("ERRO na conexão."+ex.getMessage());
           
       }
       catch(Exception ex){
           System.err.println("ERRO Geral."+ex.getMessage());
           
       }
    }
    
    public Connection getConnection(){
        return this.Connection;
    }
    public void closeDataSource(){
        
    }
}
