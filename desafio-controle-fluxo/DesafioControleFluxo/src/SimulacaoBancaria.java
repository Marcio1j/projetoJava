import java.util.Scanner;
public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("qual valor a ser depositado?");
                    double deposito =scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("saldo atual: " + saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                       System.out.println("qual valor a ser sacado?");
                       double saque =scanner.nextDouble();
                       if (saque > saldo){
                              System.out.println("saldo insuficiente");}
                        else{ 
                          saldo = saldo - saque;
                          System.out.println("saldo atual: " + saldo);}
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}