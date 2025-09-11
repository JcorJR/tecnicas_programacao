package br.edu.fatecpg.model;

public class Tarefas {
    private int id;
    private String titulo;
    private String descricao;
    private String categoria;
    private boolean status;

    public Tarefas(int id, String titulo, String descricao,String categoria, boolean status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isStatus() {
        return status;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }


    @Override
    public String toString() {
        return "[ ID: " + id + " | " + "Titulo: " + titulo + " | " + "Descrição: " + descricao + " | " +"Categoria: " + categoria + " | " + "Status: " + status + " ]";
    }
}
