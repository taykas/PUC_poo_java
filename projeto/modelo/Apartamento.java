package projeto.modelo;

public class Apartamento extends Financiamento {

    private int vagasGaragem;
    private int numeroAndar;

    public Apartamento(double valorImovel,
                       int prazoFinanciamento,
                       double taxaJurosAnual,
                       int vagasGaragem,
                       int numeroAndar) {

        super(valorImovel, prazoFinanciamento, taxaJurosAnual);

        this.vagasGaragem = vagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    @Override
    public double calcularPagamentoMensal() {

        double totalPagamento =
                getValorImovel()
                * (1 + (getTaxaJurosAnual() * getPrazoFinanciamento()));

        return totalPagamento / (getPrazoFinanciamento() * 12);
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }
}