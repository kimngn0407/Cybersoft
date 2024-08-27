import java.util.Random;
import java.util.Scanner;

public class DuongDauTien {
    
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    
    public static void main(String[] args) {
        int rows = nhapDong();
        int cols = nhapCot();
        int[][] matrix = nhapMang(rows, cols);
        xuatMang(matrix);
        int soDuong = timSoDuongDauTien(matrix);
        if (soDuong != -1) {
            System.out.println("So duong dau tien: " + soDuong);
        } else {
            System.out.println("Khong tim thay so duong.");
        }
    }
    
    static int nhapDong() {
        System.out.print("Nhap so dong: ");
        return scanner.nextInt();
    }
    
    static int nhapCot() {
        System.out.print("Nhap so cot: ");
        return scanner.nextInt();
    }
    
    static int[][] nhapMang(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(101) - 50;
            }
        }
        return matrix;
    }
    
    static void xuatMang(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    
    static int timSoDuongDauTien(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                if (elem > 0) {
                    return elem;
                }
            }
        }
        return -1;
    }
}

