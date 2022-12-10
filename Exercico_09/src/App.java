import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    String numero = sc.next();
    NumeroReverso(numero);

    sc.close();

  }

  public static void NumeroReverso(String numero) {

    System.out.println("O reverso do número informado é: " + new StringBuilder(numero).reverse().toString());
   
  }
}
