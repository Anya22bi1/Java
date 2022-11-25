import java.util.Scanner;

public class EX3 {
    public static void main (String[] args) {
        int i = 0;
        float l = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа будет возводить X в n-ую степень");
        System.out.println("X = ");
        int X = scanner.nextInt();
        System.out.println("n (ограничение -15<n<15) = ");
        int n = scanner.nextInt();
        if (n < -15 | n > 15) {
            System.out.println("n должен быть -15<n<15");
            System.exit(1);
        }
        if (n > 0) {
            while (i < n) {i++; l *= X;}
            System.out.println(l);
        } else if (n == 0) {
            l = 1;
            System.out.println(l);
        } else {
            for (i = n; i < 0; i++) l *= X;
            l = 1 / l;
            System.out.println(l);
        }
    }
}
