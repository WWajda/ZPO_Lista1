import java.util.Arrays;
import java.util.Random;

public class Zad6 {

    public static void main(String[] args) {
        int bok=6;
        int [][] macierz = new int[bok][bok];
        int slad=0;
        Random r = new Random();

        for (int i=0; i<macierz.length;i++) {
            for (int j = 0; j < macierz.length; j++) {
                macierz[i][j] = r.nextInt(16) - 10;
            }
            slad+=macierz[i][i];
            System.out.println(Arrays.toString(macierz[i]));
        }
        System.out.println("");
        System.out.println("Ślad macierzy wynosi: "+slad);
    }
}

