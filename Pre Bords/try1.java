/* Give Java code to check if the given year in the leap year */

public class try1 {
    public static void main(String[] args) {
        int year = 2021;
        int leapyear = year%4;
        
        if (leapyear == 0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " it is not a leap year");
        }
    }
}
