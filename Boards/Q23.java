/* Give java code to assume any alphabet & check if it is vovel or 
 * consonant ?
 */

public class Q23 {
    public static void main(String[] args) {
        String alpha = "e";
        switch(alpha){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            System.out.println(alpha+" is a vovel");
            break;
            default:
            System.out.println(alpha+" is a consonent");
        }
    }
}
