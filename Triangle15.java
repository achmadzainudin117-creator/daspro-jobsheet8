import java.util.Scanner;
 public class Triangle15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = sc.nextInt();

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
        sc.close();
    }
 }