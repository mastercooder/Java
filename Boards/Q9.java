/* Give java code to asume any year and check it is
 * leapyear ? */
public class Q9 {
    public static void main(String[] args) {
        int year = 2076;

        if (year%4==0){
            System.out.println(year+ " is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
