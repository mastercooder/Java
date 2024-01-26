/*
Q. Give Javacode to find first five sum of even number?
 */
public class school5{
    public static void main(String args[]){
        int n = 10;
        int s = 0;
        
        for (int i = 2; i <= n; i = i+2){
            s = s+i;
        }
        System.out.println("The sum of first five even number = " +s);
    }
}