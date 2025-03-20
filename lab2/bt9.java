import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so nguyen n
        System.out.print("Nhap so n: ");
        int n = scanner.nextInt();

        // Kiem tra xem n co phai la so duong hay khong
        if (n > 0) {
            System.out.println(n + " la so duong.");
        } else if (n < 0) {
            System.out.println(n + " la so am.");
        } else {
            System.out.println(n + " la so 0.");
        }
        
        scanner.close();
    }
}

