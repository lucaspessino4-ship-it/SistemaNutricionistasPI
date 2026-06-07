package sistemanutricionistaspi;

public class ItemPedido {
    private Alimento alimento;
    private double perCapita;
    private double quantidadeTotal;

    public ItemPedido(Alimento alimento, double perCapita, int numeroPessoas) {
        this.alimento = alimento;
        this.perCapita = perCapita;
        this.quantidadeTotal = perCapita * numeroPessoas;
    }

    public Alimento getAlimento() { return alimento; }
    public double getPerCapita() { return perCapita; }
    public double getQuantidadeTotal() { return quantidadeTotal; }
}
