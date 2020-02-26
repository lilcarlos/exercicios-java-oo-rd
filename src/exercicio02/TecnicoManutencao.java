package exercicio02;

public class TecnicoManutencao extends Funcionario {


    private double adicional;
    private double bonus;

    public TecnicoManutencao(String nome, double salario, double adicional, double bonus) {
        super(nome, salario);
        this.adicional = adicional;
        this.bonus = bonus;
    }


    @Override
    public double retornarSalario() {
        var add = getSalario() + (getSalario() * (getBonus()/100));
        return((add * 13) + bonus);

    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
