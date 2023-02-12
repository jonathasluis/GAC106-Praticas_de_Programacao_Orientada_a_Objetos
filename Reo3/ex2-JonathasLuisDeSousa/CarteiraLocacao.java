import java.util.ArrayList;

public class CarteiraLocacao {

    private ArrayList<Imovel> imoveis;

    public CarteiraLocacao(){
        imoveis = new ArrayList<>();
    }

    public void cadastrarImovel(Imovel ... imovel){
        for (Imovel i : imovel) {
            imoveis.add(i);
        }
    }

    public void imprimirCarteira(){
        for (Imovel i : imoveis) {
            System.out.println(i);
        }
    }
}
