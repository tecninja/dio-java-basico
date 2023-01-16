package interfaces;

public class Calculadora implements OperacoesMatematicas {
    

    @Override
    public void soma(double operando1, double operando2){
        System.out.println("Soma: " + operando1 + operando2);
    }

    @Override
    public void subtracao(double operando1, double operando2){
        System.out.println("Soma: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2){
        System.out.println("Soma: " + (operando1 * operando2));
    }


//    @Override
//    public void divisao(double operando1, double operando2){
//        System.out.println("Soma: " + (operando1 / operando2));
//    }
    
}
