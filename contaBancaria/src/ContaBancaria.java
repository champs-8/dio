import java.util.Scanner;

public class ContaBancaria{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //verificando se tem conta ativa
        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("Você possui uma conta ativa? \n[1] Sim \n[2] Não");

        int resposta = sc.nextInt();
        try {
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira 1 ou 2.");
        }finally{
            if (resposta == 1) {
                menu();
            }
        }
    }
    //instancing a Scanner object to read user input

    public static void menu(){
        System.out.println("\n======================");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Consultar cheque especial");
        System.out.println("3. Depositar");
        System.out.println("4. Sacar");
        System.out.println("5. Pagar boleto");
        System.out.println("6. Verificar cheque especial");
        System.out.println("7. Sair");
        System.out.println("======================\n");

        // Prompting user for input
        // int option = sc.nextInt();
        // switch (option) {
        //     case 1:
        //         consultarSaldo();
        //         break;
        //     case 2:
        //         consultarChequeEspecial();
        //         break;
        //     case 3:
        //         depositar();
        //         break;
        //     case 4:
        //         sacar();
        //         break;
        //     case 5:
        //         pagarBoleto();
        //         break;
        //     case 6:
        //         verificarChequeEspecial();
        //         break;
        //     case 7:
        //         System.out.println("Saindo...");
        //         System.exit(0);
        //     default:
        //         System.out.println("Opção inválida. Tente novamente.");
        // }
    }

    public static void criarConta() {
        System.out.println("Creating account...");
        // Implementar lógica para criar conta
        //solictar nome
        System.out.print("Write your name: ");
        String name = sc.next();

    }
}
