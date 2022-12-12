import java.util.Scanner;

public class Taxas {
  
  public static Scanner sc = new Scanner(System.in);

  public static void valorPagamento(double valorPrestacao, int diaAtraso) {

    int resultCount = 1;
    double soma = 0;
    double taxaAtrasoDia = 0;
    double taxaAtraso = 0;
    double rtn = 0;
   

   
    while (valorPrestacao != 0) {

      if (diaAtraso > 0) {
        taxaAtraso = valorPrestacao * 0.03;
        taxaAtrasoDia = valorPrestacao * 0.01;
        taxaAtrasoDia = taxaAtrasoDia * diaAtraso;
        rtn = valorPrestacao + taxaAtraso + taxaAtrasoDia;
        valorPrestacao = rtn;
        soma = soma + valorPrestacao;
      }

      System.out.printf("O valor a ser pago é: R$ %.2f ", valorPrestacao);
      System.out.println(" ");
      resultCount++;
      System.out.println("---------------------------------------------------");
      System.out.println("Prestação número: " + resultCount);
      System.out.println("Qual o valor da prestação? ");
      valorPrestacao = sc.nextDouble();
      System.out.println("Qual o número de dias em atraso? ");
      diaAtraso = sc.nextInt();

      
    }
    sc.close();
    System.out.println("|----------------Resultado do dia---------------------|");
    System.out.println("Quantidade de prestações pagas no dia: " + resultCount);
    System.out.printf("Valor pago das prestações no dia: %.2f ", soma);
  }

}
