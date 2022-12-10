import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      Scanner sc = new Scanner(System.in);
  
        System.out.print("Digite um número: ");
        String numero = sc.next();

        sc.close();

      System.out.println("A quantidade de números informado é: " + NumeroLength(numero));

    }

    public static int NumeroLength(String numero){

      int total = numero.length();

      return total;
    }
}
