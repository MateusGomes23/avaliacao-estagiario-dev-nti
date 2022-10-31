/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus José
 */
public class ConexaoDB {
    public Connection pegarConexao(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/sistemavendasdb","root", "");
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null,"erro"  + e);
        }
        return null;
    }
}
