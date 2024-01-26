/* 
 *      Convert into While Loop
 *     -------------------------
 * 
 *      for (int i = 20; i>0; i = i-5){
 *      System.out.println(i);
 * }
 */

public class try15 {
    public static void main(String[] args) {
        int i = 20;

        while(i>0){
            System.out.println(i);
            i = i-5;
        }
    }
}
