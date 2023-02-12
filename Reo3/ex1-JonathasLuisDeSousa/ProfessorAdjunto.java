public class ProfessorAdjunto extends Professor {

    private double gratificacaoTitulacao;
    private double salarioBase;

    public ProfessorAdjunto(String nome, String cpf, double gratificacaoTitulacao, double salarioBase) {
        super(nome, cpf);
        this.gratificacaoTitulacao = gratificacaoTitulacao;
        this.salarioBase = salarioBase;
    }

    public double getGratificacaoTitulacao() {
        return gratificacaoTitulacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double calcularSalario() {
        return 1.3 * (getGratificacaoTitulacao() + getSalarioBase());
    }
}
