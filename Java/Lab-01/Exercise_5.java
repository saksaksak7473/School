import java.util.Scanner;

public class Exercise_5 {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }
        // Ex: i = 5 => i * i = 25 and 25 is modulus of i = 5
        // Ex: i = 7 => i * i = 49 and 49 is modulus of i = 7

        return true;
    }
    public static void main(String[] args) {
        String Input;
        System.out.println("Enter n number: ");

        try (Scanner input = new Scanner(System.in)) {
            Input = input.nextLine();
        }

        try {
            int number = Integer.parseInt(Input);
            if (isPrime(number)) {
                System.out.println(number + " is a Prime number.");
            }
            else {
                System.out.println(number + " is not a Prime number.");
            }
        }
        catch (NumberFormatException error_msg) {
            System.out.println("Invalid Number!");
        }
    }
}