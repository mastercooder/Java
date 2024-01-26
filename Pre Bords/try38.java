/*
 * Give javacode to assume any taxable income and calculate income tax based on following cretiria ?
 *                 Taxible Income                                                    Tax %
 *                  0 - 2,00,000                                                      Nil
 *               2,00,001 - 5,00,000                                                  10 %
 *                   > 5,00,000                                                       20 %
 */

public class try38{
    public static void main(String[] args) {
        float TI = 300000; 
        float tax = 0.0f; 
        float NA = 0.0f;

        if (TI >= 0 && TI <= 200000){
            tax = 0;
            NA = TI-tax;
        }
        else if (TI >= 200001 && TI <= 500000){
            tax = ((TI-200000)*10)/100;
            NA = (TI-tax);
        }
        else {
            tax = 3000 + ((TI-500000)*20)/100;
            NA = (TI-tax);
        }
        System.out.println("Purchases       =   "+TI);
        System.out.println("Discount        =   "+tax);
        System.out.println("Ammount         =   "+NA);
    }
}
