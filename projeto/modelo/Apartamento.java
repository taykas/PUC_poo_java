package projeto.modelo;

public class Apartamento extends Financiamento {

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    @Override
    public double calcularPagamentoMensal() {

        double totalPagamento =
                getValorImovel() *
                (1 + (getTaxaJurosAnual() * getPrazoFinanciamento()));

        return totalPagamento / (getPrazoFinanciamento() * 12);
    }
}