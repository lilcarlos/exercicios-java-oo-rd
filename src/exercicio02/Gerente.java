package exercicio02;

public class Gerente extends Funcionario {

    private double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double retornarSalario() {
        return((getSalario() * 13) + (getSalario() * (getBonusAnual()/100)));

    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
}


