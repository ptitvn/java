import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ten lop cua sinh vien: ");
        String tenLop = scanner.nextLine();
        
        System.out.print("Ho ten: ");
        String hoTen = scanner.nextLine();
        
        System.out.print("Ma so sinh vien: ");
        String maSo = scanner.nextLine();
        
        System.out.print("Lop: ");
        String lop = scanner.nextLine();
        
        System.out.print("So dien thoai: ");
        String soDienThoai = scanner.nextLine();
        
        System.out.print("Gioi tinh: ");
        String gioiTinh = scanner.nextLine();
        
        System.out.println("/***** THANH VIEN LOP " + tenLop + " *****/");
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ma so sinh vien: " + maSo);
        System.out.println("Lop: " + lop);
        System.out.println("So dien thoai: " + soDienThoai + "\t Gioi tinh: " + gioiTinh);
        System.out.println("/*********************************************/");
        
        scanner.close();
    }
}
