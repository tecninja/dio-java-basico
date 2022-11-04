// Script para testar identação
public class BoletimEstudantil {
    
    public static void main(String[] args) {
        double mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.print("REPROVADO");
        else if (mediaFinal == 6)
            System.out.print("RECUPERAÇÃO");
        else
            System.out.print("APROVADO");
    }
}
