package br.edu.fatecpg.view;

import br.edu.fatecpg.model.Endereco;
import br.edu.fatecpg.model.ViaCep;
import br.edu.fatecpg.model.ViaCepController;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        instancias
        Scanner scan = new Scanner(System.in);
        ViaCepController vcc = new ViaCepController();

//        menu
        while(true){
            System.out.println("1 - Cadastrar novo endereço");
            System.out.println("2 - Buscar endereço");
            System.out.println("3 - Exibir endereços");
            System.out.println("4 - Sair");
            System.out.print("Selecione uma opção: ");
            int cmd = scan.nextInt();
            scan.nextLine();

            switch (cmd){
                case 1:
                    System.out.print("Insira o cep: ");
                    String cep = scan.nextLine();

                    String json = ViaCep.buscarEndereco(cep);
                    Endereco endereco = ViaCep.converterEndereco(cep,json);

                    if(endereco != null){
                        System.out.println(endereco);
                        vcc.adicionarEndereco(endereco);
                    }else{
                        System.out.println("CEP invalido ou não encontrado");
                    }
                break;

                case 2:
                    System.out.print("Insira o cep que deseja buscar: ");
                    String cE = scan.nextLine();

                    List<Endereco> eE = vcc.buscarEnderecos(cE);
                    eE.forEach(System.out::println);
                    break;

                case 3:
                    List<Endereco> ee = vcc.listarEndereco();
                    ee.forEach(System.out::println);
                    break;

                case 4:
                    System.out.println("Encerrando processo... ");
                    scan.close();
                    return;


                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }
    }
}
