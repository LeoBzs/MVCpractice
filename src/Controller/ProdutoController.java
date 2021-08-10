package Controller;

import Model.ClienteModel;
import Model.CompraModel;

public class ProdutoController{

    public static ClienteModel clienteModel = new ClienteModel();
    public static CompraModel compraModel = new CompraModel();

    public int Escolha() {
        System.out.println("choose! 1 for food,2 for cleaning supplies");
        return Inputs.leInt();
    }

    public void CompraCompleta() {
        switch (Escolha()) {
            case 1:
                System.out.println();
                System.out.println("Temos no menu: ala minuta pronta, que é 25 reais, e insumo genérico que é 5 reais por unidade. digite 1 para ala minuta e 2 para insumo digite a quantia que você quer.   \n");
                int escolhaC = Inputs.leInt();

                if (escolhaC == 1) {
                    System.out.println("Digite a quantia desejada:  \n");
                    int quanC = Inputs.leInt();
                    compraModel.prod(quanC, 25.0);
                } else if (escolhaC == 2) {
                    System.out.println("Digite a quantia desejada:  \n");
                    int quanC2 = Inputs.leInt();
                    compraModel.prod(quanC2, 5.0);
                } else {
                    System.out.println("Digite algo válido.  \n");
                }
                break;

            case 2:
                System.out.println();
                System.out.println("Temos: insumos de limpeza por 30 reais e detergente com esponja por 10 reais. digite 1 para insumos e 2 para a outra opção.   \n");
                int escolhaL = Inputs.leInt();

                if (escolhaL == 1) {
                    System.out.println("Digite a quantia desejada: ");
                    int quanL = Inputs.leInt();
                    compraModel.prod(quanL, 30.0);
                } else if (escolhaL == 2) {
                    System.out.println("Digite a quantia desejada: ");
                    int quanL2 = Inputs.leInt();
                    compraModel.prod(quanL2, 10.0);
                } else {
                    System.out.println("Digite algo válido.");
                }
                break;
        }

        if (compraModel.getDividaCompra() != 0) {

            System.out.println("O seu pedido deu: $" + compraModel.getDividaCompra() + "\n");
            System.out.println("Como pretende pagar? aceitamos dinheiro, cartão e cheque especial(digite em lower case)  \n");

            String granita = Inputs.leString();

            if (granita.equals("dinheiro")) {
                System.out.println("Digite quanto dinheiro vc tem: ");
                int dinheiru1 = Inputs.leInt();
                clienteModel.prod(dinheiru1, compraModel.getDividaCompra());
            } else if (granita.equals("cartão")) {
                System.out.println("Digite quanto dinheiro seu cartão tem (só aceitamos débito): ");
                int cartaum1 = Inputs.leInt();
                clienteModel.prod(cartaum1, compraModel.getDividaCompra());
            } else {
                System.out.println("Digite quanto dinheiro seu cheque tem: ");
                int cheque1 = Inputs.leInt();
                clienteModel.prod(cheque1, compraModel.getDividaCompra());
            }

        } else {
            System.out.println("Nothing was bought");
        }
    }
}