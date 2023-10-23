import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("1. Login\n2. Register");
        int n = sc.nextInt();


        if (n == 1) {


            String s1, s2;
            while (true) {
                s1 = sc.next();
                s2 = sc.next();
                LoginSystem obj1 = new LoginSystem(s1, s2);

                if (obj1.getFlag() == 1)
                    break;

                else
                    System.out.println("Try again!");

            }
        }

        else if(n==2)
        {
            String s1, s2, s3, s4, s5;
            int age;
            System.out.println("Enter Your Name: ");
            s1 = sc.next();
            System.out.println("Enter your preferred username: ");
            s2 = sc.next();

            while(true) {
                System.out.println("Enter your Password: ");
                s3 = sc.next();
                System.out.println("Confirm Password: ");
                s4 = sc.next();

                if(s3.equals(s4))
                    break;
            }
            System.out.println("Enter mail address: ");
            s5 = sc.next();
            System.out.println("Enter your age: ");
            age = sc.nextInt();

            Registration obj2 = new Registration(s1, s2 , s3, s5, age);
        }
        sc.close();
    }
}