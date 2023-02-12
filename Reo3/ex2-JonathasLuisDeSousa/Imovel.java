public class Imovel {

    private String endereco;
    private double valorAluguel;
    private double percetTaxaAdm;

    public Imovel (String endereco, double valorAluguel, double percetTaxaAdm) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.percetTaxaAdm = percetTaxaAdm;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }

    public void setValorAluguel(double valor){
        this.valorAluguel = valor;
    }
    public double getValorAluguel(){
        return this.valorAluguel;
    }

    public void setPercetTaxaAdm(double taxa){
        this.percetTaxaAdm = taxa;
    }
    public double getPercetTaxaAdm(){
        return this.percetTaxaAdm;
    }
    
    public double valorAdm(){
        return 0d;
    }

    @Override
    public String toString() {

        String retorno = "Tipo do Imóvel: ";

        if (this instanceof Residencial){
            retorno += "Residencial\n";
        }else{
            retorno += "Comercial\n";
        }

        retorno += "Endereço: " + this.getEndereco() + "\n" + "Valor de Adm (R$): " + String.format("%.2f", valorAdm()) + "\n";

        return retorno;
    }
}
