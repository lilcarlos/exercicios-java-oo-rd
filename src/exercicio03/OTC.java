package exercicio03;


public class OTC extends Produto {

    private double precoPromo;

    public OTC(int id, String nome, double preco, double desconto, double precoPromo) {
        super(id, nome, preco, desconto);
        this.precoPromo = precoPromo;
    }


    public double getPrecoPromo() {
        return precoPromo;
    }

    public void setPrecoPromo(double precoPromo) {
        this.precoPromo = precoPromo;
    }
}
