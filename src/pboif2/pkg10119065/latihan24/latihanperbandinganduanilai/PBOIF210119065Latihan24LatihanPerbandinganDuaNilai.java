package pboif2.pkg10119065.latihan24.latihanperbandinganduanilai;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan perbandingan dua nilai
 */
public class PBOIF210119065Latihan24LatihanPerbandinganDuaNilai {
    
    public static String cekPerbandingan(int n1, int n2){
       String ket = null;
        if(n1 > n2){
           ket = " Lebih besar dari ";
       }else if(n1 < n2){
           ket = " Lebih kecil dari ";
       }else if(n1 == n2){
           ket = " sama dengan ";
       }
       ket = n1 + ket + n2;
        return ket;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        boolean Ulangi = false;
        String ulangi;
        
        System.out.println("========= Program Perbandingan Nilai =========");
        while(!Ulangi){
            System.out.print("Masukkan Nilai Pertama : ");
            n1 = sc.nextInt();
            System.out.print("Masukkan Nilai Kedua  : ");
            n2 = sc.nextInt();
            System.out.println("Hasil : " + cekPerbandingan(n1,n2));

            System.out.print("\nUlangi Aktivitas ? (Ya/Tidak) : ");
            ulangi = sc.next();
            if(ulangi.equals("Ya") || ulangi.equals("ya")){
                
            }else if(ulangi.equals("Tidak") || ulangi.equals("tidak")){
                break;
            }
        }
       System.out.println("(Developed by : Fachriansyah Muhammad Nur Ihsan)");  
    }
    
}
