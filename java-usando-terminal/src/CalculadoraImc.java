import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("CALCULADORA DE IMC");

            System.out.println("Informe seu nome: ");
            String nome = scanner.next();

            System.out.println("Informe seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Digite seu peso: ");
            double peso = scanner.nextDouble();

            System.out.println("Olá " + nome + " " + sobrenome + " seu IMC é: " + calcularImc(peso, altura));
        }
    }
       /**
    * <h1>Calculador de IMC (Índice de massa corporal)</h1>
     * @param peso "Valor do peso do usuário no formato: Quilo.Gramas"
     * @param altura "Valor da altura do usuário no formato: Altura.Centimetros"
     * @return "Retorna o IMC do usuário"
     */
    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }
}



