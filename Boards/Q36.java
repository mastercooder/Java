/* Give Javacode to find fist five sum of even number */
public class Q36 {
    public static void main(String[] args) {
        int s = 0;

        for (int i = 2; i<=10; i = i+2){
            s = s+i;
        }
        System.out.println("The Sum of first five even number = "+s);
    }
}
