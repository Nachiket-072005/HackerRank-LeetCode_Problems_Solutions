import java.util.Scanner;

public class Maximize_Array_Operation {
    public static int solve(int[] A) {
        int minOperations = Integer.MAX_VALUE;

        for (int num : A) {
            int count = 0;
            while (num % 2 == 0) {
                num /= 2;
                count++;
            }
            minOperations = Math.min(minOperations, count);
            if (minOperations == 0) {
                return 0;
            }
        }

        return minOperations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(solve(A));
        scanner.close();
    }
}
