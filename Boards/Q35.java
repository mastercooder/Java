/* Give Javacode to calculate sum of first 5 natural number ?
 */

public class Q35 {
    public static void main(String[] args) {
        int n = 5;
        int s = 0;

        for (int i = 1; i<=n; i++){
            s = s+i;
        }
        System.out.println("Sum = "+s);
    }
}
