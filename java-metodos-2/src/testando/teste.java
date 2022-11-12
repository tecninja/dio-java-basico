package testando;


public class teste {

    public static void main(String[] args) {
        
        teste2 test = new teste2();

        test.nome = teste2.atribuirNome(test.scan);
        test.idade = teste2.atribuirIdade(test.scan);

        System.out.println(test.nome + " vc não parece ter " + test.idade + " anos, incrível!" );
    }    
    
}
