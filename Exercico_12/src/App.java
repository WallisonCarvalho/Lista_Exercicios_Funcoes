import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Informe um nome: ");
    String s = ler.nextLine().toUpperCase();

    ler.close();

    System.out.println("Saída nome embaralhado e com caixa alta: " + shuffleString(s));
  }
  public static String shuffleString(String s) {
    List<String> letters = new ArrayList<String>();
    String temp = "";

    for (int i = 0; i < s.length(); i++) {
      letters.add(String.valueOf(s.charAt(i)));
    }

    Collections.shuffle(letters);

    for (int i = 0; i < s.length(); i++) {
      temp += letters.get(i);
    }
    return temp;
  }

}
