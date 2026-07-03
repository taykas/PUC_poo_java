package projeto.main;

import java.util.ArrayList;
import projeto.modelo.*;
import projeto.util.InterfaceUsuario;

public class Main {

    public static void main(String[] args) {

        InterfaceUsuario ui = new InterfaceUsuario();

        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<>();

        System.out.println("=== Cadastro da Casa ===");

        double valor = ui.pedirValorImovel();
        int prazo = ui.pedirPrazoFinanciamento();
        double taxa = ui.pedirTaxaJurosAnual();

        double area = ui.pedirAreaConstruida();
        double terreno = ui.pedirTamanhoTerreno();

        listaFinanciamentos.add(
                new Casa(valor, prazo, taxa, area, terreno));

        listaFinanciamentos.add(
                new Casa(350000, 20, 0.09, 180, 300));

        listaFinanciamentos.add(
                new Apartamento(500000, 25, 0.10, 2, 8));

        listaFinanciamentos.add(
                new Apartamento(420000, 18, 0.08, 1, 5));

        listaFinanciamentos.add(
                new Terreno(180000, 15, 0.11, "Residencial"));

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        System.out.println("\n=== RESULTADOS ===");

        for (Financiamento f : listaFinanciamentos) {

            double total = f.calcularTotalPagamento();

            System.out.printf(
                    "Imóvel: R$ %.2f | Total do financiamento: R$ %.2f%n",
                    f.getValorImovel(),
                    total);

            totalImoveis += f.getValorImovel();
            totalFinanciamentos += total;
        }

        System.out.printf("%nTotal dos imóveis: R$ %.2f%n", totalImoveis);
        System.out.printf("Total dos financiamentos: R$ %.2f%n", totalFinanciamentos);
    }
}