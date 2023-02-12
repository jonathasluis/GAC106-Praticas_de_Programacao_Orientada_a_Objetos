import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome, categoria;
        int n;

        System.out.print("Digite o nome do aluno: ");
        nome = input.nextLine();

        System.out.print("Insira a categoria do aluno (bolsista/nao bolsista): ");
        categoria = input.nextLine();

        System.out.print("Entre com a quantidade de disciplinas cursadas: ");
        n = input.nextInt();

        Aluno aluno = new Aluno(nome, categoria, n);

        for (int i = 1; i <= n; i++){
            System.out.printf("Insira a nota na disciplina %d: ",i);
            aluno.inserirNota(input.nextInt());
        }

        input.close();

        System.out.printf("\n############# RELATÓRIO FINAL #############\n" +
            "Coeficiente de Rendimento: %.2f\n" +
            "Situação final:  %s",aluno.getCoeficienteRendimento(),aluno.situacaoDoAluno());
    }
}
