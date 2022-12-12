
public class App {
    public static void main(String[] args) throws Exception {

      double retorno = somaImposto(10, 2);

      System.out.printf("Valor após os impostos: R$ %.2f", retorno);
     
    }

    public static double somaImposto(double custo, double taxaImposto){

    double preco = custo - taxaImposto;
    return preco;
    }
}
