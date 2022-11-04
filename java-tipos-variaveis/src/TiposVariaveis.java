public class TiposVariaveis {

    public static void main(String[] args) {

        // JAVA é fortemente tipado, indica que uma variável não pode receber um dado de outro tipo além do que foi declarado em sua definição (salvo cast)
        // cast é o processo de forçar uma variável de determinado tipo, receber outro dado de tipo diferente o transformando

        short exempShort = 1; //recebe valores de -32mil a 32mil
        int exempInt = 100000; //recebe valores até 2 trilhoes +/-
        String exempStr = "texto"; //recebe texto

        // Variáveis X Constantes

        String exempVariavel = "texto"; // Diferente da constante, esta variavel pode receber mudanças quanto ao seu valor dentro script
        final String EXEMP_CONSTANTE = "texto"; // Neste caso, a junção no prefixo final e a variável em caixa alta, indica que esta variável será constante

        System.out.print(exempInt + " " + exempStr + " " + exempShort);

    }
}