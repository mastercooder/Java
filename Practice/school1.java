public class school1{
    public static void main(String args[]){
        int n = 40;
        int up = n%10;
        int tp = n/10;

        if (up == tp){
            System.out.println("It is a palindrone");
        }
        else{
            System.out.println("It's not a palindrone");
        }
    }
}