import java.util.*;

public class Opg6 {

  public static void main(String[] args) {
  
        Scanner userInput = new Scanner(System.in);
        System.out.print("Type a sentence: ");
        String inputString = userInput.nextLine();

        System.out.print("word count: " + wordCounter(inputString)+"\n");
  }

 public static int wordCounter(String inputString) {
 
       int count = 0;
       
         if (!(" ".equals(inputString.substring(0, 1))) || !(" ".equals(inputString.substring(inputString.length() - 1)))) {
        
            for (int i = 0; i < inputString.length(); i++) {
            
               if (inputString.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count;
    }
 }