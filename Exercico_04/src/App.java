import java.io.PrintStream;

public class App {
    public static void main(String[] args) throws Exception {

      Numero(10);
     
    }

    public static PrintStream Numero(double n1){

      if(n1 > 0){
        return System.out.printf("P");
      }
      return System.out.printf("N");
    }
}
