package Unit_02.Chapter_02.Q_02_02_01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean divby3 = (number % 3 == 0);
        boolean divby5 = (number % 5 == 0);
        if (divby3 && divby5) {
            System.out.print("Fizz Buzz");
        } else if (divby3) {
            System.out.print("Fizz");
        } else if (divby5) {
            System.out.print("Buzz");
        } else {
            System.out.print(number);
        }
        scanner.close();
    }
}
