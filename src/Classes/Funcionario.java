package Classes;

public abstract class Funcionario implements Trabalhavel {

    private String nome;
    private String email;
    private int matricula;
    private double valorHora;
    private int horasTrabalhadas;

    public Funcionario(){}

    public Funcionario(String nome, String email, int matricula, double valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nEmail: " + email + "\nMatricula: " + matricula + "\nValorHora: " + valorHora + "\nHorasTrabalhadas: " + horasTrabalhadas;
    }

    public abstract double calcularSalario();
}
