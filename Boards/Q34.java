/* Give java code to calculate factor of 5, 10, 15 */

public class Q34 {
    public static void main(String[] args) {
        int n = 5;
        int f = 1;

        for (int i = 1; i<=n; i++){
            f = f*i;
        }
        System.out.println("Factor of 5 = "+f);
    }
}
