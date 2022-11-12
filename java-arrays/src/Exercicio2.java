import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] vetor = new String[6];
        
        int consoantes = 0;
       
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Informe uma letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") | 
            letra.equalsIgnoreCase("e") | 
            letra.equalsIgnoreCase("i") | 
            letra.equalsIgnoreCase("o") | 
            letra.equalsIgnoreCase("u"))) {
                vetor[i] = letra;
                consoantes++;
            }
        };

        System.out.print("Quantidade de consoantes: " + consoantes + "\nConsoantes: ");
        for (String consoante : vetor) {
            if(consoante  != null) System.out.print(consoante + " ");
        }
    }
}
