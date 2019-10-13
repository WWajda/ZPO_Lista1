public class Zad3 {

    public static String tworzenie(String zdanie){
        StringBuilder przetlumaczone=new StringBuilder();
        String znaki=".,;-!?()";
        String wielkie="ABCDEFGHIJKLMNOPQRSTUWXYZ";
        String samogloski="aeiou";
        int pierwsza=0;
        String slowo;

            //usuwanie znaków interpunkcyjnych
            for (int k = 0; k < znaki.length(); k++) {
                if (zdanie.contains(znaki.substring(k,k+1))) {
                    int i=zdanie.indexOf(znaki.substring(k,k+1));
                    zdanie = (zdanie.substring(0, i)).concat(zdanie.substring(i + 1, zdanie.length()));
            }
        }
        zdanie=zdanie.concat(" ");

        for(int i=0;i< zdanie.length();i++) {
                //rozdzielanie na pojedyńcze słowa
                while ((zdanie.charAt(i) != ' ') && (i<zdanie.length())){
                    i++;
                }
                slowo = zdanie.substring(pierwsza, i);
                pierwsza = i + 1;
                //tłumaczenie zgodnie z zasadami
                if(wielkie.contains(slowo.substring(0,1))){
                    przetlumaczone.append(slowo+" ");
                }
                else if(samogloski.contains(slowo.substring(0,1))) {
                    przetlumaczone.append(slowo);
                    przetlumaczone.append("way ");
                } else {
                    przetlumaczone.append(slowo);
                    przetlumaczone.append("ay ");
                }
        }
        String tlumaczenie=przetlumaczone.toString();
        return tlumaczenie;
    }

    public static void main(String[] args){
        System.out.println("Przetłumaczone zdanie brzmi: "+tworzenie("What is in a name? That which we call a rose by any other name would smell as sweet."));
        System.out.println("Przetłumaczone zdanie brzmi: "+tworzenie("To be or not to be, that is the question."));
        System.out.println("Przetłumaczone zdanie brzmi: "+tworzenie("Selfishness is not living as one wishes to live, it is asking others to live as one wishes to live."));
    }
}
