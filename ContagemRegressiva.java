package exerciciosrepeat;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String confirmacao;

        do {
            System.out.print("Digite a palavra de segurança (PRONTO) para iniciar: ");
            confirmacao = input.nextLine();
        } while (!confirmacao.equals("PRONTO"));

        int contagem = 10;
        while (contagem >= 1) {
            System.out.println("Contagem: " + contagem);
            contagem--;
        }

        System.out.println("Lançamento!");
        input.close();
    }
}
