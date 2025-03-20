import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap hai so nguyen a, b
        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();

        // Tim gia tri nho nhat
        int min = (a < b) ? a : b;

        // In ra ket qua
        System.out.println("Gia tri nho nhat la: " + min);
        
        scanner.close();
    }
}
