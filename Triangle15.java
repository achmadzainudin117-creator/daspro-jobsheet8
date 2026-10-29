import java.util.Scanner;
 public class Triangle15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = sc.nextInt();

        // 1. Segitiga Siku-siku Normal
        int i = 1; // UBAH DARI 0 MENJADI 1
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // PERRINTAH YANG DITAMBAHKAN 
            i++;  
        }
        System.out.println(); // Memberi Jarak Spasi Antar Segitiga 

        // 2. Segitiga Terbalik 
        i = n; // i = n tanpa kata 'int'
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--; // Decrement karena nilai dikurangi dari n ke 1 
        }
        sc.close();
    }
 }