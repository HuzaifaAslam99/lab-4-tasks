import java.util.Scanner;
public class LabTask10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of books Purchased");
        System.out.print("Enter : ");
        int books = input.nextInt();


        if(books==0){
            System.out.println("You have 0 points");
        }
        else if(books==1){
            System.out.println("You are awarded with 5 points");
        }
        else if(books==2){
            System.out.println("You are awarded with 15 points");
        }
        else if(books==3){
            System.out.println("You are awarded with 30 points");
        }
        else if(books>=4){
            System.out.println("You are awarded with 60 points");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
