import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria{
    
    List<Client> clients = new ArrayList<>();
    
    Conta conta = new Conta();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        ContaBancaria cb = new ContaBancaria();

        //verificando se tem conta ativa
        System.out.println("\nBem-vindo ao sistema bancário!");
        System.out.println("Você possui uma conta ativa? \n[1] Sim \n[2] Não");

        int resposta = sc.nextInt();
        try {
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira 1 ou 2.");
            
        }finally{
            
            if (resposta == 1) {
                cb.menu();
            }else if(resposta == 2) {
                cb.criarConta();
            } else {
                System.out.println("Opção inválida. Por favor, insira 1 ou 2.");
            }
        }
    }
    //instancing a Scanner object to read user input
    
    public void menu(){
        do{
            System.out.println("\n======================");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar cheque especial");
            System.out.println("7. Sair");
            System.out.println("======================");
            System.out.print("Escolha uma opção: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    consultarChequeEspecial();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    sacar();
                    break;
                case 5:
                    pagarBoleto();
                    break;
                case 6:
                    verificarChequeEspecial();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while(true);
    }

    private void criarConta() {
        System.out.println("Creating account...");
        // Implementar lógica para criar conta
        //solictar nome
        System.out.print("Write your name: ");
        String name = sc.next();
        
        Client client = new Client(name);
        clients.add(client);
        System.out.println("\nAccount created with success for " + client.getName() + "!");
        System.out.println("\nThe ID from the account is: " + client.getId());
        
        System.out.println("\nYou need to deposit money to your account.");
        double valorDeposito = depositar();
    
        
        //logica para cheque especial
        //apenas no inicio da execução.
        if (valorDeposito <= 500) {
            conta.setChequeEspecial(50.0);
        }else if(valorDeposito > 500) {
            conta.setChequeEspecial(valorDeposito * 0.5);
        }
        
        //setando valor da conta
        conta.setSaldo(valorDeposito);
        conta.setChequeEspecialAtivo(true);

        menu();
    }

    private void consultarSaldo() {
        // Implementar lógica para consultar saldo
        System.out.println("Consultando saldo...");
        System.out.printf("Seu saldo é: R$ %.2f + (R$%.2f)Especial", conta.getSaldo(),
        (conta.getChequeEspecial()-conta.getChequeEspecialused()));
    }
    
    private void consultarChequeEspecial() {
        if (conta.getChequeEspecialAtivo()) {
            System.out.println("Seu saldo especial é de R$ " + conta.getChequeEspecial());
        }else{
            System.out.println("Voce não tem limite para saldo especial.");
        }
    }

    private double depositar() {
        System.out.print("How much do you want to deposit? R$");
        double valorDeposito = sc.nextDouble();
        conta.setSaldo(conta.getSaldo() + valorDeposito);
        System.out.println("Depósito realizado com sucesso! Seu novo saldo é: R$ " + conta.getSaldo());
        return valorDeposito;
    }

    private void sacar(){
        System.out.print("How much do you like to withdraw? R$ ");
        double valorSaque = sc.nextDouble();

        if (valorSaque > conta.getSaldo()) {
            //se apenas o saldo da conta for insuficiente
            //usará o saldo especial
            if(valorSaque <= conta.getSaldo()+
            (conta.getChequeEspecial()-conta.getChequeEspecialused())){

            // verify the value diference
            double usedChequeEspecial = valorSaque - conta.getSaldo();

            //set value to cheque especial with the value used
            conta.setChequeEspecialused(usedChequeEspecial);
            conta.setSaldo(0.0); // Set saldo to zero after using cheque especial

            } else {
                System.out.println("Insufficient balance.");
            }
        }else {
            conta.setSaldo(conta.getSaldo() - valorSaque);
            System.out.println("Withdrawal successful! Your new balance is R$ " + conta.getSaldo());
        }
    }
    private void pagarBoleto(){
        System.out.print("Enter the bar code of the boleto: e.g.(012345678901)");
        String valorBoletoStr = sc.next();

        valorBoletoStr = valorBoletoStr.replaceAll("[^0-9]", ""); // Remove non-numeric characters

        Long valorBoleto = Long.parseLong(valorBoletoStr);

        if (valorBoleto > conta.getSaldo()) {
            //se apenas o saldo da conta for insuficiente
            //usará o saldo especial
            if(valorBoleto <= conta.getSaldo()+
            (conta.getChequeEspecial()-conta.getChequeEspecialused())){

            // verify the value diference
            double usedChequeEspecial = valorBoleto - conta.getSaldo();

            //set value to cheque especial with the value used
            conta.setChequeEspecial(conta.getChequeEspecial()-usedChequeEspecial);
            conta.setSaldo(0.0); // Set saldo to zero after using cheque especial

            } else {
                System.out.println("Insufficient balance to pay the boleto.");
            }
        }else if(valorBoleto < conta.getSaldo()+conta.getChequeEspecial()){

            // verify the value diference
            double usedChequeEspecial = valorBoleto - conta.getSaldo();

            //set value to cheque especial with the value used
            conta.setChequeEspecial(conta.getChequeEspecial()- usedChequeEspecial);
            conta.setSaldo(0.0); // Set saldo to zero after using cheque especial
        
        } else {
            conta.setSaldo(conta.getSaldo() - valorBoleto);
            System.out.println("Boleto paid successfully! Your new balance is R$ " + conta.getSaldo());
        }
    }
    private void verificarChequeEspecial() {
        if (conta.getChequeEspecialAtivo()) {
            System.out.println("Cheque especial is active. Your limit is R$ " +
            (conta.getChequeEspecial()-conta.getChequeEspecialused()));
        } else {
            System.out.println("Cheque especial is not active.");
        }
    }
}
