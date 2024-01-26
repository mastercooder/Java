/*
 * Give a Javacode to assume any sales amount and calculate discount ammount and net amount based on following createria ?
 */

public class try37{
    public static void main(String[] args) {
        float TS = 5000; 
        float dis = 0.0f; 
        float NA = 0.0f;
        
        if (TS >= 0 && TS <= 1000){
            dis = (TS*10/100);
            NA = (TS-dis);
        }
        else if (TS >= 1001 && TS <= 5000){
            dis = (TS*15/100);
            NA = (TS-dis);
        }
        else{
            dis = (TS*25/100);
            NA = (TS-dis);
        }

        System.out.println(" Purchases      =   "+TS);
        System.out.println(" Discount       =   "+dis);
        System.out.println(" Amount         =   "+NA);
    }
}