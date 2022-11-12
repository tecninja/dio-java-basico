package gerenciador_emprestimos;

public class App {
    public static void main(String[] args) {
        
        System.out.println("Sisteme Gerenciador de Emprestimos");

        Cliente cliente = new Cliente();

        cliente.nome = Cliente.atribuirNome(cliente.scan);

        System.out.println("Prazer em conhecê-lo " + cliente.nome);

    };
}
