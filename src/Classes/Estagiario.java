package Classes;

public class Estagiario extends Funcionario implements Trabalhavel {

    private String supervisor;

    public Estagiario() {}

    public Estagiario(String nome, String email, int matricula, double valorHora, int horasTrabalhadas, String supervisor) {
        super(nome, email, matricula, valorHora, horasTrabalhadas);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSupervisor: " + supervisor;
    }

    @Override
    public String trabalhar() {
        return "O Estagiário " + getNome() + " varreu o chão da empresa";
    }

    @Override
    public String relatarProgresso() {
        return "O Estagiário " + getNome() + " relatou seu progresso para o supervisor " + supervisor;
    }

    @Override
    public double calcularSalario() {
        return (getHorasTrabalhadas() * getValorHora());
    }
}
