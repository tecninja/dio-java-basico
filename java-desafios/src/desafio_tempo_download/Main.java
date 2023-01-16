package desafio_tempo_download;

import java.math.RoundingMode;
import java.text.DecimalFormat;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.Scanner;

public class Main {

  public static void main(String[] Args) {

   Scanner sc = new Scanner(System.in);
   double tmhMB = sc.nextFloat();
   double tmhMbps = sc.nextFloat();

   //TODO: Calcule o tempo aproximado de download:

   double velocidade = tmhMB / tmhMbps;
    

   //TODO: Imprima o calculo do tempo, leve em consideração que a saída é um numero com duas casas decimais:       
    
   System.out.println(velocidade/100);
    System.out.println(arredondar(velocidade/100).replace(',', '.'));
    }

    private static String arredondar(double num){
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(num);
    }
}