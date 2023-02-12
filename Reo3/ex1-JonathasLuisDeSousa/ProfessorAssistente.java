public class ProfessorAssistente extends Professor {

    private int horasTrabalhadasSemana;
    private double gratificacaoAtividadeExtra;

    public ProfessorAssistente(String nome, String cpf, int horasTrabalhadasSemana, double gratificacaoAtividadeExtra) {
        super(nome, cpf);
        this.horasTrabalhadasSemana = horasTrabalhadasSemana;
        this.gratificacaoAtividadeExtra = gratificacaoAtividadeExtra;
    }

    public double getGratificacaoAtividadeExtra() {
        return gratificacaoAtividadeExtra;
    }

    public int getHorasTrabalhadasSemana() {
        return horasTrabalhadasSemana;
    }

    @Override
    public double calcularSalario() {
        return (getHorasTrabalhadasSemana() * 100) + getGratificacaoAtividadeExtra();
    }

}
