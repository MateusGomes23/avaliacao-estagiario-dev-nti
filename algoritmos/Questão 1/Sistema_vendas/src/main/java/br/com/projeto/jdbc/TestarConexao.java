/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.jdbc;

import javax.swing.JOptionPane;



/**
 *
 * @author Mateus José
 */
public class TestarConexao {
    public static void main(String[] args){
        try {
            new ConexaoDB().pegarConexao();
            JOptionPane.showMessageDialog(null,"conetado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro" + e);
        }
    }
}
