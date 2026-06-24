
import java.util.Scanner;

public class question05 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");

        int idade = scanner.nextInt();


        System.out.println("Nome: " + nome + "\nIdade: " + idade);

    }
}