/*
 Crie o algoritimo que mostre o fatorial de um numero inserido a partir do terminal.
 */
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double NaN = 0d / 0d;

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        Double soma = 1.0;
        while (true) {
            if (fatorial <= -1) {
                System.out.println("Entrada inválida");
                soma = NaN;
                break;
            } else if (fatorial == 0) {
;               break;
            } else {
                soma *= fatorial;
                fatorial--;
            };
            if (fatorial == 1) break;
        }

        System.out.println("Fatorial calculado: " + soma);
    }
}
