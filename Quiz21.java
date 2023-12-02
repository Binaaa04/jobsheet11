import java.util.Scanner;
import java.util.Random;

/**
 * Quiz21
 */
public class Quiz21 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        Random rand21 = new Random();
        char menu = 'y';
        do {
            int number = rand21.nextInt (10) + 1; 
            boolean success = false;
            do {
                System.out.print("Guess the number (1-10): "); 
                int answer = input21.nextInt(); 
                input21.nextLine(); 
                 success = (answer == number); 

            } while (!success);
                System.out.print("Do you want to repeat the game (Y/y)?"); 
                menu = input21.next().charAt(0);
                input21.nextLine();
        } while (menu=='y' || menu=='Y');
    }
}