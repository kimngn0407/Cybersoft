import java.util.Scanner;

public class TimSn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * (i + 1));
        }
        System.out.println(sum);
    }
}
