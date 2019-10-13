import java.util.Arrays;
import java.util.Random;

public class Zad5 {

    public static int rzut(int oczka) {
        Random r = new Random();
        int wynik = r.nextInt(oczka) + 1;
        return wynik;
    }

    public static void main(String[] args) {
        int oczka=6;
        int liczba_rzutow=10;
        int [] rzuty = new int[liczba_rzutow];
        double [] prawdopodobienstwo = new double[oczka];

        for (int i=0; i<rzuty.length;i++){
            rzuty [i] = rzut(oczka);
        }
        System.out.println(Arrays.toString(rzuty));
        for (int j=0; j<oczka; j++) {
            for (int i = 0; i < rzuty.length; i++) {
                if (rzuty[i] == j+1) {
                    prawdopodobienstwo[j]++;
                }
            }
            prawdopodobienstwo[j]=prawdopodobienstwo[j]/liczba_rzutow;
            System.out.println("Prawdopodobieństwo wypadnięcia "+(j+1)+" oczek wynosi "+prawdopodobienstwo[j]);
        }
    }
}
