public class ContaCorente extends Conta {

    public ContaCorente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.imprimirInformacoes();
    }

}