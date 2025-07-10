import java.util.Scanner;

public class BancoDigital
{
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        BancoDigital bc = new BancoDigital();

        bc.menu();
    }
    protected void menu(){

        Conta cc = new ContaCorrente(); //corrente
        Conta cp = new ContaPoupanca(); //poupanca

        int opcao = 0;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("[1] - Sacar");
            System.out.println("[2] - Depositar");
            System.out.println("[3] - Transferir");
            System.out.println("[4] - Emitir extrato");
            System.out.println("[0] - Sair");

            opcao = sc.nextInt();
            sc.nextLine(); //consumir buffer

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor do saldo: R$");
                    double valor = sc.nextDouble();
                    new ContaCorrente().sacar(valor);
                    break;
                case 2:

            }
        }while (opcao != 0);

    sc.close();
    }
}
