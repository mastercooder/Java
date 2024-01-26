/* Give Javacode to print multiplication table of 5 in the following 
 * formate :-
 * 5 X 1 = 5
 * 5 X 2 = 10
 */

public class Q31 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println("5 X "+i+" = "+(5*i));
        }
    }
}
