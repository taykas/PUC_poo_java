package projeto.main;

import projeto.modelo.Financiamento;
import projeto.util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<>();
        InterfaceUsuario ui = new InterfaceUsuario();

        System.out.println("=== Cadastro de Financiamentos ===");

        for (int i = 1; i <= 4; i++) {
            System.out.println("\n--- Financiamento " + i + " ---");

            double valorImovel = ui.pedirValorImovel();
            int prazo = ui.pedirPrazoFinanciamento();
            double taxa = ui.pedirTaxaJurosAnual();

            Financiamento financiamento = new Financiamento(valorImovel, prazo, taxa);
            listaFinanciamentos.add(financiamento);
        }

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        System.out.println("\n=== RESULTADOS ===");
        for (int i = 0; i < listaFinanciamentos.size(); i++) {
            Financiamento f = listaFinanciamentos.get(i);
            double valorTotal = f.calcularTotalPagamento();

            System.out.printf("Financiamento %d - valor do imóvel: R$ %.2f, valor do financiamento: R$ %.2f%n",
                    (i + 1), f.getValorImovel(), valorTotal);

            totalImoveis += f.getValorImovel();
            totalFinanciamentos += valorTotal;
        }

        System.out.printf("%nTotal de todos os imóveis: R$ %.2f%n", totalImoveis);
        System.out.printf("Total de todos os financiamentos: R$ %.2f%n", totalFinanciamentos);
    }
}
