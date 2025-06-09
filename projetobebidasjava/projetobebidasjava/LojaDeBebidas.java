import java.util.ArrayList;

// Classe LojaDeBebidas representa a loja e contém o estoque (coleção de objetos)
public class LojaDeBebidas {
    private ArrayList<Produto> estoque; // ✔ coleção de objetos (ArrayList)

    public LojaDeBebidas() {
        estoque = new ArrayList<>();
        carregarProdutos();
    }

    // Carrega produtos no estoque
    private void carregarProdutos() {
        estoque.add(new BebidaAlcoolica("Cerveja", 5.99, 350, "Gelada"));
        estoque.add(new BebidaAlcoolica("Vinho", 29.99, 750, "Ambiente"));
        estoque.add(new BebidaAlcoolica("Vodka", 19.99, 500, "Gelada"));
        estoque.add(new BebidaNaoAlcoolica("Refrigerante", 4.50, 600, "Gelada"));
        estoque.add(new BebidaNaoAlcoolica("Suco Natural", 6.00, 300, "Ambiente"));
        estoque.add(new BebidaNaoAlcoolica("Água", 2.50, 500, "Gelada"));
    }

    public void listarAlcoolicas() {
        for (Produto p : estoque) {
            if (p instanceof BebidaAlcoolica) {
                p.exibirInfo(); // ✔ chamada polimórfica (método abstrato)
            }
        }
    }

    public void listarNaoAlcoolicas() {
        for (Produto p : estoque) {
            if (p instanceof BebidaNaoAlcoolica) {
                p.exibirInfo(); // ✔ chamada polimórfica (método abstrato)
            }
        }
    }

    public Produto buscarProduto(String nome) {
        for (Produto p : estoque) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }
}