import java.util.*;

public class EmployeeAttendance {

    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int K) {

        int n = attendance.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (attendance[j] < attendance[j + 1]) {

                    int temp = attendance[j];
                    attendance[j] = attendance[j + 1];
                    attendance[j + 1] = temp;

                    temp = employeeIds[j];
                    employeeIds[j] = employeeIds[j + 1];
                    employeeIds[j + 1] = temp;
                }

                else if (attendance[j] == attendance[j + 1] &&
                         employeeIds[j] > employeeIds[j + 1]) {

                    int temp = employeeIds[j];
                    employeeIds[j] = employeeIds[j + 1];
                    employeeIds[j + 1] = temp;
                }
            }
        }

        int[] ans = new int[K];

        for (int i = 0; i < K; i++) {
            ans[i] = employeeIds[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};
        int K = 3;

        int[] ans = topKEmployees(employeeIds, attendance, K);

        System.out.println(Arrays.toString(ans));
    }
}