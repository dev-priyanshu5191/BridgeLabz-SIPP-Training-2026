import java.util.Scanner;

public class StringIndexDemo {

    // Generate Exception
    public static void generateException(String text) {

        System.out.println(text.charAt(text.length()));
    }

    // Handle Exception
    public static void handleException(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // Uncomment to generate exception
        // generateException(text);

        handleException(text);

        sc.close();
    }
}