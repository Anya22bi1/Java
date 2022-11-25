import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        int data_year = 2022;
        int data_month = 11;
        int data_day = 24;
        Scanner scanner = new Scanner(System.in);
        System.out.println("День рождения: ");
        int day = scanner.nextInt();
        System.out.println("Месяц рождения(цифрой): ");
        int month = scanner.nextInt();
        System.out.println("Год рождения: ");
        int year = scanner.nextInt();
        int years = data_year - year;
        int months = data_month - month;
        int days = data_day - day;
        if (months < 0) {
            years --;
            months += 12;
        }
        if (days < 0) {
            months --;
            days = data_day + 30 - day;
        }
        System.out.println("Ваш возраст по 24.11.2022: ");
        System.out.println(years + " лет " + months + " месяцев " + days + " дней");
    }
}
