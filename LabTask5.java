import java.util.Scanner;
public class LabTask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        double number1 = input.nextDouble();
        System.out.print("Enter number 2 : ");
        double number2 = input.nextDouble();
        System.out.print("Enter number 3 : ");
        double number3 = input.nextDouble();

        if (number1==number2 && number2==number3){
            System.out.println("3");
        }
        else if (number1==number2 || number2==number3 || number3==number1){
            System.out.println(2);
        }
        else{
            System.out.println("0");
        }
    }
}
