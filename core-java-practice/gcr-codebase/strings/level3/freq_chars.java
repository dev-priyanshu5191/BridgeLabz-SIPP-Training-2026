import java.util.Scanner;

public class FrequencyUsingUnique {

    public static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int size = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            boolean found = false;

            for (int j = 0; j < size; j++) {

                if (temp[j] == ch) {
                    found = true;
                    break;
                }
            }

            if (!found)
                temp[size++] = ch;
        }

        char[] result = new char[size];

        for (int i = 0; i < size; i++)
            result[i] = temp[i];

        return result;
    }

    public static String[][] characterFrequencyUsingUnique(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        char[] unique = uniqueCharacters(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {

            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = characterFrequencyUsingUnique(text);

        System.out.println("Character\tFrequency");

        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}