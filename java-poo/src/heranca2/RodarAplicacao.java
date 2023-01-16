package heranca2;

public class RodarAplicacao {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario(); // Forma errada de fazer o downcast
        Vendedor vendedor_ = (Vendedor) new Funcionario(); // Vai dar o erro de classCastException pois existem atributos na class Funcionário, que não podem ser inseridos dentro da classe Vendedor
    }
}
