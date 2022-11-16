package testando;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class teste {

    /*public static void main(String[] args) {
        
        teste2 test = new teste2();

        test.nome = teste2.atribuirNome(test.scan);
        test.idade = teste2.atribuirIdade(test.scan);

        System.out.println(test.nome + " vc não parece ter " + test.idade + " anos, incrível!" );
    }    */

    /*public static void main(String[] args) {
        LocalDate data = LocalDate.now();

        System.out.println(data);
    }*/

    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(1949, 5, 9);
        LocalDate data2 = LocalDate.now();

        long tempo = ChronoUnit.MONTHS.between(data1, data2);

        long limiteTempo = 960;

        long parcelamentoMaximoPorIdade = limiteTempo - tempo;

        System.out.println(parcelamentoMaximoPorIdade);
    }
}
