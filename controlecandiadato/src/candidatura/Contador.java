package candidatura;

import java.util.InputMismatchException;
import java.util.Scanner;

import candidatura.exceptions.ParametrosInvalidosException;

public class Contador {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        try {
            System.out.println("===== Digite dois números inteiros ======");

            System.out.println("Digite o primeiro número:");
            int number1 = sc.nextInt();
            System.out.println("Digite o segundo número:");
            int number2 = sc.nextInt();

            validarParametros(number1, number2);
                
        } catch (ParametrosInvalidosException e) {
        System.out.println("Erro: " + e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("Erro: Você deve digitar apenas números inteiros.");
        } finally {
            sc.close();
        }
    }

    static void contar(int number1, int number2){
        int diferenca = number2 - number1;
        
        for(int i = 1; i <= diferenca; i++){

            String resultado = String.format("Imprimindo o numéro %s...", i);
            System.out.println(resultado);
        }
    }

    static void validarParametros(int number1, int number2) throws ParametrosInvalidosException {
        if (number1 >= number2) {
            throw new ParametrosInvalidosException();
        }
        
        contar(number1, number2);
    }
}
