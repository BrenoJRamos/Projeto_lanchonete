import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> itens;

    public Carrinho(){
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        itens.add(item);
        System.out.println("O item "+item.getNome()+" foi adicionado ao carrinho.");
    }

    public void removerItem(int codigo){
        boolean encontrado = false;

        for(int x=0; x<itens.size(); x++){
            if(itens.get(x).getCodigo() == codigo){
                System.out.println("O item "+itens.get(x).getNome()+" foi removido com sucesso!");
                itens.remove(x);
                encontrado = true;
                break; //
            }
        }

        if(!encontrado){
            System.out.println("Nenhum item com o código " + codigo + " foi encontrado no carrinho.");
        }
    }

    public void calcularPreco(){
        double valor = 0;
        for(int x=0; x<itens.size(); x++){
            valor += itens.get(x).getPreco();

        }
        System.out.println("O valor total é "+valor+" em reais.");
    }

}
