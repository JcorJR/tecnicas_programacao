import java.util.Scanner;

public class transposicao {
    public static void main(String[] args) {
        String[][] matriz = new String [3][3];
        String[][] transposta = new String [3][3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++){
                System.out.print("Digite o valor para posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scan.nextLine();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                transposta[j][i] = matriz [i][j];
            }
        }

        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[0].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }




    }
}
