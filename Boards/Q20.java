/* Give Javacode to assume any Sales amount and calculate discount 
 * amount and net amount based on following createria ?
 *      Total Sales                          Discount Percentage
 *       0 - 1000                                     10 %
 *      1001 - 5000                                   15 %
 *         >5000                                      25 %
 * 
 */
public class Q20 {
    public static void main(String[] args) {
        float ts = 3000;
        float dp = 0.0f;
        float net = 0.0f;

        if (ts <= 1000){
            dp = (ts*10)/100;
            net = (ts-dp);
        }
        else if (ts <= 5000){
            dp = (ts*15)/100;
            net = (ts-dp);
        }
        else{
            dp = (ts*25)/100;
            net = (ts-dp);
        }
        System.out.println("Total Sales               -              "+ts);
        System.out.println("Discount Percentage       -              "+dp);
        System.out.println("Net Amount                -              "+net);
    }
}
