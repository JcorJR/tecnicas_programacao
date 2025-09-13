package br.edu.fatecpg.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ViaCepController {
    public void adicionarEndereco(Endereco end){
        String sql = "INSERT INTO tb_endereco (cep, logradouro, complemento, bairro, localidade, uf)VALUES(?, ?, ?, ?, ?, ?)";

        try(Connection cone = Conexao.conectar();PreparedStatement stmt = cone.prepareStatement(sql)) {
            stmt.setString(1,end.getCep());
            stmt.setString(2,end.getLogradouro());
            stmt.setString(3,end.getComplemento());
            stmt.setString(4,end.getBairro());
            stmt.setString(5,end.getLocalidade());
            stmt.setString(6,end.getUf());
            stmt.executeUpdate();
            System.out.println("Endereço foi cadastrado");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar novo enderoço: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Endereco> listarEndereco(){
        List<Endereco> endereco = new ArrayList<>();
        String sql = "SELECT * FROM tb_endereco";

        try(Connection cone = Conexao.conectar(); PreparedStatement stmt = cone.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while(rs.next()){
                Endereco end = new Endereco(
                    rs.getString("cep"),
                    rs.getString("logradouro"),
                    rs.getString("complemento"),
                    rs.getString("bairro"),
                    rs.getString("localidade"),
                    rs.getString("uf")
                );
                endereco.add(end);
            }
        } catch (SQLException e) {
            System.out.println("Erro na busca: " + e.getMessage());
            e.printStackTrace();
        }
        return endereco;
    }

    public List<Endereco> buscarEnderecos(String cep){
        List<Endereco> enderecos = new ArrayList<>();
        String sql = "SELECT * FROM tb_endereco WHERE cep=?";

        try(Connection cone = Conexao.conectar()){
            if(cone == null) return enderecos;

            try(PreparedStatement stmt = cone.prepareStatement(sql)) {
                stmt.setString(1, cep);

                try(ResultSet rs = stmt.executeQuery()) {
                    while(rs.next()){
                        Endereco end = new Endereco(
                                rs.getString("cep"),
                                rs.getString("logradouro"),
                                rs.getString("complemento"),
                                rs.getString("bairro"),
                                rs.getString("localidade"),
                                rs.getString("uf")
                        );
                        enderecos.add(end);
                    }
                }
            }

        } catch(SQLException e){
            System.out.println("Erro na busca de endereços: " + e.getMessage());
            e.printStackTrace();
        }
        return enderecos;
    }

}
