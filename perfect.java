import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {

        int user;
        int total=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the perfect number finder.");
        System.out.print("Please enter a number : ");
        user = input.nextInt();

        for (int i=1; i < user; i++){
            if(user % i == 0){
                total +=i;
            }
        }if ( total == user){
            System.out.println("The number " + user + " is a perfect number.");
        }else {
            System.out.println("The number " + user + " is not a perfect number.");
        }


    }
}