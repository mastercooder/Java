/*
 * Give java code to accept a two digit number and check it is a palindrane?
 */
public class try31 {
    public static void main(String[] args) {
        int n = 44;
        int up = n/10;
        int tp = n%10;

        if (up == tp){
            System.out.println("It is a parlindrone");
        }
        else{
            System.out.println("It is not a parlindrone");
        }
    }
}
