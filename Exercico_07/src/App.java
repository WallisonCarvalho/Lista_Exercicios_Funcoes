import java.util.Scanner;

public class App {
  
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {

    double valorPrestacao = 0;

    System.out.println("---------------------------------------------------");
    System.out.println("Prestação número: 1" );
    System.out.print("Qual o valor da prestação? ");
    valorPrestacao = sc.nextDouble();
    System.out.print("Qual o número de dias em atraso? ");
    int diaAtraso = sc.nextInt();
    

    Taxas.valorPagamento(valorPrestacao, diaAtraso);

  }

}
