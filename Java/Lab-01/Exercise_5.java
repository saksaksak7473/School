import java.util.Scanner;

public class Exercise_5 {
    public static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i ++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number >= 2;
    }
    
    public static void main(String[] args) {
        String Input;
        System.out.println("Enter n number: ");

        try (Scanner input = new Scanner(System.in)) {
            Input = input.nextLine();
        }

        try {
            int number = Integer.parseInt(Input);
            System.out.print("All prime numbers from 2 to " + number + ": ");
            for (int i = 2; i <= number; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
        catch (NumberFormatException error_msg) {
            System.out.println("Invalid Number!");
        }
    }
}