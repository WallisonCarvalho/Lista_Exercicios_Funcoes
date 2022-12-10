public class App {
    public static void main(String[] args) throws Exception {

      double result = Somar(10, 20, 30);

      System.out.printf("%.2f", result);
     
    }
    public static double Somar(double n1, double n2, double n3){

        double soma = n1 + n2 + n3;

        return soma;
    }
}
