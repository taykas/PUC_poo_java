package projeto.util;

import java.util.Scanner;

public class InterfaceUsuario {

    private Scanner entrada;

    public InterfaceUsuario() {
        entrada = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        double valor;
        do {
            System.out.print("Digite o valor do imóvel: ");
            valor = entrada.nextDouble();

            if (valor <= 0) {
                System.out.println("Erro! O valor do imóvel deve ser positivo.");
            }

        } while (valor <= 0);

        return valor;
    }

    public int pedirPrazoFinanciamento() {
        int prazo;
        do {
            System.out.print("Digite o prazo do financiamento (em anos): ");
            prazo = entrada.nextInt();

            if (prazo <= 0) {
                System.out.println("Prazo inválido! O prazo deve ser maior que zero.");
            }

        } while (prazo <= 0);

        return prazo;
    }

    public double pedirTaxaJurosAnual() {
        double taxa;
        do {
            System.out.print("Digite a taxa de juros anual (%): ");
            taxa = entrada.nextDouble();

            if (taxa <= 0) {
                System.out.println("Taxa inválida! A taxa de juros deve ser positiva.");
            }

        } while (taxa <= 0);

        return taxa / 100; 
    }
}