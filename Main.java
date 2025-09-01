public class Main {
    public static void main(String[] args) throws Exception {
        Item item1 = new Item("Cenoura", 10, 1);
        Item item2 = new Item("Arroz", 15, 2);
        Item item3 = new Item("Biscoito", 2, 3);

        Carrinho c = new Carrinho();

        c.adicionarItem(item1);
        c.adicionarItem(item2);
        c.adicionarItem(item3);

        c.removerItem(4);
        c.adicionarItem(item2);

        c.calcularPreco();

    }
}
