 /*
 * Give javacode to assume any alphabet & check if it is in vowel or consonant ?
 */

public class try40{
    public static void main(String[] args) {
        char alpha = 'i';
        switch(alpha){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("It is a vowel");
            break;
            default:
            System.out.println("It is a consonent");
        }
    }
}