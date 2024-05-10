package Classes;

public class Gerente extends Funcionario implements Trabalhavel {

    private double bonusAnual;
    private String equipeGerenciada;

    public Gerente() {}

    public Gerente(String nome, String email, int matricula, double valorHora, int horasTrabalhadas, double bonusAnual, String equipeGerenciada) {
        super(nome, email, matricula, valorHora, horasTrabalhadas);
        this.bonusAnual = bonusAnual;
        this.equipeGerenciada = equipeGerenciada;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public String getEquipeGerenciada() {
        return equipeGerenciada;
    }

    public void setEquipeGerenciada(String equipeGerenciada) {
        this.equipeGerenciada = equipeGerenciada;
    }



    @Override
    public String toString() {
        return super.toString() + "\nBônus anual: " + bonusAnual + "\nEquipe gerenciada: " + equipeGerenciada;
    }

    @Override
    public String trabalhar() {
        return "O Classes.Gerente " + getNome() + " está gerenciando a equipe " + getEquipeGerenciada();
    }

    @Override
    public String relatarProgresso() {
        return "O Classes.Gerente " + getNome() + " progrediu";
    }

    @Override
    public double calcularSalario() {
        return (getValorHora() * getHorasTrabalhadas()) + (bonusAnual / 12);
    }

}
