// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,  
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".  
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 


import java.util.*;

public class App {
    
    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            String palavra = scanner.next();
            
            int quantidade = palavra.length();

            for (int i = 1; i <= quantidade; i++){
                System.out.println(palavra.substring(0, i));
            }
        }
        
    }
}