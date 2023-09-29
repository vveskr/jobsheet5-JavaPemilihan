import java.util.Scanner;

public class PemilihanPercobaan218 {
    public static void main(String[] args){
        Scanner input18 = new Scanner(System.in);
        String nilaiHuruf = "null";
        System.out.print("Nilai uas   : ");
        float uas = input18.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input18.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input18.nextFloat();
        System.out.print("Nilai tugas : ");
        Float tugas = input18.nextFloat();
        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
        if (total >80 && total <=100){
            nilaiHuruf = "A";
        }else if (total >73 && total <=80){
            nilaiHuruf = "B+";
        }else if (total >65 && total <=73){
            nilaiHuruf = "B";
        }else if (total >60 && total <=65){
            nilaiHuruf = "C+";
        }else if (total >50 && total <=60){
            nilaiHuruf = "C";
        }else if (total >39 && total <=50){
            nilaiHuruf = "D";
        }else if (total <=39){
            nilaiHuruf = "E";
        }else{
            System.out.println("Masukkan nilai yang sesuai");
        }
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total);
        System.out.println("Nilai Huruf: "+ nilaiHuruf);
        System.out.println("Sehingga "+message);
        }
    }