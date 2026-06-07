package sistemanutricionistaspi;

public class ItemCardapio {
    private Alimento alimento;
    private double perCapita;

    public ItemCardapio(Alimento alimento, double perCapita) {
        this.alimento = alimento;
        this.perCapita = perCapita;
    }

    public Alimento getAlimento() { return alimento; }
    public double getPerCapita() { return perCapita; }
}
