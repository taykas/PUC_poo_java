import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new scanner(System.in);

        System.out.print("digite um número: ");

        int numero = scanner.nextInt();

        if(numero > 0) {
            System.out.println("O núemro é positivo")
        } else if (numero < 0) {
            System.out.println("O número é negativo")
        } else {
            System.out.println("O número é zero")
        }

    }

}