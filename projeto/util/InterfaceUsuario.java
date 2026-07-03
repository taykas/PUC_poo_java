package projeto.util;

import java.util.Scanner;

public class InterfaceUsuario {

    private Scanner entrada;

    public InterfaceUsuario() {
        entrada = new Scanner(System.in);
    }
    public double pedirValorImovel() {

        while (true) {

            try {

                System.out.print("Digite o valor do imóvel: ");
                double valor = entrada.nextDouble();

                if (valor <= 0) {
                    throw new IllegalArgumentException(
                            "O valor deve ser maior que zero.");
                }

                return valor;

            } catch (java.util.InputMismatchException e) {

                System.out.println("Digite um número válido.");
                entrada.nextLine();

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            } finally {

                System.out.println("----------------------------");

            }
        }
    }

    public int pedirPrazoFinanciamento() {

        while (true) {

            try {

                System.out.print("Digite o prazo (anos): ");
                int prazo = entrada.nextInt();

                if (prazo <= 0)
                    throw new IllegalArgumentException(
                            "Prazo inválido.");

                return prazo;

            } catch (java.util.InputMismatchException e) {

                System.out.println("Digite um número inteiro.");
                entrada.nextLine();

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }
        }
    }

    public double pedirTaxaJurosAnual() {

        while (true) {

            try {

                System.out.print("Digite a taxa anual: ");
                double taxa = entrada.nextDouble();

                if (taxa <= 0)
                    throw new IllegalArgumentException(
                            "Taxa inválida.");

                return taxa / 100;

            } catch (java.util.InputMismatchException e) {

                System.out.println("Digite um número válido.");
                entrada.nextLine();

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }
        }
    }

    public double pedirAreaConstruida() {
        System.out.print("Digite a área construída: ");
        return entrada.nextDouble();
    }

    public double pedirTamanhoTerreno() {
        System.out.print("Digite o tamanho do terreno: ");
        return entrada.nextDouble();
    }

    public int pedirVagasGaragem() {
        System.out.print("Digite o número de vagas da garagem: ");
        return entrada.nextInt();
    }

    public int pedirNumeroAndar() {
        System.out.print("Digite o número do andar: ");
        return entrada.nextInt();
    }

    public String pedirTipoZona() {
        System.out.print("Digite o tipo de zona (Residencial/Comercial): ");
        return entrada.next();
    }
}