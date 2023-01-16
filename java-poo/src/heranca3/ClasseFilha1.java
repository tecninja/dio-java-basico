package heranca3;

public class ClasseFilha1 extends ClasseMae {
    
    @Override // Decorator para sobrescrever método "sobrescrita"
    void metodo1(){
        System.out.println("Método 1 da classe filha 1");
    }
}
