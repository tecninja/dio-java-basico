// Crie um erray, e imprima o conjunto de dados de forma inversa

public class Exercicio1 {
    public static void main(String[] args) {
        
        int[] vetor = {9,-5,8,15,4};
        int count = 0;
        while (count <= vetor.length - 1) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println("\nOrdem inversa:");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        };
    }
}
