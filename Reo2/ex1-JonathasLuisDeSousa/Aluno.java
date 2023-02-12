public class Aluno{

    private String nome;
    private String categoria;
    private int n;
    private int[] notas;
    private int quantidadeCadastradas;

    public Aluno(String nome, String categoria, int n ){
        this.nome = nome;

        if (!(categoria.equals("bolsista") || categoria.equals("nao bolsista"))){
            throw new IllegalArgumentException("Categoria \""+ categoria +"\" invalida!");
        }
        this.categoria = categoria;
        this.n = n;

        notas = new int[n];
    }

    public String getNome(){
        return this.nome;
    }

    public int getNota(int numeroDisciplina){
        return this.notas[numeroDisciplina - 1];
    }

    public double getCoeficienteRendimento(){
        double soma = 0;

        for (int i : notas) {
            soma += i;
        }
        return soma / n;
    }

    public String situacaoDoAluno(){
        double coeficiente = this.getCoeficienteRendimento();

        if ((this.categoria.equals("bolsista") && coeficiente < 75) || (this.categoria.equals("nao bolsista") && coeficiente < 70)){
            return "desligado";
        }else{
            return "regular"; 
        }

    }

    public void inserirNota(int valor){
        if (valor < 0 || valor > 100) {
            throw new IllegalArgumentException("As notas devem ser entre 0 e 100");
        }
        notas[quantidadeCadastradas] = valor;
        quantidadeCadastradas += 1;
    }
}
