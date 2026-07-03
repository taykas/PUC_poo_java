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

        double juros = pagamento - (getValorImovel() / (getPrazoFinanciamento() * 12));

        try {

            if (240 > (juros / 2)) {
                throw new AumentoMaiorDoQueJurosException(
                        "O aumento de R$240 é maior que a metade dos juros da mensalidade.");
            }

        } catch (AumentoMaiorDoQueJurosException e) {

            System.out.println(e.getMessage());

        }

        return pagamento + 240;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }
}