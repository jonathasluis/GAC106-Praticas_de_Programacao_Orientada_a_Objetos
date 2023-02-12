import java.util.ArrayList;

public class Carro {

    private String modelo;
    private ArrayList<Integer> acessorios;

    public Carro(String modelo){
        this.modelo = modelo;
        acessorios = new ArrayList<Integer>();
    }

    public String getModelo(){
        return modelo;
    }

    public int getQuantidadeItens(){
        return acessorios.size();
    }

    public int getCodAcessorio(int posicao){
        return acessorios.get(posicao);
    }

    public void addAcessorio(int codigo){
        if (codigo >=0 && codigo <= 2)
            acessorios.add(codigo);
    }

}
