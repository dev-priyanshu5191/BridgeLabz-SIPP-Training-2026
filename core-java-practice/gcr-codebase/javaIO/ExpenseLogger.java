import java.io.*;
import java.util.*;

public class ExpenseLogger {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        FileWriter fw = new FileWriter("expenses.txt", true);

        fw.write(category + " - " + amount + "\n");

        fw.close();

        System.out.println("Expense Saved");
    }
}