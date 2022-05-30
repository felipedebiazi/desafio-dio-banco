import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cliente c1 = new Cliente();
        c1.setNome("Felipe Debiazi");

        Conta cc = new ContaCorente(c1);
        Conta poupanca = new ContaPoupanca(c1);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        System.out.println("---\tBem Vindo: " + c1.getNome() + "\t---");

        while (true) {

            System.out.println();
            System.out.println("Menu de Acessos");
            System.out.println("[1] para Depositos");
            System.out.println("[2] para Saques");
            System.out.println("[3] para Transferencia entre Contas");
            System.out.println("[4] para Extratos");
            System.out.println("[0] para Sair");

            System.out.print("Digite a opcao: ");
            int menu = scan.nextInt();

            if (menu == 1) {
                System.out.print("[1] Conta Corrente [2] Conta Poupanca: ");
                int tipoConta = scan.nextInt();
                switch (tipoConta) {
                    case 1:
                        System.out.print("Qual valor: ");
                        cc.depositar(scan.nextDouble());
                        break;

                    case 2:
                        System.out.print("Qual valor: ");
                        poupanca.depositar(scan.nextDouble());
                        break;
                }
            }
            if (menu == 2) {
                System.out.print("[1] Conta Corrente [2] Conta Poupanca: ");
                int tipoCnta = scan.nextInt();
                switch (tipoCnta) {
                    case 1:
                        System.out.print("Qual valor: ");
                        cc.sacar(scan.nextDouble());
                        break;

                    case 2:
                        System.out.print("Qual valor: ");
                        poupanca.sacar(scan.nextDouble());
                        break;
                }
            }
            if (menu == 3) {
                System.out.print("(Conta Destino - [1] Conta Corrente [2] Conta Poupanca: ");
                int tipoConta = scan.nextInt();
                switch (tipoConta) {
                    case 1:
                        System.out.print("Qual valor: ");
                        poupanca.transferir(scan.nextDouble(), cc);
                        break;

                    case 2:
                        System.out.print("Qual valor: ");
                        cc.transferir(scan.nextDouble(), poupanca);
                        break;
                }
            }
            if (menu == 4) {
                System.out.print("[1] Conta Corrente [2] Conta Poupanca: ");
                int tipoConta = scan.nextInt();
                switch (tipoConta) {
                    case 1:
                        System.out.println();
                        cc.imprimirExtrato();
                        break;

                    case 2:
                        System.out.println();
                        poupanca.imprimirExtrato();
                        break;
                }
            }

            if (menu == 0) break;
        }
        System.out.println("===\tFim do Programa - Obrigado e Ate a Proxima!\t===");
    }
}
