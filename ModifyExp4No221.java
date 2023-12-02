import java.util.Random;
import java.util.Scanner;

/**
 * ModifyExp4No221
 */
public class ModifyExp4No221 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        Random rand21 = new Random();
        char menu;
    
        do {
            int number = rand21.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Guess the number (1-10): ");
                int answer = input21.nextInt();
                input21.nextLine();
                success = (answer == number);
            } while (!success);

            System.out.print("Do you want to play again? (N/Y): ");
            menu = input21.next().charAt(0);
            input21.nextLine();

            if (menu == 'N') {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

        } while (menu == 'Y');

        input21.close(); 
    }
}