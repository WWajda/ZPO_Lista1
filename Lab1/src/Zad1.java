public class Zad1 {

    public static double podatek(double dochod){
        double podatek;

        if (dochod > 1000000) {
            podatek= dochod * 0.55;
        }
        else if (dochod>90000){
            podatek=dochod*0.50;
        }
        else if (dochod>60000){
            podatek=dochod*0.48;
        }
        else if (dochod>31000){
            podatek=dochod*0.42;
        }
        else if (dochod>18000){
            podatek=dochod*0.35;
        }
        else if (dochod>11000){
            podatek=dochod*0.25;
        }
        else {
            podatek=0;
        }
        podatek=Math.ceil(podatek*100)/100;
        return podatek;
    }
    public static void main(String[] args){
        System.out.println("Podatek wynosi "+podatek(5040.20)+" euro");
        System.out.println("Podatek wynosi "+podatek(11000)+" euro");
        System.out.println("Podatek wynosi "+podatek(14501.70)+" euro");
        System.out.println("Podatek wynosi "+podatek(18000)+" euro");
        System.out.println("Podatek wynosi "+podatek(19500.50)+" euro");
        System.out.println("Podatek wynosi "+podatek(31000)+" euro");
        System.out.println("Podatek wynosi "+podatek(56700)+" euro");
        System.out.println("Podatek wynosi "+podatek(60000)+" euro");
        System.out.println("Podatek wynosi "+podatek(81000)+" euro");
        System.out.println("Podatek wynosi "+podatek(98005.50)+" euro");
        System.out.println("Podatek wynosi "+podatek(171000)+" euro");
        System.out.println("Podatek wynosi "+podatek(1000000)+" euro");
        System.out.println("Podatek wynosi "+podatek(1210000)+" euro");
    }
}
