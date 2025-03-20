import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap 4 so nguyen a, b, c, d
        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap so c: ");
        int c = scanner.nextInt();
        System.out.print("Nhap so d: ");
        int d = scanner.nextInt();

        // Tinh gia tri trung binh cong
        double trungBinhCong = (a + b + c + d) / 4.0;

        // In ra ket qua
        System.out.println("Gia tri trung binh cong cua 4 so la: " + trungBinhCong);

        scanner.close();
    }
}
