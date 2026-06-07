package sistemanutricionistaspi;

public class Principal {
    public static void main(String[] args) {
        Alimento arroz = new Alimento(1, "Arroz", "Grãos", "kg");
        Alimento feijao = new Alimento(2, "Feijão", "Grãos", "kg");
        Alimento frango = new Alimento(3, "Frango", "Proteína", "kg");

        Cardapio cardapioAlmoco = new Cardapio(1, "Almoço Escolar", "Cardápio básico para almoço");
        cardapioAlmoco.adicionarItem(new ItemCardapio(arroz, 0.08));
        cardapioAlmoco.adicionarItem(new ItemCardapio(feijao, 0.06));
        cardapioAlmoco.adicionarItem(new ItemCardapio(frango, 0.12));

        Pedido pedido = new Pedido(1, cardapioAlmoco, 100);
        pedido.exibirPedido();
    }
}
