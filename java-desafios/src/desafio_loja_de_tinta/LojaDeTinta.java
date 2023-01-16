package desafio_loja_de_tinta;
import java.util.Scanner;

public class LojaDeTinta {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double areaCoberta = scanner.nextDouble();
   
   // TODO: Utilize a função Math.ceil() para arredondamento

            int areaLata = 18 * 6;
            Double areaGalao = 3.6 * 6;

            double quantidadeLatas1 = areaCoberta / areaLata;
            double quantidadeGaloes1 = areaCoberta / areaGalao;

            double quantidadeLatas = Math.ceil(quantidadeLatas1);
            double quantidadeGaloes = Math.ceil(quantidadeGaloes1);

            double valorLata = 80.00;
            double valorGalao = 25.00;
   
   
            System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + (int) quantidadeLatas + " no valor R$ "  + quantidadeLatas * valorLata );
            System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + (int) quantidadeGaloes + " no valor R$ "  + quantidadeGaloes * valorGalao);
        }
      }
}
