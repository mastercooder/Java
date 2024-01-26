public class bookpro3 {
    public static void main(String args[]){

        System.out.println("");
        System.out.println("");
        System.out.println("");

        int tm = 400;
        double mo = 346;
        double per = 0.0;
        float mp = 40.0f;
        
        System.out.println("Student 1 ");
        System.out.println("----------");
        per = (mo/tm)*100;
        System.out.println("Studnet's Percentage "+ per);
        if (per >= 40){
            System.out.println("Pass");
            if (per >= 75){
                System.out.println("With Distinction!");
            }
        if (per >= 40){
            System.out.println("");
            System.out.println("YOUR marks are as follows:- ");
            System.out.println("Total Marks = "+ tm);
            System.out.println("Marks Obtain = "+ mo);
            System.out.println("Percentage = "+ per+ "  ||  Minimum Percentage = "+ mp);
            System.out.println("");

        }
        }
        else{
            System.out.println("Fail");
            System.out.println("");
            System.out.println("");
            System.out.println("YOUR marks are as follows:- ");
            System.out.println("Total Marks = "+ tm);
            System.out.println("Marks Obtain = "+ mo);
            System.out.println("Percentage = "+ per+ "  ||  Minimum Percentage = "+ mp);
            System.out.println("");
            System.out.println("");
        }
    }
}
