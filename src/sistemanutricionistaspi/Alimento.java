package sistemanutricionistaspi;

public class Alimento {
    private int id;
    private String nome;
    private String categoria;
    private String unidadeMedida;

    public Alimento(int id, String nome, String categoria, String unidadeMedida) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.unidadeMedida = unidadeMedida;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public String getUnidadeMedida() { return unidadeMedida; }
}
