public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

    // Implementar metodo pra buscar por nome no list e imprime
    // e tabom

}
