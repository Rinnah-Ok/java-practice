package Unit_01.Chapter_01.Q_01_01_02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerobj = new Scanner(System.in);
        
        double height = scannerobj.nextDouble();
        double width = scannerobj.nextDouble();
        double area = (height*width);
        System.out.println(area);
        
        scannerobj.close();
        
    }
}
