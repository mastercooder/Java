/*
 *  Q. Give Javacode to assume any vlue between 1 to 5 and display it in works ?
 * Ans
 */

public class switch_case {
    public static void main(String area[]){
        int n = 10;
        switch (n){
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
            System.out.println("Invlid entry");
        }
    }
}