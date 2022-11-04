public class MinhaClass {

public static void main (String [] args) {

    String primeiroNome = "Esdras";
    String segundoNome = "Santos";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    
    System.out.print(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}

}
