import java.util.*;

public class Opg8 {
   public static void main (String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      printAverage(userInput);      
   }

      public static void printAverage(Scanner userInput) {
         System.out.println("Type numbers followed by enter.\n" + "\n" +
         "End with a negative number to get the average of all nonnegative numbers typed\n");
      
         System.out.println("Enter a number");
      
         int inputNum = userInput.nextInt();
         int divisor = 1;
         int sum = inputNum;
      
            while(true) {
            System.out.println("Enter number");
            inputNum = userInput.nextInt();
      
               if (inputNum < 0) {
               break; 
               }
               sum += inputNum;
               divisor++;
               }    
      System.out.println("Average: " + ((double)sum/divisor));
      }
}