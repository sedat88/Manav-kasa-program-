import java.util.Scanner;

public class Main {
    public static void main(String[] orgs) {
        // Manav Kasa Programı
        // Değişkenleri giriyoruz.

        double armut,elma,domates,muz,patlıcan,toplamTutar,TL;
        Scanner fiyat = new Scanner(System.in);

        System.out.print(" Kaç kilo armut aldığınızı giriniz : ");
        armut = fiyat.nextDouble();
        System.out.print(" Kaç kilo elma aldığınızı giriniz : ");
        elma = fiyat.nextDouble();
        System.out.print(" Kaç kilo domates aldığınızı giriniz : ");
        domates = fiyat.nextDouble();
        System.out.print(" Kaç kilo muz aldığınızı giriniz : ");
        muz = fiyat.nextDouble();
        System.out.print(" Kaç kilo patlıcan aldığınızı giriniz : ");
        patlıcan = fiyat.nextDouble();

        //Toplam turarın hesaplanması.
        toplamTutar=(armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlıcan*5.0);
        System.out.println("Toplam tutar: " +toplamTutar+ " TL" );















        {


        }








    }
}




