/* Give a javacode to asume two digit numebr and display the sum of
 * the quabes of each digit ?
 */
public class Q11 {
    public static void main(String[] args) {
        int n = 22;

        int fn = n%10;
        int sn = n/10;

        int s = (fn*fn*fn) + (sn*sn*sn);
        System.out.println(s);
    }
}
