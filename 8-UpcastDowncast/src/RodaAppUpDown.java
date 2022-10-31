public class RodaAppUpDown {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();

        //Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast
        Vendedor vendedor2 = (Vendedor) new Funcionario();
    }
}
