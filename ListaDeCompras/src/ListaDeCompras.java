import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Item> itens;

    public ListaDeCompras(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }
    public void removerItem(Item item){
        itens.remove(item);
    }

    public List<Item> listarItens(){
        return itens;
    }
}
