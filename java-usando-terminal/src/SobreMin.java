
public class SobreMin {
    public static void main(String[] args) {
        
        String nome = args[0];
        String sobreNome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        double peso = Double.valueOf(args[4]);

        double imc = peso / (altura * altura);

        System.out.println("NOME: " + nome);
        System.out.println("Sobrenome: " + sobreNome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + imc);
    }
}