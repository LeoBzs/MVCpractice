package Model;
import java.util.Vector;

public class ClienteModel extends ProdutoModel {

    double dividaPagar;

    public ClienteModel(){
        super();
    }
    public void setDivP(double h){
        this.dividaPagar = h;
    }
    public double getDivP(){
        return this.dividaPagar;
    }

    public void troco(double v){
        int[] dinheiro = {1, 2, 5, 10, 20,
                50, 100, 200};
        int n = dinheiro.length;
        Vector<Integer> vetor = new Vector<>();
        for (int i = n - 1; i >= 0; i--){
            while (v >= dinheiro[i]){
                v -= dinheiro[i];
                vetor.add(dinheiro[i]);
            }
        }
        for (int i = 0; i < vetor.size(); i++){
            System.out.print(
                    " " + vetor.elementAt(i));
        }
    }
    @Override
    public void prod(double q, double s){
        double arit4 = (q-s);
        this.setDivP(this.getDivP()+arit4);
        System.out.println("Seu balanço atual ------>  $" +this.dividaPagar);
        //numero de notas mínimas
        System.out.print("trocado: ");
        this.troco(this.dividaPagar);

        if (this.dividaPagar<0){
            System.out.println();
            System.out.println("   Você está nos devendo ! >:( ! Mas ok, compreensível, a crise está difícil não é mesmo? Nos pague quando puder ;)   ");
        }
    }
}