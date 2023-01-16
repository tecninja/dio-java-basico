package gerenciador_emprestimos;
import java.util.Scanner;

public class Cliente {

    Scanner scan = new Scanner(System.in);

    String nome; // indica o nome do cliente
    String dataNascimento; // indica a idade do cliente
    double salario; //Indica o valor do salário bruto
    boolean contaCorrente; // Indica se o cliente tem conta corrente com o banco
    boolean cartaoCredito; // Indica se o cliente tem cartão de crédito com o banco
    boolean negativacao; // Indica se o cliente está negativado nos órgãos de proteção ao crédito
    boolean financiamento; // indica se o cliente tem ou não financiamento com o banco
    boolean investimento; // Indica se o cliente tem ou não investimentos no banco
    boolean autorizacaoGerencial; // Indica pra autorização mesmo com score externo baixo
    int scoreInterno; // Varia entre 0 a 100
    int scoreExterno; // Varia entre 0 a 1000
    int tempoTrabalho; //Em anos
    boolean funcionarioPublico; //Receber false inplica automaticamente em ser funcionário da iniciativa privada

    /**
     * Método para popular o atributo Nome
     * @param scan
     * @return string Recebe o nome do cliente
     */
    public static String atribuirNome(Scanner scan){
        System.out.println("Nome cliente: ");
        String nome = scan.next();
        return nome;
    }

    /**
     * Método para popular o atributo Data de Nascimento
     * @param scan
     * @return string recebe a data de nascimento do cliente
     */
    public static String atribuirDataNascimento(Scanner scan){
        System.out.println("Data de nascimento: [DD-MM-YYYY]");
        String data = scan.next();
        return data;
    }

    /**
     * Método para popular o atributo Salário
     * @param scan
     * @return double recebe o valor do salário do cliente
     */
    public static double atribuirSalario(Scanner scan){
        System.out.println("Salario: [Usar 'virgula' como separador decimal]");
        double salario = scan.nextDouble();
        return salario;
    }

    /**
     * Método para popular o atributo conta corrente
     * @param scan
     * @return boolean true para cliente com conta corrente, e false sem conta corrente
     */
    public static boolean atribuirContaCorrente(Scanner scan){
        System.out.println("Possui conta conrrente? [1: Sim 0: Não]");
        String resposta = scan.next();
        Boolean contaCorrente;
        if(resposta.equals("1")){
            contaCorrente = true;
        } else {
            contaCorrente = false;
        }
        return contaCorrente;
    }

    /**
     * Método para popular o atributo Cartão de Crédito
     * @param scan
     * @return boolean true para cliente com cartão de crédito, e false para cliente sem cartão de crédito
     */
    public static boolean atribuirCartaoCredito(Scanner scan){
        System.out.println("Possui cartao de crédito? [1: Sim 0: Não]");
        String resposta = scan.next();
        Boolean cartao;
        if(resposta.equals("1")){
            cartao = true;
        } else {
            cartao = false;
        }
        return cartao;
    }

    /**
     * Método para popular o atributo Negativação
     * @param scan
     * @return boolean true para cliente negativado, e false para não negativado
     */
    public static boolean atribuirNegativacao(Scanner scan){
        System.out.println("Possui negativacao? [1: Sim 0: Não]");
        String resposta = scan.next();
        Boolean negativacao;
        if(resposta.equals("1")){
            negativacao = true;
        } else {
            negativacao = false;
        }
        return negativacao;
    }

    /**
     * Método para popular o atributo financiamento
     * Deve indicar se o cliente possui financiamento com a instituição
     * @param scan
     * @return boolean true para cliente funcionário público, e false para iniciativa privada
     */
    public static boolean atribuirFinanciamento(Scanner scan){
        System.out.println("Possui financiamento? [1: Sim 0: Não]");
        String resposta = scan.next();
        Boolean financiamento;
        if(resposta.equals("1")){
            financiamento = true;
        } else {
            financiamento = false;
        }
        return financiamento;
    }

