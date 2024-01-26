public class factorialmethod {
    class java{
        static void factorial5(){
            int n = 5;
            int f = 1;
            for (int i=1; i<=n; i++){
                f = f*i;
            }
            System.out.println("Factorial = " + f );
        }
        public static void main(String args[]){
            factorial5();
        }
        
    }
}
