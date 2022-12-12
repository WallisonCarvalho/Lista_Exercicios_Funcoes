import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    int continua = 1;

    while (continua == 1) {

      System.out.print("Digite a Hora:");
      int hora = sc.nextInt();

      System.out.print("Digite os minutos:");
      int minuto = sc.nextInt();

      Conversao(hora, minuto);

    }
    sc.close();
  }

  public static void Conversao(int h, int m) {
    int result = 0;

    if (h > 12) {
      result = h - 12;
      RetornoHoras(result, m);
    } else {
      System.out.println(h + ":" + m + " AM");
    }
  }

  public static void RetornoHoras(int hora, int minuto) {

    System.out.println(hora + ":" + minuto + " PM");

  }
}
