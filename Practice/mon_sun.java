public class mon_sun {
    public static void main(String args[]){
        int today = 6;
        String day = "";
        switch (today){
            case 1: day = "Monday";
            break;

            case 2: day = "Tuesday";
            break;

            case 3: day = "Wednesday";
            break;

            case 4: day = "Thrusday";
            break;

            case  5: day = "Friday";
            break;

            case 6: day = "Saturday";
            break;

            case 7: day = "Sunday";
            break;

            default:
            System.out.println("Invled day number entry (enter 1-7 number)");
            break;
        }
        System.out.println(day);
    }

}
