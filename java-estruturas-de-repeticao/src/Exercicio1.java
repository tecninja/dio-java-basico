/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade
(pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        int idade;

        while (true) {

            System.out.println("Informe seu nome:");
            nome = scan.next();
            System.out.println("Informe a idade:");
            idade = scan.nextInt();

            if (nome.equals("0")) break;
        }        
    }
}