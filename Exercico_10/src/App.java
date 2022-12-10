import java.util.ArrayList;
import java.util.Random;

public class App {

  public static void main(String[] args) throws Exception {

    GeradorDeNumeros();

  }

  public static  void GeradorDeNumeros() {

    var gerador = new Random();
    int recebeNumero = 0;
    ArrayList<Integer> array = new ArrayList<Integer>();
    int lastIdx = 0;
    

    do{
      for (int i = 0; i < 1; i++) {

        recebeNumero = gerador.nextInt(12);
        array.add(recebeNumero);
      }
      
  
      if (array.get(lastIdx) == 7 || array.get(lastIdx) == 11) {
  
       System.out.println("Número " + array.get(lastIdx) + " Você é um NATURAL! Você gahou.");
  
      } else if (array.get(lastIdx) == 2 || array.get(lastIdx) == 3 || array.get(lastIdx) == 12) {
        System.out.println("Número " + array.get(lastIdx) + " 'CRAPS' Você Perdeu! ");
      }
  
      else if (array.get(lastIdx) == 4 || array.get(lastIdx) == 5 || array.get(lastIdx) == 6 || array.get(lastIdx) == 8 || array.get(lastIdx) == 9
          || array.get(lastIdx) == 10) {
            System.out.println("Número " + array.get(lastIdx) + " Continue jogando, jogada número: " + (lastIdx+1));


              recebeNumero = gerador.nextInt(12);
              array.add(recebeNumero);
              lastIdx++;
              
              if (array.get(lastIdx) == 7 || array.get(lastIdx) == 11) {
  
                System.out.println("Número " + array.get(lastIdx) + " Você é um NATURAL! Você gahou.");
           
               } else if (array.get(lastIdx) == 2 || array.get(lastIdx) == 3 || array.get(lastIdx) == 12) {
                 System.out.println("Número " + array.get(lastIdx) + " 'CRAPS' Você Perdeu! ");
               }
      }

    }while(array.get(lastIdx) == 4 || array.get(lastIdx) == 5 || array.get(lastIdx) == 6 || array.get(lastIdx) == 8 || array.get(lastIdx) == 9
    || array.get(lastIdx) == 10);
  } 
}
