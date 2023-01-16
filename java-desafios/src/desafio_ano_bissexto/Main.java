package desafio_ano_bissexto;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int ano;
    
        ano = ent.nextInt();
        
        //TODO: Descubra se o ano é bissexto ou não

        int resto4 = ano % 4;
        int resto100 = ano % 100;
        int resto400 = ano % 400;

        if (resto4 == 0 & resto100 == 0){
            System.out.println("Nao Bissexto");
        } else if (resto4 == 0 & resto100 != 0) {
            System.out.println("Bissexto");
        } else if (resto4 != 0 & resto400 == 0) {
            System.out.println("Bissexto");
        } else {
            System.out.println("Nao Bissexto");
        }
    }
}