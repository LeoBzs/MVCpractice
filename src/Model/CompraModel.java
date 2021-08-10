package Model;

public class CompraModel extends ProdutoModel {
    double dividaCompra;

    public CompraModel(){
        super();
    }
    public void setDividaCompra(double k){
        this.dividaCompra = k;
    }
    public double getDividaCompra(){
        return this.dividaCompra;
    }

    @Override
    public void prod(double q, double s){
        double aritmetica = (q*s);
        this.setDividaCompra(this.getDividaCompra()+aritmetica);
        System.out.println("------>  $" +this.dividaCompra);
    }
}