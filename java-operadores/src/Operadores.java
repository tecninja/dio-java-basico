public class Operadores {
    public static void main(String[] args) {
        // = Operador de Atribuição
        // + Operador de Adição
        // - Operador de subtração
        // * Operador de multiplicação
        // / operador de divisão
        // % Operador de divisão inteira (retorna o resto da divisão)
        int n1 = 2;
        int n2 = 1;
        int resultado = n1 + n2 * n2 - n1 / n1 % n2;

        System.out.print(resultado);

        // O operador + quando usado em variáveis do tipo string tem função de concatenar as variáveis
        
        // ++ Operação de adição de uma unidade a variável
        // -- Operação de subtração de uma unidade a variável

        resultado++;

        System.out.print(resultado);

        // ! Operador de negação para valor booleano

        boolean teste = true;

        System.out.print(!teste);

        // Operador Ternário (simula ifelse)

        int a = 1;
        int b = 1;

        boolean resultado1 = a==b ?true : false;

        System.out.print(resultado1);

        // > Operador de maior que
        // < Operador de menor que
        // >= Operador de maior ou igual que
        // <= Operador de menor ou igual que
        // != Operador de diferente de

        // Operadores Lógicos
        // && Operador lógico 'E'
        // || Operador lógico 'OU'
        

    }
}