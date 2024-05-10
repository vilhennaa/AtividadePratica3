package Classes;

public class Desenvolvedor extends Funcionario implements Trabalhavel {

    private String tecnologiasDominadas;

    public Desenvolvedor() {}

    public Desenvolvedor(String nome, String email, int matricula, double valorHora, int horasTrabalhadas, String tecnologiasDominadas) {
        super(nome, email, matricula, valorHora, horasTrabalhadas);
        this.tecnologiasDominadas = tecnologiasDominadas;
    }

    public String getTecnologiasDominadas() {
        return tecnologiasDominadas;
    }

    public void setTecnologiasDominadas(String tecnologiasDominadas) {
        this.tecnologiasDominadas = tecnologiasDominadas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTecnologias dominadas: " + tecnologiasDominadas;
    }

    @Override
    public String trabalhar() {
        return "O Desenvolvedor " + getNome() + " está programando em " + getTecnologiasDominadas();
    }

    @Override
    public String relatarProgresso() {
        return "O Desenvolvedor " +getNome()+ " commitou seu codigo";
    }

    @Override
    public double calcularSalario() {
        return (getHorasTrabalhadas() * getValorHora());
    }
}
