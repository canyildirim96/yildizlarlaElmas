import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Değer Giriniz: ");
        int sayi = inp.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int k = 1; k <= (sayi - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }for (int i=0; i<=sayi-1; i++){
            for (int k=sayi; k>=sayi-i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j<(sayi-i-1)*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}