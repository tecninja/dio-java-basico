package gerenciador_emprestimos;
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        boolean continuar = true;

        while(continuar == true) { 

            System.out.println("----------------------------------");
            System.out.println("Sistema Gerenciador de Emprestimos");
            System.out.println("----------------------------------");

            Cliente cliente = new Cliente();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Iniciar Proposta: [1]\nEncerrar Programa: [0]");
            int resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("----------------------------------");
                    System.out.println("Iniciando cadastro do cliente");
                    System.out.println("----------------------------------");

                    cliente = Cliente.cadastrarCliente(cliente);

                    System.out.println("----------------------------------");
                    System.out.println("Analisando os Dados");
                    System.out.println("----------------------------------");

                    double capacidade = AnaliseCliente.verificarCapacidade(cliente);
                    boolean autorizacao = AnaliseCliente.verificarAutorizacao(cliente);
                    LocalDate dataNasc = AnaliseCliente.stringParaData(cliente.dataNascimento);
                    long parcelamento = AnaliseCliente.verificarLimiteIdade(dataNasc);
                    double juros = AnaliseCliente.verificarTaxaJuros(cliente);
        
                    System.out.println("Autorização para empréstimo: " + autorizacao);
                    System.out.printf("Capacidade do cliente: %.2f\n", capacidade);
                    System.out.println("Quantidade de parcelas máxima: " + parcelamento);
                    System.out.printf("Taxa de juros: %.2f\n", juros);
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
