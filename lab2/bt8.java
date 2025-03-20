import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so nguyen n
        System.out.print("Nhap so n: ");
        int n = scanner.nextInt();

        // Kiem tra xem n la so chan hay so le
        if (n % 2 == 0) {
            System.out.println(n + " la so chan.");
        } else {
            System.out.println(n + " la so le.");
        }
        
        scanner.close();
    }
}
