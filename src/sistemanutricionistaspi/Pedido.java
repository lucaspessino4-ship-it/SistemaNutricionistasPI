package sistemanutricionistaspi;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private Cardapio cardapio;
    private int numeroPessoas;
    private ArrayList<ItemPedido> itensPedido;

    public Pedido(int id, Cardapio cardapio, int numeroPessoas) {
        this.id = id;
        this.cardapio = cardapio;
        this.numeroPessoas = numeroPessoas;
        this.itensPedido = new ArrayList<>();
        gerarPedido();
    }

    private void gerarPedido() {
        for (ItemCardapio item : cardapio.getItens()) {
            ItemPedido itemPedido = new ItemPedido(
                    item.getAlimento(),
                    item.getPerCapita(),
                    numeroPessoas
            );
            itensPedido.add(itemPedido);
        }
    }

    public void exibirPedido() {
        System.out.println("PEDIDO GERADO");
        System.out.println("Cardápio: " + cardapio.getNome());
        System.out.println("Número de pessoas: " + numeroPessoas);
        System.out.println("--------------------------------");

        for (ItemPedido item : itensPedido) {
            System.out.println("Alimento: " + item.getAlimento().getNome());
            System.out.println("Per capita: " + item.getPerCapita() + " " + item.getAlimento().getUnidadeMedida());
            System.out.println("Quantidade total: " + item.getQuantidadeTotal() + " " + item.getAlimento().getUnidadeMedida());
            System.out.println("--------------------------------");
        }
    }

    public int getId() { return id; }
    public Cardapio getCardapio() { return cardapio; }
    public int getNumeroPessoas() { return numeroPessoas; }
    public ArrayList<ItemPedido> getItensPedido() { return itensPedido; }
}