    /**
     * Método para popular o atributo investimento
     * Deve indicar se o cliente possui valores investido ou não
     * @param scan
     * @return boolean true para cliente com investimento, e false para sem investimento
     */
    public static boolean atribuirInvestimento(Scanner scan){
        System.out.println("Possui investimentos? [1: Sim 0: Não]");
        String resposta = scan.next();
        Boolean investimento;
        if(resposta.equals("1")){
            investimento = true;
        } else {
            investimento = false;
        }
        return investimento;
    }

    /**
     * Método para popular o atributo Autorização Gerencial
     * Atributo permitirá que o cliente siga com a proposta de empréstimo, mesmo com score externo menor que 600
     * @param scan
     * @return boolean true para cliente com autorização gerencial, e false para cliente sem autorização.
     */
    public static boolean atribuirAutorzacaoGerencial(Scanner scan){
        System.out.println("Possui autorização gerencial? [1: Sim 0: Não]");
        String resposta = scan.next();
        Boolean autorizacao;
        if(resposta.equals("1")){
            autorizacao = true;
        } else {
            autorizacao = false;
        }
        return autorizacao;
    }

    /**
     * Método para popular o atributo Funcionário Publico
     * @param scan
     * @return boolean true para cliente funcionário público, e false para iniciativa privada
     */
    public static boolean atribuirFuncionarioPublico(Scanner scan){
        System.out.println("É funcionário público? [1: Sim 0: Não]");
        String resposta = scan.next();
        Boolean funcionarioPublico;
        if(resposta.equals("1")){
            funcionarioPublico = true;
        } else {
            funcionarioPublico = false;
        }
        return funcionarioPublico;
    }

    /**
     * Método para popular o atributo Score Interno
     * @param scan
     * @return int score em pontos 0 a 100
     */
    public static int atribuirScoreInterno(Scanner scan){
        System.out.println("Informe o score interno:");
        int score = scan.nextInt();
        return score;
    }

    /**
     * Método para popular o atributo Score Externo
     * @param scan
     * @return int score em pontos 0 a 1000
     */
    public static int atribuirScoreExterno(Scanner scan){
        System.out.println("Informe o score externo:");
        int score = scan.nextInt();
        return score;
    }
    /**
     * Método para popular o atributo Tempo de Trabalho
     * @param scan
     * @return int tempo de trabalho em anos
     */
    public static int atribuirTempoTrbalho(Scanner scan){
        System.out.println("Informe o tempo de trabalho atual:");
        int tempo = scan.nextInt();
        return tempo;
    }

    /**
     * Método para popular os atributos
     * 
     * @param cliente recebe um objeto do mesmo tipo da classe que está inserida
     * @return retorna o objeto Cliente com todos os atributos preenchidos
     */
    public static Cliente cadastrarCliente(Cliente cliente) {

        cliente.nome = Cliente.atribuirNome(cliente.scan);
        cliente.dataNascimento = Cliente.atribuirDataNascimento(cliente.scan);
        cliente.salario = Cliente.atribuirSalario(cliente.scan);
        cliente.contaCorrente = Cliente.atribuirContaCorrente(cliente.scan);
        cliente.cartaoCredito = Cliente.atribuirCartaoCredito(cliente.scan);
        cliente.negativacao = Cliente.atribuirNegativacao(cliente.scan);
        cliente.financiamento = Cliente.atribuirFinanciamento(cliente.scan);
        cliente.investimento = Cliente.atribuirInvestimento(cliente.scan);
        cliente.scoreExterno = Cliente.atribuirScoreExterno(cliente.scan);
        cliente.scoreInterno = Cliente.atribuirScoreInterno(cliente.scan);
        cliente.autorizacaoGerencial = Cliente.atribuirAutorzacaoGerencial(cliente.scan);
        cliente.tempoTrabalho = Cliente.atribuirTempoTrbalho(cliente.scan);
        cliente.funcionarioPublico = Cliente.atribuirFuncionarioPublico(cliente.scan);     
        
        return cliente;
    }
}