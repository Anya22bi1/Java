import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        int i;
        int l = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество точек: ");
        int N = scanner.nextInt();
        if (N < 0) {
            System.out.println("Количество точек не может быть отрицательным");
            System.exit(1);
        }
        System.out.println("Введите радиус окружности с центорм в (0;0): ");
        int r = scanner.nextInt();
        if (r < 0) {
            System.out.println("Радиус не может быть отрицательным");
            System.exit(2);
        }
        for (i = 1; i <= N; i ++) {
            System.out.println("X " + i + " точки =");
            int X = scanner.nextInt();
            System.out.println("Y " + i + " точки =");
            int Y = scanner.nextInt();
            if (X*X + Y*Y <= r*r) {
                l++;
            }
        }
        System.out.println(l + " точек попало в окружность");
    }
}
