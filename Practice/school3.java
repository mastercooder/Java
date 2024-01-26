/*
Q. Give Javacode to calculate Facrorial of 5, 10, 20?
 */
public class school3 {
    public static void main(String args[]){
        int n = 5; 
        int f = 1;

        for (int i = 1; i <= n; i++){
            f = f*i;
        }
        System.out.println("Facrorial = "+f);
    }
}
