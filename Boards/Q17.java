/* Give javacode to assume any value between 1 to 5 and display in 
 * words using if....else if Ladder ?
 */
public class Q17 {
    public static void main(String[] args) {
        int n = 3;

        if (n == 1){
            System.out.println("ONE");
        }
        else if (n == 2){
            System.out.println("TWO");
        }
        else if (n == 3){
            System.out.println("THREE");
        }
        else if (n == 4){
            System.out.println("FOUR");
        }
        else if (n == 5){
            System.out.println("FIVE");
        }
        else{
            System.out.println("Enter the value 1 to 5");
        }
    }
}
