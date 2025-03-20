import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài 2 cạnh của hình chữ nhật
        System.out.print("Nhap do dai canh chieu dai: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhap do dai canh chieu rong: ");
        double chieuRong = scanner.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 2 * (chieuDai + chieuRong);  // Chu vi = 2 * (chieuDai + chieuRong)
        double dienTich = chieuDai * chieuRong;  // Diện tích = chieuDai * chieuRong

        // In kết quả ra màn hình
        System.out.println("Chu vi cua hinh chu nhat: " + chuVi);
        System.out.println("Dien tich cua hinh chu nhat: " + dienTich);
    }
}
