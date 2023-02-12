public class Comercial extends Imovel{

    private String cnpj;
    private int duracao;

    public Comercial(String cnpj, int duracao,String endereco, double valorAluguel, double percetTaxaAdm){
        super(endereco, valorAluguel, percetTaxaAdm);
        this.cnpj = cnpj;
        this.duracao = duracao;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return this.cnpj;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    public int getDuracao(){
        return this.duracao;
    }

    @Override
    public double valorAdm() {
        // TODO Auto-generated method stub
        return (getValorAluguel() * getPercetTaxaAdm()) * (1 -(0.0075 * getDuracao()));
    }
}
