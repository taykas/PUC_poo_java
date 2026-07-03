

public class Financiamento {

    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        double pagamentoMensal = (valorImovel / (prazoFinanciamento * 12)) * (1 + (taxaJurosAnual / 12));
        return pagamentoMensal;
    }

    
    public double calcularTotalPagamento() {
        double total = calcularPagamentoMensal() * prazoFinanciamento * 12;
        return total;
    }

      public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

}