import java.util.Scanner;
/**
 * ModifyNestedLoop_2341760155
 */
public class ModifyNestedLoop_2341760155 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        double [][]temps = new double[5][5];
        double average;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City : "+i);
            double total = 0;
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Day "+(j+1)+" :");
                temps [i][j]= input21.nextDouble();
                total += temps[i][j];
            }
            average = total/temps[i].length;
            System.out.println("The average of temperature is : "+average);
             System.out.println();
        }
       for (int i = 0; i < temps.length; i++) {
            System.out.println("City: "+i);
            for (int j = 0; j < temps.length; j++) {
                System.out.print(temps[i][j]+ "");
            }
            System.out.println();
        }
    }
}