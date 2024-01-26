/*
Q. Give Javacode to calculte first Five even numebr and add number using singe for loop
 */


public class school6 {
    public static void main(String args[]){
        int n = 10;
        int a = 0;
        int b = 0;

        for (int i = 1; i <= n; i++){
            if (i%2 == 0){
                a = a+i;
            }
            else{
                b = b+i;
            }

        }
        System.out.println("Sum of first five even number = "+ a);
        System.out.println("Sum of first five odd number = "+ b);
    }
}
