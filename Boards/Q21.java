/* Give Javacode to Assume any taxable income and calculate income tax
 * based on following creatiria ?
 *      Taxible Income                                Tax Percentage
 *      0 - 2,00,000                                        Nil
 *    2,00,000 - 5,00,000                                   10%
 *        > 5,00,000                                        20%
 */

public class Q21 {
    public static void main(String[] args) {
       float ti = 300000.0f;
       float tax = 0.0f;
       
       if (ti<=200000){
           tax = 0;
       }
       else if (ti<=500000){
           tax = ((ti-200000)*10)/100;
       }
       else{
           tax = 30000+(ti-500000)*20/100;
       }
       
       System.out.println("Income                 -                  "+ti);
       System.out.println("Tax                    -                  "+tax);
    }
}
