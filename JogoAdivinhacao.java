package exerciciosrepeat;

import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroSecreto = 42;
        int tentativas = 0;
        final int MAX_TENTATIVAS = 5;
        boolean acertou = false;

        while (tentativas < MAX_TENTATIVAS && !acertou) {
            System.out.print("Adivinhe o número (1 a 100): ");
            int palpite = input.nextInt();
            tentativas++;

            int diferenca = Math.abs(numeroSecreto - palpite);

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                acertou = true;
            } else {
                if (diferenca > 20) {
                    System.out.println("Muito Frio! Tente um número mais no meio.");
                } else if (diferenca >= 10) {
                    System.out.println("Frio. Você está se aproximando!");
                } else if (diferenca >= 5) {
                    System.out.println("Quente! Está quase lá!");
                } else {
                    if (palpite > numeroSecreto) {
                        System.out.println("Muito Quente! Tente um número um pouco menor.");
                    } else {
                        System.out.println("Muito Quente! Tente um número um pouco maior.");
                    }
                }
            }
        }

        if (!acertou) {
            System.out.println("Game Over! O número secreto era " + numeroSecreto + ".");
        }

        input.close();
    }
}
