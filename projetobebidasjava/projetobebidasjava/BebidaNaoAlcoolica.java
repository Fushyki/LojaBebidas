// Subclasse de Produto (herança 2) para bebidas não alcoólicas
public class BebidaNaoAlcoolica extends Produto {
    private String temperatura;

    public BebidaNaoAlcoolica(String nome, double preco, int volume, String temperatura) {
        super(nome, preco, volume);
        this.temperatura = temperatura;
    }

    public String getTemperatura() { return temperatura; }

    // Sobrescrevendo método da superclasse (método sobrescrito)
    @Override
    public void exibirInfo() {
        System.out.println("Não Alcoólica (" + temperatura + "): " + nome + " - R$" + preco + " - " + volume + "ml");
    }
}