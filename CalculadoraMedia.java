package exerciciosrepeat;

import java.util.Scanner;


public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota, soma = 0;
        int contador = 0;

        System.out.println("Digite as notas (-1 para encerrar): ");
        nota = input.nextDouble();

        while (nota != -1) {
            soma += nota;
            contador++;
            nota = input.nextDouble();
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Quantidade de notas: " + contador);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        input.close();
    }
}

