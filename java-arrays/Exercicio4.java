import java.util.Random;

public class Exercicio4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] M = new int[15][15];

        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[i].length; j++) {
                M[i][j] = rand.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + "  ");
            }
            System.out.println();
        }
    }
}
