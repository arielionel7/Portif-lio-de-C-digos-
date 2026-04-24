import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente c = new Cliente();
        Empresa e = new Empresa();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Novo Cliente");
            System.out.println("2 - Nova Empresa");
            System.out.println("3 - Listar Dados Cliente");
            System.out.println("4 - Listar Dados Empresa");
            System.out.println("5 - Finalizar");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String n = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    c.setDados(n, "Rua A, 123", "9999-9999", cpf);
                    break;
                case 2:
                    System.out.print("Nome da Empresa: ");
                    String ne = scanner.nextLine();
                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();
                    e.setDados(ne, "Av. Central, 500", "8888-8888", cnpj);
                    break;
                case 3:
                    System.out.println(c.getDados());
                    break;
                case 4:
                    System.out.println(e.getDados());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}