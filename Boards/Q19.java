/* Give javacode to assume any percentage and display grade based on 
 * following createria ? (use if...else if ladder).
 *      Percentage                                  Grade
 *      80 - 100                                      A
 *      60 - 79.99                                    B
 *      40 - 59.99                                    C
 *         < 40                                       D
 */

public class Q19 {
    public static void main(String[] args) {
        float Percentage = 87.4f;

        if (Percentage >= 80 && Percentage <= 100){
            System.out.println(Percentage+" is Garde A");
        }
        else if (Percentage >= 60 && Percentage <= 79.99){
            System.out.println(Percentage+ " is Grade B");
        }
        else if (Percentage >= 40 && Percentage <= 59.99){
            System.out.println(Percentage+ " is Grade C");
        }
        else{
            System.out.println(Percentage+ " Grade D");
        }
    }
}
