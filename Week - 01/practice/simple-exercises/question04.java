import java.util.Scanner;

public class question04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome = scanner.nextLine();

        System.err.println("Olá " + nome + "!");
    }
}