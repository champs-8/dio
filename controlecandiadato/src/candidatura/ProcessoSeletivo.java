package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // System.out.println("Bem-vindo ao Processo Seletivo!");
        // selecaoCandidatos();
        // imprimirCandidatosSelecionados("Joao, Maria, Xitaozinho, Xororó, Zezé de Camargo".split(", "));
        fazerLigacao();
    }
    
    static double salarioBase = 2000.00; // Exemplo de salário base

    static void selecaoCandidatos(){
        String[] candidatos = {
            "João", "Maria",
            "Irineu", "Clotilde",
            "It a coisa", "Taldo",
            "Naldo Beni", "Xitaozinho",
            "Xororó", "Zezé de Camargo"
        };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
    
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf(
                "O candidato %s solicitou este valor de salário: R$ %.2f%n",
                candidato, salarioPretendido);

            if (salarioBase >= salarioPretendido){
                candidatosSelecionados++;
                System.out.printf("Candidato %s selecionado!%n", candidato);
            }
            candidatoAtual++;
        }
    }

    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        if (salarioPretendido < salarioBase) {
            System.out.println("Call to candidate");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para oferecer contra proposta");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }

    static void imprimirCandidatosSelecionados(String[] candidatos) {
        System.out.println("Candidatos selecionados:");
        for (String candidato : candidatos) {
            System.out.println(candidato);
        }
    }
    static void fazerLigacao() {
        String[] candidatos ={"Joao, Maria, Xitaozinho, Xororó, Zezé de Camargo"};
        for (String candidato : candidatos) {
            System.out.printf("Ligando para %s...%n", candidato);
            int tentativasRealizadas = 1;
            boolean continuaTentando = true;
            boolean atendeu = false;

            do{
                atendeu = atender();
                continuaTentando = !atendeu;
                if(continuaTentando){
                    tentativasRealizadas++;
                    System.out.printf("Tentativa %d: %s não atendeu, tentando novamente...%n",
                        tentativasRealizadas, candidato);
                }else{
                    System.out.println("Ligação atendida!");
                }
            }while(continuaTentando && tentativasRealizadas <= 3);
            if (atendeu) {
                System.out.printf("Ligação para %s concluída com sucesso!%n Na %s tentiva", candidato, tentativasRealizadas);
            } else {
                System.out.printf("Não foi possível falar com %s após 3 tentativas.%n", candidato);
                
            }
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
}
