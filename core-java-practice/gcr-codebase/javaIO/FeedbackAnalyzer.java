import java.io.*;

public class FeedbackAnalyzer {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("feedback.txt"));

        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {

            if (line.toLowerCase().contains("good")) {
                count++;
            }
        }

        br.close();

        System.out.println("Good Feedback Count = " + count);
    }
}