package br.edu.fatecpg.model;


import javax.management.Query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TarefaController {

   public void adicionarTarefa(Tarefas tarefa){
        String sql = "INSERT INTO tb_tarefa (nm_tarefa,ds_tarefa,ds_categoria,ic_status) VALUES(?, ?, ?, ?)";

        try (Connection con = Conexao.conectar(); PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1,tarefa.getTitulo());
            stmt.setString(2,tarefa.getDescricao());
            stmt.setString(3,tarefa.getCategoria());
            stmt.setBoolean(4,tarefa.isStatus());
            stmt.executeUpdate();
            System.out.println("Tarefa adiocinada com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Não foi possivel adicionar a tarefa!");
        }
   }

   public void atualizarTarefa(int id,String nTitulo, String nDesc, String nCat){
       String sql = "UPDATE tb_tarefa SET nm_tarefa=? ,ds_tarefa=? ,ds_categoria=? WHERE id_tarefa=?";

       try(Connection con = Conexao.conectar(); PreparedStatement stmt = con.prepareStatement(sql)){
           stmt.setString(1,nTitulo);
           stmt.setString(2,nDesc);
           stmt.setString(3,nCat);
           stmt.setInt(4,id);
           stmt.executeUpdate();
           System.out.println("Tarefa atualizada");
       } catch (SQLException e) {
           e.printStackTrace();
           System.out.println("Não foi possivel atualizar a tarefa");
       }
   }

   public void deletarTarefa(int id){
       String sql = "DELETE FROM tb_tarefa WHERE id_tarefa=?";
       try(Connection con = Conexao.conectar(); PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1,id);
            stmt.executeUpdate();
           System.out.println("Tarefa deletada");
       }catch (SQLException e){
           e.printStackTrace();
           System.out.println("Não foi possivel deletar a tarefa");
       }
   }
   public void concluirTarefa(int id){
       String sql = "UPDATE tb_tarefa SET ic_status=? WHERE id_tarefa=?";

       try(Connection con = Conexao.conectar(); PreparedStatement stmt = con.prepareStatement(sql)){
           stmt.setBoolean(1,true);
           stmt.setInt(2,id);
           stmt.executeUpdate();
           System.out.println("Tarefa concluida com sucesso!");
       }catch (SQLException e){
           e.printStackTrace();
           System.out.println("faiou (;-;)");
       }
   }
   public List<Tarefas> listarTarefas(){
       List<Tarefas> tarefa = new ArrayList<>();
       String sql = "SELECT * FROM tb_tarefa";

       try(Connection con = Conexao.conectar(); PreparedStatement stmt = con.prepareStatement(sql); ResultSet rs = stmt.executeQuery()){
            while(rs.next()){
                Tarefas tarefas = new Tarefas(
                        rs.getInt("id_tarefa"),
                        rs.getString("nm_tarefa"),
                        rs.getString("ds_tarefa"),
                        rs.getString("ds_categoria"),
                        rs.getBoolean("ic_status")
                );
                tarefa.add(tarefas);
            }
       }catch (SQLException e){
           e.printStackTrace();
           System.out.println("Não foi possivel listar");
       }
        return tarefa;
   }

    public List<Tarefas> filtrarCategoria(String categoria){
        List<Tarefas> tarefa = new ArrayList<>();
        String sql = "SELECT * FROM tb_tarefa WHERE ds_categoria=?";

        try(Connection con = Conexao.conectar(); PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1,categoria);

            try(ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Tarefas tarefas = new Tarefas(
                            rs.getInt("id_tarefa"),
                            rs.getString("nm_tarefa"),
                            rs.getString("ds_tarefa"),
                            rs.getString("ds_categoria"),
                            rs.getBoolean("ic_status")
                    );
                    tarefa.add(tarefas);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Não foi possivel listar");
        }
        return tarefa;
    }

    public List<Tarefas> filtrarStatus(Boolean status){
        List<Tarefas> tarefa = new ArrayList<>();
        String sql = "SELECT * FROM tb_tarefa WHERE ic_status=?";

        try(Connection con = Conexao.conectar(); PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setBoolean(1,status);
            try(ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Tarefas tarefas = new Tarefas(
                            rs.getInt("id_tarefa"),
                            rs.getString("nm_tarefa"),
                            rs.getString("ds_tarefa"),
                            rs.getString("ds_categoria"),
                            rs.getBoolean("ic_status")
                    );
                    tarefa.add(tarefas);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Não foi possivel listar");
        }
        return tarefa;
    }
}
