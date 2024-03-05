import java.util.Scanner;
public class LabTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers ");
        System.out.print("Enter number 1 : ");
        double number1 = input.nextDouble();
        System.out.print("Enter number 2 : ");
        double number2 = input.nextDouble();
        
        if (number1>number2){
            System.out.println("Number 2 is smaller");
        }
        else if (number2==number1){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Number 1 is smaller");
        }
        System.out.print("Enter number : ");
        double numberX = input.nextDouble();
        
        if (numberX==0){
            System.out.println("0");
        }
        else if (numberX>=1){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        
        System.out.print("Enter number 1 : ");
        double number_1 = input.nextDouble();
        System.out.print("Enter number 2 : ");
        double number_2 = input.nextDouble();
        System.out.print("Enter number 3 : ");
        double number_3 = input.nextDouble();

        if (number_1>number_2 && number_1>number_3){
            System.out.printf("number 1 (%f) is greater",number_1);
        }
        else if (number_2>number_1 || number_2>number_3){
            System.out.printf("number 2 (%f) is greater",number_2);
        }
        else{
            System.out.printf("number 3 (%f) is greater",number_3);
        }
        

    }
}
