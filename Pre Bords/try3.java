public class try3 {
    public static void main(String[] args) {
        char alpha = 'e';
        switch (alpha){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(alpha + " is a vowel");
                break;

                default:
                System.out.println(alpha + " is not a vowel");
        }
        
    }
}