package exercicio03;


public class Perfumaria extends Produto {

    private double precoPromo;
    private int quantidade;
    private double precoLmpm;

    public Perfumaria(int id, String nome, double preco, double desconto, double precoPromo, int quantidade, double precoLmpm) {
        super(id, nome, preco, desconto);
        this.precoPromo = precoPromo;
        this.quantidade = quantidade;
        this.precoLmpm = precoLmpm;
    }


    public double getPrecoPromo() {
        return precoPromo;
    }

    public void setPrecoPromo(double precoPromo) {
        this.precoPromo = precoPromo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoLmpm() {
        return precoLmpm;
    }

    public void setPrecoLmpm(double precoLmpm) {
        this.precoLmpm = precoLmpm;
    }
}
