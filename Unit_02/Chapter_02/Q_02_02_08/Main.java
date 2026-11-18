package Unit_02.Chapter_02.Q_02_02_08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sidelength1 = scanner.nextInt();
        int sidelength2 = scanner.nextInt();
        int sidelength3 = scanner.nextInt();
if (sidelength1 > 0 && sidelength2 > 0 && sidelength3 > 0 &&
    sidelength1 + sidelength2 > sidelength3 &&
    sidelength1 + sidelength3 > sidelength2 &&
    sidelength2 + sidelength3 > sidelength1) {

    if (sidelength1 == sidelength2 && sidelength2 == sidelength3) {
        System.out.println("equilateral");
    } else if (sidelength1 == sidelength2 ||
        sidelength2 == sidelength3 ||
        sidelength1 == sidelength3) {
        System.out.println("isosceles");
    } else {
        System.out.println("scalene");
    }

} else {
    System.out.println("not a triangle");
}

    }

    }