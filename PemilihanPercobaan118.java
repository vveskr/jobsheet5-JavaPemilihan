import java.util.Scanner;
public class PemilihanPercobaan118{
    public static void main(String[] args){
        Scanner input18 = new Scanner(System.in);
        String hasil;
        System.out.print("Masukkan angka: ");
        int angka = input18.nextInt();

        hasil = (angka % 2 == 0) ? " Bilangan genap " : " Bilangan ganjil ";
        System.out.println("Angka " + angka + hasil);
}
}