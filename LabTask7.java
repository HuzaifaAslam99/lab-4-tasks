import java.util.Scanner;
public class LabTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dimensions for First Rectangle");
        System.out.print("Enter Length : ");
        double length1 = input.nextDouble();
        System.out.print("Enter Width : ");
        double width1 = input.nextDouble();
        System.out.println("Enter dimensions for Second Rectangle");
        System.out.print("Enter Length : ");
        double length2 = input.nextDouble();
        System.out.print("Enter Width : ");
        double width2 = input.nextDouble();

        double area1 = length1*width1;
        double area2 = length2*width2;

        if (area1>area2){
            System.out.println("First Recatngle has greater area");
        }
        else if(area1==area2){
            System.out.println("Both have equal area");
        }
        else{
            System.out.println("Second Recatngle has greater area");
        }
        
    }
}
