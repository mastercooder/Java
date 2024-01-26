/* 
 *   Convert to for loop
 *  ---------------------
 * 
 * int n = 5;
 * int i = 1;
 * 
 * while (i<=15){
 *      System.out.println("Value of i is = " +i);
 *      i = i+3; 
 * }
 */

public class try14 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i<=n; i = i+3){
            System.out.println("Value of i is = " +i);
        }
    }
}
