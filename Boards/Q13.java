/* Give javacode to asume a three digit number and calulate the sum
 * of it digits ?
 */
public class Q13 {
    public static void main(String[] args) {
        int n = 123;
        int t =  (n/100);
        int j =  (n%100/10);
        int p =  (n%10);
        int sum = (t+j+p);

        System.out.println(t);
        System.out.println(j);
        System.out.println(p);



        System.out.println("The sum of tree digit is "+sum);
    }
}
