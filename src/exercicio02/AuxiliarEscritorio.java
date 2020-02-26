package exercicio02;

public class AuxiliarEscritorio extends Funcionario {

    private double bonus;

    public AuxiliarEscritorio(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public double retornarSalario() {

        return((getSalario() * 13) + getBonus());
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
