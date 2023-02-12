import java.util.Scanner;

public class TesteCarro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int qtdItens = 0;
        Double soma = 0d;

        System.out.print("Digite o modelo do carro (Up/Voyage/Virtus): ");
        Carro carro = new Carro(input.nextLine());

        System.out.print("Entre com a quantidade de acessórios desejados: ");
        qtdItens = input.nextInt();

        for (int i = 0; i < qtdItens; i++){
            System.out.printf("Insira o código do %dº acessório desejado (0: banco de couro, 1: som, 2: insulfilm): ",i+1);
            carro.addAcessorio(input.nextInt());
        }

        input.close();

        for (int i = 0; i < carro.getQuantidadeItens(); i++) {
            int codItem = carro.getCodAcessorio(i);

            switch (codItem) {
                case 0:
                    soma += 1500;
                    break;
                case 1:
                    soma += 850;
                    break;
                case 2:
                    soma += 200;
                    break;
            }
        }

        System.out.printf("\n############### NOTA FISCAL ###############\n"+
            "Carro: %s\n"+
            "Quantidade de itens: %d\n"+
            "Preço dos Acessórios = %.2f",carro.getModelo(),carro.getQuantidadeItens(),soma);


    }
    
}
