package Model;

public abstract class ProdutoModel {

    protected String produto;
    protected double quantia;
    protected double preco;

    public ProdutoModel(){

    }

    public void setProduto(String p){
        this.produto = p;
    }
    public String getProduto(){
        return this.produto;
    }
    public void setQuantia(double q){
        this.quantia = q;
    }
    public double getQuantia(){
        return this.quantia;
    }
    public void setPreco(double s){
        this.preco = s;
    }
    public double getPreco(){
        return this.preco;
    }
    public abstract void prod(double q,double s);
}