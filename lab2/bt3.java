import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một số có 2 chữ số
        System.out.print("Nhap N (so co 2 chu so): ");
        int N = scanner.nextInt();

        // Tách ra từng chữ số của số nhập vào
        int hangChuc = N / 10; // Lấy chữ số hàng chục
        int hangDonVi = N % 10; // Lấy chữ số hàng đơn vị

        // Tính tổng các chữ số
        int tong = hangChuc + hangDonVi;

        // In kết quả theo định dạng yêu cầu
        System.out.println(hangChuc + " + " + hangDonVi + " = " + tong);
    }
}
