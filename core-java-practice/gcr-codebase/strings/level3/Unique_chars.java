import java.util.Scanner;

public class UniqueCharacters {

    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static char[] uniqueCharacters(String text) {

        int n = findLength(text);

        char[] temp = new char[n];
        int size = 0;

        for (int i = 0; i < n; i++) {

            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < size; j++) {
                if (temp[j] == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[size++] = ch;
            }
        }

        char[] result = new char[size];

        for (int i = 0; i < size; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] result = uniqueCharacters(text);

        System.out.println("Unique Characters:");

        for (char ch : result)
            System.out.print(ch + " ");
    }
}