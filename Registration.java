import java.io.FileWriter;
import java.io.IOException;

public class Registration {
    private String name;
    private String username;
    private String password;
    private String mailaddress;
    private int age;

    Registration(String name, String username, String password, String mailaddress, int age){
        this.name = name;
        this.username = username;
        this.password = password;
        this.mailaddress = mailaddress;
        this.age = age;

        register();
    }

    public void register(){
        try {
            FileWriter myWriter = new FileWriter("Data.txt");
            myWriter.write(this.username + " " + this.password);
            myWriter = new FileWriter("Users.txt");
            myWriter.write(this.name + " " + this.username + " " + this.password + " " + this.mailaddress
            + " " + this.age);
            myWriter.close();
            System.out.println("User added Successfully");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
