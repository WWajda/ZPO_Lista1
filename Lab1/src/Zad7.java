import java.util.Arrays;

public class Zad7 {

    public static void main(String[] args) {
        int bok=4;
        int licznik_a=1;
        int licznik_b=1;
        int licznik_c=3;
        int [][] macierz_a = new int[bok][bok];
        int [][] macierz_b = new int[bok][bok];
        int [][] macierz_c = new int[bok][bok];
        for (int i=0; i<bok;i++) {
            for (int j = 0; j <bok; j++) {
                //macierzA
                if (j==licznik_a){
                    macierz_a[i][j]=1;
                }
                else {
                    macierz_a[i][j]=0;
                }
                //macierzB
                if (j==licznik_b){
                    macierz_b[i][j]=1;
                }
                else {
                    macierz_b[i][j]=0;
                }
                //macierzC
                if (j==licznik_c){
                    macierz_c[i][j]=1;
                }
                else {
                    macierz_c[i][j]=0;
                }
            }
            licznik_a++;
            licznik_c--;
        }
        System.out.print(" Macierz a):   ");
        System.out.print(" Macierz b):   ");
        System.out.print(" Macierz c):   ");
        System.out.println("");
        for (int i=0; i<bok;i++) {
            System.out.print(Arrays.toString(macierz_a[i])+"   ");
            System.out.print(Arrays.toString(macierz_b[i])+"   ");
            System.out.print(Arrays.toString(macierz_c[i])+"   ");
            System.out.println("");
        }
    }
}
