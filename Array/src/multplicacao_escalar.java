import java.util.Scanner;

public class multplicacao_escalar {
    public static void main(String[] args) {
        String [][] userlogin = {
                {"fatec", "fatec777"},
                {"amarelo", "451"},
                {"Ronaldo", "fenomeno"},
                {"Faustão", "domingão"},
                {"Tony", "ProSkater"},
                {"sla", "???"} };

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o usuario: ");
        String user = scan.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scan.nextLine();

        boolean auth = false;
        for (String[] u : userlogin){
            if(u[0].equals(user) && u[1].equals(senha)){
                auth = true;
                break;
            }
        }
        if(auth == true){
            System.out.println("Acesso Liberado");
        }else{
            System.out.println("Acesso negado");
        }
    }
}
