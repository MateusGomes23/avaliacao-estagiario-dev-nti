/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.projeto.dao;

import br.com.projeto.jdbc.ConexaoDB;
import br.com.projeto.model.Cliente;
import java.awt.HeadlessException;
//import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus José
 */
public class ClienteDAO {
    private Connection conexao;
    
    public ClienteDAO(){
        this.conexao = new ConexaoDB().pegarConexao();   
    }
    
    //cadastro de cliente
    public void cadastrarCliente(Cliente obj){
        try {
            //criar a sql
            String sql = "insert into tb_clientes (nome, rg, cpf, email, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado) +  values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            //preparar a sql
            PreparedStatement stmt;
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(2, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setString(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getEstado());
            
            //executar a stmt
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "cliente cadastrado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nao cadastrou o cliente" + e);
        }
    }
}


