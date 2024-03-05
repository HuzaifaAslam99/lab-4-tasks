import java.util.Scanner;
public class LabTask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in numbers");
        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter two-digit year: ");
        int year = input.nextInt();

        int magic = day*month;

        if (magic==year){
            System.out.println("Date is magic");
        }
        else{
            System.out.println("Date is not magic");
        }
    }
}