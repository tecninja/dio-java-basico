package gerenciador_emprestimos;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        boolean continuar = true;

        while(continuar == true) { 

            System.out.println("Sisteme Gerenciador de Emprestimos");
            Cliente cliente = new Cliente();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Iniciar Proposta: [1]\nEncerrar Programa: [0]");
            int resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("Iniciando cadastro do cliente");

                    cliente = Cliente.cadastrarCliente(cliente);
        
                    System.out.println("Verificando capacidade de pagamento");
        
                    double capacidade = AnaliseCliente.verificarCapacidade(cliente);
                    boolean autorizacao = AnaliseCliente.verificarAutorizacao(cliente);
        
                    System.out.println("Autorização para empréstimo: " + autorizacao);
                    System.out.println("Capacidade do cliente: " + capacidade);
                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    continuar = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Informação inválida, tente novamente!");
            }
        }
    };
}
