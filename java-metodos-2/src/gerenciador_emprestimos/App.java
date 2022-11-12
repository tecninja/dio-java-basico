package gerenciador_emprestimos;

public class App {
    public static void main(String[] args) {
        
        System.out.println("Sisteme Gerenciador de Emprestimos");

        Cliente cliente = new Cliente();

        System.out.println("Iniciando cadastro do cliente");

        cliente = Cliente.cadastrarCliente(cliente);

        System.out.println("Verificando capacidade de pagamento");

        double capacidade = AnaliseCliente.verificarCapacidade(cliente);
        boolean autorizacao = AnaliseCliente.verificarAutorizacao(cliente);

        System.out.println("Autorização para empréstimo: " + autorizacao);
        System.out.println("Capacidade do cliente: " + capacidade);

    };
}
