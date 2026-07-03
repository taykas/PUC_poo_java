package projeto.main;

import java.util.ArrayList;
import projeto.modelo.*;
import projeto.util.InterfaceUsuario;

public class Main {

    public static void main(String[] args) {

        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<>();
        InterfaceUsuario ui = new InterfaceUsuario();

        System.out.println("=== Cadastro do primeiro financiamento ===");

        double valor = ui.pedirValorImovel();
        int prazo = ui.pedirPrazoFinanciamento();
        double taxa = ui.pedirTaxaJurosAnual();

        // Financiamento digitado pelo usuário
        listaFinanciamentos.add(new Casa(valor, prazo, taxa));

        // Demais financiamentos fixos
        listaFinanciamentos.add(new Casa(350000, 20, 0.09));

        listaFinanciamentos.add(new Apartamento(500000, 25, 0.10));
        listaFinanciamentos.add(new Apartamento(420000, 18, 0.08));

        listaFinanciamentos.add(new Terreno(180000, 15, 0.11));

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        System.out.println("\n=== RESULTADOS ===");

        for (int i = 0; i < listaFinanciamentos.size(); i++) {

            Financiamento f = listaFinanciamentos.get(i);

            double valorTotal = f.calcularTotalPagamento();

            System.out.printf(
                    "Financiamento %d - Valor do imóvel: R$ %.2f | Valor do financiamento: R$ %.2f%n",
                    i + 1,
                    f.getValorImovel(),
                    valorTotal);

            totalImoveis += f.getValorImovel();
            totalFinanciamentos += valorTotal;
        }

        System.out.printf("%nTotal de todos os imóveis: R$ %.2f%n", totalImoveis);
        System.out.printf("Total de todos os financiamentos: R$ %.2f%n", totalFinanciamentos);
    }
}