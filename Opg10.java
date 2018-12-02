public class Opg10 {

    public static void main(String[] args) {
    
        int[] num = {14, 1, 22, 17, 36, 7, -43, 5};
        System.out.println(countInRange(num, 4, 17));
    }

    private static int countInRange(int[] num, int min, int max) {
        int counter = 0;

        for (int i = 0; i < num.length; i++) {
        
            if (num[i] >= min && num[i] <= max) {
                counter++;    
            }
        }
        return counter;
    }
}