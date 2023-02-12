public class Residencial extends Imovel{

    private String cpf;
    private String categoria;

    public Residencial(String cpf, String categoria, String endereco, double valorAluguel, double percetTaxaAdm){
        super(endereco, valorAluguel, percetTaxaAdm);
        this.cpf = cpf;
        this.categoria = categoria;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return this.categoria;
    }
    
    @Override
    public double valorAdm() {
        // TODO Auto-generated method stub
        return (getValorAluguel() * getPercetTaxaAdm()) + (getCategoria().equalsIgnoreCase("local") ? 50 : 100 );
    }
}
