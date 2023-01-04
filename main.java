import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // valyuta tarjimon SO'M-TL, TL-SO'M,


        Scanner valyuta_tanla = new Scanner(System.in);
        System.out.println("Valyuta tanlang  SO'M=0, TL=1");
        int sotuv = valyuta_tanla.nextInt();

        Scanner valyuta_tanla2 = new Scanner(System.in);
        System.out.println("Valyuta tanlang  SO'M=0, TL=1");
        int oluvchi = valyuta_tanla2.nextInt();


        if (oluvchi == sotuv ){
            System.out.println("Valyutalar farqli bo'lishi kerak. Farqli valyutalarni tanlang.");
        }




        if (sotuv==0 & oluvchi==1  ){
            Scanner som = new Scanner(System.in);
            System.out.println("1 SO'M necha TL ekanligini kir: ");
            int uzbek = som.nextInt();
            System.out.println("SO'M miqdorini kir");
            Scanner uz=new Scanner(System.in);
            int a=uz.nextInt();
            int b= a*uzbek;

            System.out.println(a+" SO'M"+"  "+b+" TL'dir");
        }
        if (sotuv==1 & oluvchi==0  ){
            Scanner Lira = new Scanner(System.in);
            System.out.println("1TL necha SO'M ekanligini kir: ");
            int turk = Lira.nextInt();
            System.out.println("TL miqdorini kir");
            Scanner tur=new Scanner(System.in);
            int k=tur.nextInt();
            int h=k*turk ;
            System.out.println(k+" TL"+"  "+h+" SO'M'dir");
        }


    }

    }
