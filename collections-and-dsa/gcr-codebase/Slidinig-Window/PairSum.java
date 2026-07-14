package Sliding_Window;

public class PairSum {
    public static int[] pairSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] transactions = {5000, 12000, 18000, 25000, 30000, 37000};
        int target = 42000;
        int[] result = pairSum(transactions, target);
        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + transactions[result[0]] + " + " + transactions[result[1]]
                    + " = " + target);
        } else {
            System.out.println("No pair found.");
        }
    }
}