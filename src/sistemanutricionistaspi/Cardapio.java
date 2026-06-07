package sistemanutricionistaspi;

import java.util.ArrayList;

public class Cardapio {
    private int id;
    private String nome;
    private String descricao;
    private ArrayList<ItemCardapio> itens;

    public Cardapio(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    public ArrayList<ItemCardapio> getItens() { return itens; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public int getId() { return id; }
}
