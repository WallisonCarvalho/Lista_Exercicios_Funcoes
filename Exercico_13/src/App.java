
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantidade de Linhas: ");
        int linha = sc.nextInt();

        System.out.printf("Quantidade de Colunas: ");
        int coluna = sc.nextInt();

        PrimeiraLinha(linha, coluna);

        sc.close();
    }

    public static void PrimeiraLinha(int linha, int coluna) {
        System.out.print("+");
        for (int i = 1; i <= coluna; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        LinhasDoMeio(linha, coluna);
    }

    public static void LinhasDoMeio(int linha, int coluna) {

        int indice = 1;
        while (indice <= linha) {
            System.out.print("|");
            for (int i = 1; i <= linha; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
            indice++;
        }
        TerceiraLinha(linha, coluna);
    }

    public static void TerceiraLinha(int linha, int coluna) {

        System.out.print("+");
        for (int i = 1; i <= coluna; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}