
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class SchoolResultPortal{
    public static void main(String[] args) {
        String inFile = "students.txt";
        String outFile = "reportcard.txt";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile, true));
        ){
            String line;
            while((line == br.readLine()) != null){
                String[] data = line.split(" ");
                String name = data[0];

                int m1=Integer.parseInt(data[1]);
                int m2=Integer.parseInt(data[2]);
                int m3=Integer.parseInt(data[3]);

                double avg = (m1+m2+m3)/3.0;

                bw.write("Student: "+name);
                br.newLine();
                br.write("Marks: "+m1+","+m2+","+m3);
                br.newLine();
                br.write("Avg: "+avg);
                br.newLine();
                br.write("----------------------");
                br.newLine();
            }
            System.out.print("Report Card");
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: "+e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error while processing file: "+e.getMessage());
        }
    }
}