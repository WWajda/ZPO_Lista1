public class Zad4 {
    public static String wzorSumaryczny(String pierwiastki,String nazwa){

        String znaki="CHSONP";
        int ile=0;
        String litera="";
        StringBuilder napis=new StringBuilder();
        napis.append("Wzór sumaryczny - "+nazwa+": ");

        for(int i=0;i<znaki.length();i++) {
            ile = 0;
            for (int j = 0; j < pierwiastki.length(); j++) {
                //sprawdzanie czy pierwiastek jest w bazie znaków
                if (znaki.contains(pierwiastki.substring(j, j + 1))) {
                    //jeśli tak to zaczyna się odnajdywanie w bazie i zliczanie jego wystąpień w związku
                    if (znaki.charAt(i) == pierwiastki.charAt(j)) {
                        litera = znaki.substring(i, i + 1);
                        ile++;
                    }
                } else {
                    litera = "Brak";
                    ile = 1;
                }
            }
            //spisywanie wyniku o ile pierwiastek wystąpił w związku
            if (ile != 0) {
                String liczba = Integer.toString(ile);
                if (ile == 1) {
                    napis.append(litera);
                } else {
                    napis.append(litera + liczba);
                }
            }
        }

        String gotowy_napis=napis.toString();
        //jeśli w poprzedniej części odnaleziono pierwiastek nie występujący w bazie to generuje się odpowiednią informacje
        if (gotowy_napis.contains("Brak"))
        {
            gotowy_napis="W skład zwiąku wchodzi pierwiastek nie znajdującyy się w bazie danych";
        }
        return gotowy_napis;
    }

    public static void main(String[] args) {
        System.out.println(wzorSumaryczny("HHCHH","metan"));
        System.out.println(wzorSumaryczny("NaCl","chlorek sodu"));
        System.out.println(wzorSumaryczny("CHCHOHHH","etanol"));
        System.out.println(wzorSumaryczny("OHOHPOHO","kwas fosforowy"));
        System.out.println(wzorSumaryczny("OHOSOHO","kwas siarkowy (VI)"));
        System.out.println(wzorSumaryczny("HHNH","amoniak"));
    }
}
