/* Give Javacode to assume any value between 1 to 5 and dispaly it in
 * words (use Switch) ?
 */

public class Q22 {
    public static void main(String[] args) {
        int n = 3;
        switch(n){
            case 1:
            System.out.println("ONE");
            break;
            case 2:
            System.out.println("TWO");
            break;
            case 3:
            System.out.println("THREE");
            break;
            case 4:
            System.out.println("FOUR");
            break;
            case 5:
            System.out.println("FIVE");
            break;
            
            default:
            System.out.println("Enter vlalue between 1 to 5");
        }

    }
}
