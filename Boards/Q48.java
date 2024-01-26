/* Give Javacode to asume any value and calculte some of its digit? */


public class Q48 {
    public static void main(String[] args) {
        int n = 154;
        
        int sum = (n/100) + (n%100/10) + (n%10);

        System.out.println("The sum of the given number is "+sum);
    }
}
