import java.util.Scanner;
public class LabTask9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Quaters : ");
        int Quaters = input.nextInt();
        System.out.print("Enter Number of Dimes : ");
        int Dimes = input.nextInt();
        System.out.print("Enter Number of Nickels : ");
        int Nickels = input.nextInt();
        System.out.print("Enter Number of Pennies : ");
        int Pennies = input.nextInt();

        int Quaters_to_Cents = Quaters*25;
        int Dimes_to_Cents   = Dimes*10;
        int Nickels_to_Cents = Nickels*5;
        int Pennies_to_Cents = Pennies;

        int Cents_to_Dollars = (Quaters_to_Cents+Dimes_to_Cents+Nickels_to_Cents+Pennies_to_Cents)/100;
        if (Cents_to_Dollars==1){
            System.out.print("Congratulation You win");
        }
        else if(Cents_to_Dollars>1){
            System.out.print("You guessed more than a Dollar");
        }
        else{
            System.out.print("You guessed less than a Dollar");
        }
    }
}
