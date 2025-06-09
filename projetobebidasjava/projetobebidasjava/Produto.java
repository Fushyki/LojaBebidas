// Classe abstrata Produto representa um produto genérico da loja
public abstract class Produto {
    protected String nome;
    protected double preco;
    protected int volume; // em ml

    // Construtor
    public Produto(String nome, double preco, int volume) {
        this.nome = nome;
        this.preco = preco;
        this.volume = volume;
    }

    // Getters
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getVolume() { return volume; }

    // Método abstrato a ser sobrescrito pelas subclasses
    public abstract void exibirInfo(); 
    // -> Requisito: método abstrato (✔)
}