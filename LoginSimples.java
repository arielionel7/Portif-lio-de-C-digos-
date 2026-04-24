package exerciciosrepeat;

import java.util.Scanner;

public class LoginSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String SENHA_CORRETA = "java2025";
        String senhaDigitada;
        int tentativas = 0;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = input.nextLine();
            tentativas++;

            if (senhaDigitada.equals(SENHA_CORRETA)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                System.out.println("Senha incorreta. Tentativa " + tentativas + " de 3.");
            }

        } while (tentativas < 3);

        if (tentativas == 3 && !senhaDigitada.equals(SENHA_CORRETA)) {
            System.out.println("Conta bloqueada. Tente mais tarde.");
        }

        input.close();
    }
}
