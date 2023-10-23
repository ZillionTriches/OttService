import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LoginSystem {

    private String username;
    private String password;

    int flag = 0;

    public LoginSystem(String username, String password){

        this.username = username;
        this.password = password;
        login();

    }

    private void login(){
        try {
            File myObj = new File("/Users/mamunulalam/Desktop/Java Project/OTTservice Prototype-1/Data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String uname = myReader.next();
                String upass = myReader.next();

                if (uname.equals(this.username) && upass.equals(this.password)) {
                    System.out.println("Welcome User");
                    flag = 1;
                    break;
                }
                myReader.close();
            }
        }catch (Exception e) {
            System.out.println("Invalid Username or Password");
            e.printStackTrace();
        }

    }
    public int getFlag()
    {
        return flag;
    }



}
