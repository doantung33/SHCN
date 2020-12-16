import java.util.Scanner;

public class SdToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu rong");
        int wright = scanner.nextInt();
        System.out.println("Nhap chieu dai");
        int heigh = scanner.nextInt();
        int S = wright*heigh;
        System.out.println("Dien tích là: "+ S);
    }
}
