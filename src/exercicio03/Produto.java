package exercicio03;

public class Produto {

    private int Id;
    private String nome;
    private double preco;
    private double desconto;


    public Produto(int id, String nome, double preco, double desconto) {
        Id = id;
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }




    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}

