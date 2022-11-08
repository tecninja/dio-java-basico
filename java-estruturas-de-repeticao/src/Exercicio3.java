import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;
        do {
            System.out.println("Informe um número:");
            numero = scan.nextInt();
            if (count == 0) {
                maior = numero;
                soma = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                };
                soma += numero;
            };
            count++;
        } while (count < 5);

        System.out.println("O maior número inserido foi: " + maior);
        System.out.println("A média dos números inseridos foi: " + soma/5);
    }
}
