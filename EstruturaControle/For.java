
public class For {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Digite um nome: ");
        //     String nome = sc.nextLine();

        //     if (nome.equalsIgnoreCase("exit")) break;
        // }

        // sc.close();
        // System.out.println("Programa encerrado.");


        for (int i = 0; i < 5; i+=2) {
            System.out.println("Valor de i: " + i);
        }

        for (String arg : args) {
            System.out.println("Argumento: " + arg);
        }
    }
}
