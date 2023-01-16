package heranca3;

// Classe pra indicar o uso de polimorfismo e sobrescrita
public class RodarAplication {
    /**
     * @param args
     */
    public static void main (String[] args) {

            ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

            for (ClasseMae classe: classes) {
                classe.metodo1();
            }

            System.out.println("");

            for (ClasseMae classe: classes) {
                classe.metodo2();
            }

            System.out.println("");

            ClasseFilha2 classeFilha2 = new ClasseFilha2();
            classeFilha2.metodo2();
        }
}
