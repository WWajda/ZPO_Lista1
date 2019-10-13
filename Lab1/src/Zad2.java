public class Zad2 {

    public static String odszyfrowywanie(String haslo){
        StringBuilder odszyfrowane=new StringBuilder();
        String alfabet="aąbcćdeęfghijklłmnńoóprsśtuwxyz";

        for(int i=0;i< haslo.length() ;i++) {
            for(int j=0;j< alfabet.length() ;j++){
                if (haslo.charAt(i) == alfabet.charAt(j)) {
                    odszyfrowane.append(alfabet.charAt(j));
                }
            }
        }
        String haslo_odszyfr=odszyfrowane.toString().toUpperCase();
        return haslo_odszyfr;
    }

    public static void main(String[] args){
        System.out.println("Odszyfrowane haslo to "+odszyfrowywanie("zawansowane"));
        System.out.println("Odszyfrowane haslo to "+odszyfrowywanie("programowanie"));
        System.out.println("Odszyfrowane haslo to "+odszyfrowywanie("obiektowe"));
    }
}
