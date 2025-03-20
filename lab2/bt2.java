import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một số có 3 chữ số
        System.out.print("Nhập vào một số có 3 chữ số: ");
        int number = scanner.nextInt();

        // Tách ra từng chữ số của số nhập vào
        int hangTram = number / 100; // Lấy chữ số hàng trăm
        int hangChuc = (number % 100) / 10; // Lấy chữ số hàng chục
        int hangDonVi = number % 10; // Lấy chữ số hàng đơn vị

        // In kết quả
        System.out.println("Hàng trăm: " + hangTram);
        System.out.println("Hàng chục: " + hangChuc);
        System.out.println("Hàng đơn vị: " + hangDonVi);
    }
}
