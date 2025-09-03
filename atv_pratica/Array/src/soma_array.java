public class soma_array {
    public static void main(String[] args) {
        double [][] matriz1 = {{1,2,3},{5,6,4},{7,8,9}};
        double [][] matriz2 = {{1,2,3},{5,6,4},{7,8,9}};
        double [][] soma = new double [3][3];
        for (int i = 0; i < soma.length; i++) {
            for(int j = 0; j < soma.length; j++){
                soma[i][j] = matriz1[i][j]+matriz2[i][j];
                System.out.println(soma[i][j]);
            }

        }
    }
}