package desafio_taxa_crescimento;
import java.util.Scanner;

public class TaxaCrescimento {
    
    public static void main(String[] args) {
        double A, B;

        try (Scanner input = new Scanner(System.in)) {
            A = input.nextInt();
            B = input.nextInt();
        }
        int anos = 0;

        //TODO: retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B

        while(B > A){
            A = A * 1.03;
            B = B * 1.015;
            anos = anos + 1;
        }

        
        System.out.println(anos + " anos");
    }

}
