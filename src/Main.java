import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mesafe, indTutar, normTutar, yasIndirim, gidisDonusIndirim, tutar;
        int yas, yoltip;

        System.out.print("Mesafe Giriniz:");
        mesafe = input.nextDouble();

        System.out.print("Yaşınızı Giriniz:");
        yas = input.nextInt();

        System.out.println("Yolculuk Tipini Seçiniz:");
        System.out.println("1-Tek Yön\n2-Gidiş Dönüş");
        yoltip = input.nextInt();


        if (yas < 12) {
            if (yoltip == 1) {
                normTutar = mesafe * 0.10;
                yasIndirim = normTutar * 0.50;
                System.out.println("Toplam Tutar:" + yasIndirim);

            } else if (yoltip == 2) {
                normTutar = mesafe * 0.10;
                yasIndirim = normTutar * 0.50;
                indTutar = normTutar - yasIndirim;
                gidisDonusIndirim = indTutar * 0.20;
                tutar = (indTutar - gidisDonusIndirim) * 2;
                System.out.println("Toplam Tutar:" + tutar);

            }
            else {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        }


        if (yas > 24 && yas < 65) {
            if (yoltip == 1) {
                normTutar=mesafe*0.10;
                System.out.println("Toplam tutar:"+normTutar);

            } else if (yoltip==2) {
                normTutar=mesafe*0.10;
                gidisDonusIndirim=normTutar*0.20;
                tutar=(normTutar-gidisDonusIndirim)*2;
                System.out.println("Toplam tutar:"+tutar);

            }
            else {
                System.out.println("Hatalı Veri Girdiniz !");
            }


        }


        if ( yas>=12 && yas<=24) {

            if (yoltip == 1) {
                normTutar = mesafe * 0.10;
                yasIndirim = normTutar * 0.10;
                indTutar = normTutar - yasIndirim;
                System.out.println("Toplam Tutar:" + indTutar);
            } else if (yoltip==2){
                normTutar = mesafe * 0.10;
                yasIndirim = normTutar * 0.10;
                indTutar = normTutar - yasIndirim;
                gidisDonusIndirim=indTutar*0.20;
                tutar=(indTutar-gidisDonusIndirim)*2;
                System.out.println("Toplam tutar:"+tutar);

            }
            else {
                System.out.println("Hatalı Veri Girdiniz !");

            }
        }

        if (yas>65){
            if(yoltip==1){
                normTutar=mesafe*0.10;
                yasIndirim=normTutar*0.30;
                indTutar=normTutar-yasIndirim;

                System.out.println("Toplam tutar:"+indTutar);
            } else if (yoltip==2) {
                normTutar=mesafe*0.10;
                yasIndirim=normTutar*0.30;
                indTutar=normTutar-yasIndirim;
                gidisDonusIndirim=indTutar*0.20;
                tutar=(indTutar-gidisDonusIndirim)*2;
                System.out.println("Toplam tutar:"+tutar);


            }
            else {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        }









    }
}