/*
 * Give java code to asume any year and check it is leapyear?
 */
public class try30 {
    public static void main(String[] args) {
        int year = 2020;
        int leapyear = year/4;

        if (year == leapyear){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
}
