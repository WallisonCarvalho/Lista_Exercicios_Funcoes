import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        gerarQuadrado();
    }

    public static void gerarQuadrado() {
        ArrayList<Integer> saida = IntContainer.gerarQuadrado();

        int     n1 = IntContainer.pegarNumeroAleatorio(saida),
                n2 = IntContainer.pegarNumeroAleatorio(saida),
                n3 = IntContainer.pegarNumeroAleatorio(saida),
                n4 = IntContainer.pegarNumeroAleatorio(saida),
                n5 = IntContainer.pegarNumeroAleatorio(saida),
                n6 = IntContainer.pegarNumeroAleatorio(saida),
                n7 = IntContainer.pegarNumeroAleatorio(saida),
                n8 = IntContainer.pegarNumeroAleatorio(saida),
                n9 = IntContainer.pegarNumeroAleatorio(saida);


        while (((n1 + n2 + n3) != 15) || ((n4 + n5 + n6) != 15) || ((n7 + n8 + n9) != 15) ||
                ((n1 + n4 + n7) != 15) || ((n2 + n5 + n8) != 15) || ((n3 + n6 + n9) != 15) ||
                ((n1 + n5 + n9) != 15) || ((n3 + n5 + n7) != 15)) {
            saida = IntContainer.gerarQuadrado();
            n1 = IntContainer.pegarNumeroAleatorio(saida);
            n2 = IntContainer.pegarNumeroAleatorio(saida);
            n3 = IntContainer.pegarNumeroAleatorio(saida);
            n4 = IntContainer.pegarNumeroAleatorio(saida);
            n5 = IntContainer.pegarNumeroAleatorio(saida);
            n6 = IntContainer.pegarNumeroAleatorio(saida);
            n7 = IntContainer.pegarNumeroAleatorio(saida);
            n8 = IntContainer.pegarNumeroAleatorio(saida);
            n9 = IntContainer.pegarNumeroAleatorio(saida);
        }


        System.out.println(n1 + "  " + n2 + "  " + n3);
        System.out.println(n4 + "  " + n5 + "  " + n6);
        System.out.println(n7 + "  " + n8 + "  " + n9);

        if (((n1 + n2 + n3) == 15) || ((n4 + n5 + n6) == 15) || ((n7 + n8 + n9) == 15) ||
                ((n1 + n4 + n7) == 15) || ((n2 + n5 + n8) == 15) || ((n3 + n6 + n9) == 15) ||
                ((n1 + n5 + n9) == 15) || ((n3 + n5 + n7) == 15)) {
            System.out.println("Matriz é um quadrado Magico");
        }

    }
}