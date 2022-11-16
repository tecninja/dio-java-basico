package gerenciador_emprestimos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * <h1>Classe para Análise de Crédito</h1>
 * <h2>Dispõe de diversos métodos que realizam os calculos necessários</h2>
 * <h3>Métodos:</h3>
 * <ul>
 *  <li>verificarAutorizacao</li>
 *  <li>verificarCapacidade</li>
 *  <li>stringParaData</li>
 *  <li>verificarLimiteIdade</li>
 * </ul>
 */
public class AnaliseCliente {

    /**
     * Método para identificar se o cliente pode seguir com a proposta de emprestimo ou não
     * @param cliente objeto da classe cliente
     * @return boolean true para autorizado e false para não autorizado
     */
    public static boolean verificarAutorizacao(Cliente cliente) {

        if(cliente.negativacao){
            return false;
        } else {
            if(verificarLimiteIdade(stringParaData(cliente.dataNascimento)) > 0){
                if(cliente.salario > 1000) {
                    if(cliente.scoreInterno > 50) {
                        if(cliente.scoreExterno > 600) {
                            return true;
                        } else {
                            if(cliente.autorizacaoGerencial){
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    /**
     * Método para identificar a capacidade pagamento total bruta do cliente.
     * @param cliente
     * @return
     */
    public static double verificarCapacidade(Cliente cliente) {
        double capacidade = cliente.salario;
    
        double multiplicador = 1;

        if(cliente.funcionarioPublico) multiplicador += 1;

        if(AnaliseCliente.verificarIdade(cliente) < 25) multiplicador += 0.3;
        else multiplicador -= 0.3;

        if(cliente.cartaoCredito) multiplicador += 0.5;

        if(cliente.investimento) multiplicador += 2;

        if(cliente.contaCorrente) multiplicador += 0.5;

        if(cliente.tempoTrabalho > 1) multiplicador += 1;

        if(cliente.scoreInterno > 90) multiplicador += 1.5;
        else if(cliente.scoreInterno > 75) multiplicador += 0.8;

        if(cliente.scoreExterno > 800) multiplicador += 1.2;
        else if(cliente.scoreExterno > 700) multiplicador += 0.6;
        else multiplicador -= 1;
        
        capacidade *= multiplicador;
        
        capacidade = capacidade/(1+AnaliseCliente.verificarTaxaJuros(cliente));
        
        return capacidade;
    }

    /**
     * Método Transforma uma string no formado "DD/MM/AAAA" em um objeto do tipo LocalDate
     * @param data recebe string no formato "DD/MM/AAAA"
     * @return retorna data no formato LocalDate
     */
    public static LocalDate stringParaData(String data){
        String[] dataSplitada = data.split("/");
        LocalDate dataAjustada = LocalDate.of(Integer.parseInt(dataSplitada[2]), Integer.parseInt(dataSplitada[1]), Integer.parseInt(dataSplitada[0]));
        return dataAjustada;
    }

    /**
     * Método para identificar a quantidade parcelas máximas de acordo a idade
     * @param data recebe a data de nascimento
     * @return int quantidade de parcelas máxima permitida
     */
    public static long verificarLimiteIdade(LocalDate data){

        LocalDate dataNascimento = data;
        long limiteMeses = 960;
        long tempo = ChronoUnit.MONTHS.between(dataNascimento, LocalDate.now());

        long parcelamentoMaximoPorIdade = limiteMeses - tempo;
        if(parcelamentoMaximoPorIdade > 0){
            return parcelamentoMaximoPorIdade;
        } else {
            return 0;
        }
    }

    /**
     * Método para definição da taxa de juros
     * @param cliente recebe objeto da classe cliente
     * @return double taxa de juros
     */
    public static double verificarTaxaJuros(Cliente cliente){
        double juros = 0.99;
        
        if(cliente.scoreInterno > 90) juros -= 0.1;
        else if(cliente.scoreInterno > 75) juros -= 0.05;

        if(cliente.scoreExterno > 700) juros -= 0.05;

        if(cliente.cartaoCredito) juros -= 0.05;

        if(cliente.investimento) juros -= 0.1;

        if(cliente.contaCorrente) juros -= 0.05;
        return juros;
    }

    public static int verificarIdade(Cliente cliente){

        LocalDate data = AnaliseCliente.stringParaData(cliente.dataNascimento);
        long idade = ChronoUnit.YEARS.between(data, LocalDate.now());
        
        return Math.toIntExact(idade);
    }
}
