import java.util.Scanner;

public class KdvHeesaplamasi {
    public static void main(String[] args) {
    double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

    Scanner input = new Scanner(System.in);
    System.out.print("Ücret Tutarını Giriniz : ");

    tutar = input.nextDouble();
    kdvTutar = tutar * kdvOran;
    kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı  : %" + kdvOran*100);
        System.out.println("KDV Tıtarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
    }
}
