import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Exemplo de tabuada
    /*
    System.out.print("Digite um número de 1 a 10: ");
    short number = sc.nextShort();

    for (short i = 0; i <= 10 ; i++) {
        System.out.println(number + " x " + i + " = " + (number * i));
    }
    */


    // Exemplo de IMC
    System.out.println("Digite seu peso em kg: ");
    String pesoStr = sc.nextLine().replace(',', '.');
    double peso = Double.parseDouble(pesoStr);

    System.out.println("Digite sua altura em metros: ");
    String alturaStr = sc.nextLine().replace(',', '.');
    double altura = Double.parseDouble(alturaStr);

    double imc = peso / (altura * altura);
    System.out.printf("Seu IMC é: %.2f\n", imc);

    sc.close();
}
