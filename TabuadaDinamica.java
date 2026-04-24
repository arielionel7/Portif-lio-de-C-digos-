package exerciciosrepeat;
        
import java.util.Scanner;

public class TabuadaDinamica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = input.nextInt();

        while (numero <= 0) {
            System.out.print("Número inválido! Digite novamente: ");
            numero = input.nextInt();
        }

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        input.close();
    }
}
