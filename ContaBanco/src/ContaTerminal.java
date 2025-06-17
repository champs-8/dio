import java.util.Scanner;

public class ContaTerminal {
  public static void main(String args[]) {
    client(); // calling method
  }
  
  //method for to inform bankers datas
  public static void client(){
      Scanner sc = new Scanner(System.in); //instance of the scanner
      
      System.out.print("Please, inform your agency number: ");
      String agency = sc.nextLine();
      
      System.out.print("Please, inform your account of number: ");
      int account = sc.nextInt();
      
      sc.nextLine();
      System.out.print("Now, inform your name and lastname: ");
      String name = sc.nextLine();
      
      System.out.print("Finally, inform the value of deposity: ");
      double balance = sc.nextDouble();
      
      System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua Agência é [%s], conta [%d] e seu saldo é de R$%.2f.", name, agency, account, balance);
      
      sc.close(); //closing the scanner
  }
}
