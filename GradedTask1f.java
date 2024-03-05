import java.util.Scanner;
public class GradedTask1e {
    public static void main(String[] arg){
        int x = 10;
        int y = 15;
        int z = 20;
        boolean answer = (x <= y - 2) && (y >= z) || (z - 2 != 20);
        System.out.print(answer);
    }
}


