import java.util.Scanner;
public class GradedTask2{
    public static void main(String[] arg){
        int x = 3;
        int y = 4;
        int z = 7;
        int w = 1;
        boolean answer = (x == y);
        boolean answer2 = (x!=z);
        boolean answer3 = (y == z-3);
        boolean answer4 = (!(z > w));
        boolean answer5 = (x + y < z);

        System.out.println("x == y:"+ answer);
        System.out.println("x != z: " +answer2);
        System.out.println("y == z - 3: " +answer3);
        System.out.println("!(z > w): " +answer4);
        System.out.println("x + y < z: " +answer5);
    }
}
