package projeto.modelo;

public class Casa extends Financiamento {

    private double areaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel,
                int prazoFinanciamento,
                double taxaJurosAnual,
                double areaConstruida,
                double tamanhoTerreno) {

        super(valorImovel, prazoFinanciamento, taxaJurosAnual);

        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {

        double pagamento =
                (getValorImovel() / (getPrazoFinanciamento() * 12))
                * (1 + (getTaxaJurosAnual() / 12));

        return pagamento + 240;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }
}