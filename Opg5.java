import java.util.*;

public class Opg5 {

   public static void main(String[] args) {
      smallestLargest();   
   }
   
   public static void smallestLargest() {
   
      System.out.println("Pick your numbers");
      Scanner userInput = new Scanner(System.in);
      
      int[] num = new int[4];
      num[0] = userInput.nextInt();
      num[1] = userInput.nextInt();
      num[2] = userInput.nextInt();
      num[3] = userInput.nextInt();
      Arrays.sort(num);
      System.out.println("Number 1: " + num[0]);
      System.out.println("Number 2: " + num[1]);
      System.out.println("Number 3: " + num[2]);
      System.out.println("Number 4: " + num[3]);  
      System.out.println("Largest number is: " + num[3]);
      System.out.println("Smallest number is: " + num[0]);
   }
}