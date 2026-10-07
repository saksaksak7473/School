import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        String date;
        boolean isValid = false;
        System.out.print("Enter yyyy-mm-dd: ");

        try (Scanner input = new Scanner(System.in)) {
            date = input.nextLine();
        }

        if (date.length() == 10 && date.charAt(4) == '-' && date.charAt(7) == '-') {
            try {
                int month = Integer.parseInt(date.substring(5, 7));
                int day = Integer.parseInt(date.substring(8, 10));
                if ((month > 0 && month < 13) && (day > 0 && day < 32)) {
                    isValid = true;
                }
            }
            catch (NumberFormatException error_msg) {
                isValid = false;
            }
        }

        if (isValid) {System.out.println("Valid Date!");}
        else {System.out.println("Invalid Date!");}
    }
}
