/* Convert the following for loop into do while loop ?
 * for (int i = 20; i>0; i = i-5){
 *      System.out.println(i);
 * }
 */

public class Q44 {
    public static void main(String[] args) {
        int i = 20;
        do{
            System.out.println(i);
            i = i-5;
        }while(i>0);
    }
}
