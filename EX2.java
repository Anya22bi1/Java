import java.util.Scanner;

public class EX2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Определитель времени года");
        System.out.println("Введите день: ");
        int day = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        if (month > 12) {
            System.out.println("Всего 12 месяцев!");
            System.exit(4);
        }
        if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 |
                month == 10 | month == 12) {
            if (day > 31) {
                System.out.println("В данном месяце не может быть больше 31 дня!");
                System.exit(1);
            }
        } else if (month == 2) {
            if (day > 29) {
                System.out.println("В данном месяце не может быть больше 29 дней!");
                System.exit(2);
            }
        } else {
            if (day > 30) {
                System.out.println("В данном месяце не может быть больше 30 дней!");
                System.exit(3);
            }
        }
        if (month == 12| month == 1 |month == 2) {
            System.out.println("Время года - зима");
        } else if (month == 3 | month == 4| month == 5) {
            System.out.println("Время года - весна");
        } else if (month == 6 | month == 7 | month == 8) {
            System.out.println("Время года - лето");
        } else if (month == 9 | month == 10 | month == 11) {
            System.out.println("Время года - осень");
        }
    }
}
