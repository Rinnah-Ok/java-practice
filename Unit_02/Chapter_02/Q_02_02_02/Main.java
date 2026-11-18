package Unit_02.Chapter_02.Q_02_02_02;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();

        if (c.equals("Argentina")){
            System.out.println("Lionel Messi");
        } else if (c.equals("Portugal")){
            System.out.println("Cristiano Ronaldo");
        } else{
            System.out.println("no preference");
        }   }
        
}
