import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
     
        Random rand = new Random();

        int[] numeroAleatorios = new int[20];

        for(int i = 0; i < numeroAleatorios.length; i++) {
            int numero = rand.nextInt(100);
            numeroAleatorios[i] = numero;
        }

        for(int num : numeroAleatorios) {
            System.out.print(num + " ");
        }
    }
}