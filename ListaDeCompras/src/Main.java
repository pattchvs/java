import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeCompras listaDeCompras = new ListaDeCompras();

        while(true){
            System.out.println("\n=== Lista de Compras ===");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Remover Item");
            System.out.println("3. Listar Itens");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite o nome do item a ser adicionado: ");
                    String nomeItem = scanner.nextLine();
                    Item item = new Item(nomeItem);
                    listaDeCompras.adicionarItem(item);
                    System.out.println("Item "+ nomeItem +" adicionado à lista");
                    break;
                case 2:
                    System.out.print("Digite o nome do item a ser removido: ");
                    String nomeItemRemover = scanner.nextLine();
                    List<Item> itens = listaDeCompras.listarItens();
                    for (Item i : itens){
                        if(i.getNome().equalsIgnoreCase(nomeItemRemover)){
                            listaDeCompras.removerItem(i);
                            System.out.println("Item " + nomeItemRemover + " removido com sucesso.");
                            break;
                        }
                    }
                    break;
                case 3:
                    List<Item> listaItens = listaDeCompras.listarItens();
                    if(listaItens.isEmpty()){
                        System.out.println("A lista de compras está vazia.");
                    } else{
                        System.out.println("Itens na lista de compras:");
                        for (Item listItem :listaItens){
                            System.out.println(listItem.getNome());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
    }
}