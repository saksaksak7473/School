import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your Age: ");

        try (Scanner input = new Scanner(System.in)) {
            age = input.nextInt();
        }
        
        if (age <= 0 ) {
            System.out.println("Your have just or not even born yet!");
        }
        else if (age < 18) {
            System.out.println("You are not allowed to enter the Website!");
        }
        else if (age >= 18 || age < 60) {
            System.out.println("Welcome to our website!");
        }
        else {
            System.out.println("You are to old to enter the Website");
        }

    }
}
