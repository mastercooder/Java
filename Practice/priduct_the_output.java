/*
 * Q. Give java code to assume total sales and claculate discount amount based on following createraia.
 *     Total Sales                                                           Discount %
 *       <10,000                                                                 10 %
 *     10,000 to 14999                                                           15 %
 *      >= 15,000                                                                25 % 
 * Ans
 */ 

public class priduct_the_output {
    public static void main(String area[]){
        int ts = 100000;
        float dis = 00.0f;
        double fp = 0.0f;

        if (ts<=10000){
            dis = (ts*10)/100;
            fp = ts - dis;
        }
        else if (ts >= 10001 && ts <= 14999){
            dis = ((ts - 10000)*15)/100;
            fp = ts - dis;
        }
        else{
            dis = ((ts - 15000)*25)/100;
            fp = ts - dis;
        }
        System.out.println("You got " +dis+ " Discount");
        System.out.println("Your Final Price is = "+fp);
    }
  
}
