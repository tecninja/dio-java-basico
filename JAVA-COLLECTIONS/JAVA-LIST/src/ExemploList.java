import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExemploList {

    // Crie uma lista para receber as notas de 7 alunos

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        List<Double> notas = new ArrayList<>(); // Forma 1
        //List<Double> notas2 = Arrays.asList(1d,3.5,5d); //Forma 2, forma imutável

        System.out.println("Crie uma lista com as notas");

        for(int i = 1; i <= 7; i++){

            System.out.println("Informe a nota: ");
            notas.add(scan.nextDouble());
        }

        System.out.println("As notas inseridas foram: " + notas);
        System.out.println("A nota inserida por último foi: " + notas.get(6));
        notas.set(0, 2.0);
        System.out.println("A primeira nota inserida foi substituida por: " + notas.get(0));
        System.out.println("Foi inserida alguma nota 0? " + notas.contains(0d));
        System.out.println("A maior nota foi: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();

        Double soma = 0.0;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        
        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média aritimética das notas é: " + (soma/notas.size()));


        scan.close();
    }
    
}
