public class NullPointerDemo {

    // Generate Exception
    public static void generateException() {

        String text = null;

        System.out.println(text.length());
    }

    // Handle Exception
    public static void handleException() {

        String text = null;

        try {
            System.out.println(text.length());
        }
        catch (NullPointerException e) {
            System.out.println("Exception Handled: " + e);
        }
    }

    public static void main(String[] args) {

        // Uncomment to generate exception
        // generateException();

        handleException();
    }
}