/* Give Java Code to check if the given year is the year ? */

public class Q7 {
    public static void main(String[] args) {
        int year = 2065;

        if (year%4==0){
            System.out.println(year+ " is a leap year");
        }
        else{
            System.out.println(year+ " is not a leap year");
        }
    }
}
