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

    public static String atribuirNome(Scanner scan){
        System.out.println("Nome cliente: ");
        String nome = scan.next();
        return nome;
    }

    public static String atribuirDataNascimento(Scanner scan){
        System.out.println("Data de nascimento: [DD-MM-YYYY]");
        String data = scan.next();
        return data;
    }

    public static double atribuirSalario(Scanner scan){
        System.out.println("Salario: [Usar 'virgula' como separador decimal]");
        double salario = scan.nextDouble();
        return salario;
    }

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

    public static int atribuirScoreInterno(Scanner scan){
        System.out.println("Informe o score interno:");
        int score = scan.nextInt();
        return score;
    }

    public static int atribuirScoreExterno(Scanner scan){
        System.out.println("Informe o score externo:");
        int score = scan.nextInt();
        return score;
    }

    public static int atribuirTempoTrbalho(Scanner scan){
        System.out.println("Informe o tempo de trabalho atual:");
        int tempo = scan.nextInt();
        return tempo;
    }

    /*
     * @params
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