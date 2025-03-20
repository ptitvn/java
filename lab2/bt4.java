import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập giờ, phút, giây
        System.out.print("Nhap gio: ");
        int gio = scanner.nextInt();

        System.out.print("Nhap phut: ");
        int phut = scanner.nextInt();

        System.out.print("Nhap giay: ");
        int giay = scanner.nextInt();

        // Chuyển đổi giờ, phút, giây thành giây
        int tongGiay = gio * 3600 + phut * 60 + giay;

        // In kết quả
        System.out.println("Thoi gian tu gio, phut, giay sang giay: " + tongGiay + " giay");
    }
}
