/* Give Javacode to assume username and password and display success
 * login. If the username is "OPJS" and Password is "Raigarh" ?
 * Display the massage from usernaem or password if the user or
 * password is not correct.
 */
public class Q16 {
    public static void main(String[] args) {
        String Username = "OPJS";
        String Password = "Raigarh";

        if (Username.equals("OPJS")==true){
            if (Password.equals("Raigarh")==true){
                System.out.println("Successfully Login");
            }
            else{
                System.out.println("Usernaem or Passwrod is Wrong");
            }
        }
        else{
            System.out.println("Usernaem or Password is Wrong");
        }
    }
}
