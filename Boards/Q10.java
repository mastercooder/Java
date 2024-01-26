/* Give java code to accept a two digit number and check it is a
 * palindrone ?
 */

public class Q10 {
    public static void main(String[] args) {
        int n = 66;
        int fn = n%10;
        int sn = n/10;

        if (fn==sn){
            System.out.println("It is a Palindrone");
        }
        else{
            System.out.println("It is not a palindrone");
        }

    }
}
