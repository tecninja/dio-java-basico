package testando;
import java.util.Scanner;

public class teste2 {
    Scanner scan = new Scanner(System.in);
    String nome;
    int idade;

    public static String atribuirNome(Scanner scan) {
        System.out.println("Informe seu nome:");
        String nome = scan.next();
        return nome;
    }

    public static int atribuirIdade(Scanner scan) {
        System.out.println("Informe sua idade:");
        int idade = scan.nextInt();
        return idade;
    }
}
