package br.edu.fatecpg.view;

import br.edu.fatecpg.model.TarefaController;
import br.edu.fatecpg.model.Tarefas;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TarefaController tc = new TarefaController();

        while (true){
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Remover Tarefa");
            System.out.println("4 - Atualizar Tarefa");
            System.out.println("5 - Marcar como concluida");
            System.out.println("6 - Filtra Tarefa por Categoria");
            System.out.println("7 - Filtrar Tarefa por Status");
            System.out.println("8 - Encerrar Processo");
            System.out.println("Escolha uma das opções: ");

            int cmd = scan.nextInt();
            scan.nextLine();

            switch (cmd){
                case 1:
                    System.out.println("Nome: ");
                    String tl = scan.nextLine();
                    System.out.println("Descrição: ");
                    String ds = scan.nextLine();
                    System.out.println("Categoria: ");
                    String ct = scan.nextLine();
                    int idT = 0;
                    boolean st = false;

                    Tarefas t = new Tarefas(idT,tl,ds,ct,st);
                    tc.adicionarTarefa(t);
                    break;

                case 2:
                    List<Tarefas> tarefa = tc.listarTarefas();
                    tarefa.forEach(System.out::println);
                    break;

                case 3:
                    System.out.println("Insira o id da tarefa que deseja deletar: ");
                    int idDel = scan.nextInt();
                    scan.nextLine();

                    tc.deletarTarefa(idDel);
                    break;

                case 4:
                    System.out.println("Insira o id da tarefa que deseja atualizar: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Insira o novo titulo: ");
                    String til = scan.nextLine();
                    System.out.println("Insira a nova descrição: ");
                    String desc = scan.nextLine();
                    System.out.println("Insira a nova categoria: ");
                    String cate = scan.nextLine();

                    tc.atualizarTarefa(id,til,desc,cate);
                    System.out.println("Tarefa atualizada com sucesso!");
                    break;

                case 5:
                    System.out.println("Insira o id da tarefa que deseja Concluir: ");
                    int idAtt = scan.nextInt();
                    scan.nextLine();

                    tc.concluirTarefa(idAtt);
                    break;

                case 6:
                    System.out.println("Insira a categoria que deseja filtrar: ");
                    String cat = scan.nextLine();

                    tc.filtrarCategoria(cat);
                    List<Tarefas> Tfiltradas = tc.filtrarCategoria(cat);
                    Tfiltradas.forEach(System.out::println);
                    break;

                case 7:
                    System.out.println("Deseja ver tarefas já concluidas (C) ou as pendentes(P)? ");
                    System.out.println();
                    String sta = scan.nextLine();

                    if(sta.equalsIgnoreCase("C")){
                        tc.filtrarStatus(true).forEach(System.out::println);
                    }else if (sta.equalsIgnoreCase("P")) {
                        tc.filtrarStatus(false).forEach(System.out::println);
                    }else{
                        System.out.println("Caractere inválido!");
                    }
                    break;

                case 8:
                    System.out.println("Encerrando processo...");
                    scan.close();
                    return;

                default:
                    System.out.println("Opção invalida!");
            }
        }
    }
}
