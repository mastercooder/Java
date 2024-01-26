/* Convert the following while loop into for loop ?
 * int n = 5;
 * int i = 1;
 * 
 * while (i<=15){
 *      System.out.println("Value of i is "+i);
 *      i = i+3;
 * }
 */

public class Q43 {
    public static void main(String[] args) {
        /*int n = 5;*/
        
        for(int i = 1; i<=15; i = i+3){
            System.out.println("Values of i is "+i);
        }
    }
}
