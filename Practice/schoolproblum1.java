/*
Write the following code in one project?
i. Define a method by the name check even odd ot check if the given values in even or odd ?
ii. Define a method by the naem display even which display the first five even number ?
*/



public class schoolproblum1 {
    class Java{
        static void checkevenodd(){
            int n = 6;
            if (n%2 == 0){
                System.out.println(n + " is a even number ");
            }
            else{
                System.out.println(n + " is a odd number");
            }
        }

        static void even(){
            for (int i = 2; i <=10; i=i+2){
                System.out.println(i);
            }
        }
        public static void main(String[] args) {
            System.out.println("Even odd checker :-");
            checkevenodd();
            System.out.println();
            System.out.println("Top 5 even numeber :- ");
            even();

        }
    }  
}
