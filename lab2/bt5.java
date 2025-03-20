import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập thời gian tính bằng giây
        System.out.print("Nhap thoi gian tinh bang giay: ");
        int totalSeconds = scanner.nextInt();

        // Tính toán số giờ, phút, giây
        int hours = totalSeconds / 3600; // 1 giờ = 3600 giây
        int minutes = (totalSeconds % 3600) / 60; // Lấy số phút từ phần dư của giờ
        int seconds = totalSeconds % 60; // Lấy phần dư còn lại là giây

        // In kết quả ra màn hình
        System.out.println(totalSeconds + " giay = " + hours + " gio " + minutes + " phut " + seconds + " giay");
    }
}
