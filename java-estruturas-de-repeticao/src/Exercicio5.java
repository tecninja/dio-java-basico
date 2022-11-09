/*
 Crie uma tabuada de 1 a 10 a partir do número que o usuário inserir no terminal
*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        long tabuada;

        System.out.println("Informe o número:");
        tabuada = scan.nextLong();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
