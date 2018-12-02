import java.util.*;

public class Opg7 {

    public static void main(String[] args) {
    
        Scanner console = new Scanner(System.in);
        
        System.out.print("Type desired sum: " );
        int total = console.nextInt();
        
        diceSumm(total);
        System.out.println("Rolled the desired sum");
    }
    
       public static void diceSumm(int total) {
         Random rand = new Random();
         int sum = 0;
        
         while (sum != total) {
            int diceOne = rand.nextInt(6) + 1;
            int diceTwo = rand.nextInt(6) + 1;
            sum = diceOne + diceTwo;
            System.out.println(diceOne + " + " +  diceTwo + " = " + sum);
         }
       }
}