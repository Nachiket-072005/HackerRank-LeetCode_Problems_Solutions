import java.util.Arrays;
import java.util.Scanner;

public class Count_Triplets {
    public static int solve(int[] A) {
        int count = 0;
        int N = A.length;

        // Sort the array to simplify the triangle inequality check
        Arrays.sort(A);

        // Iterate over the third side (largest side of the triangle)
        for (int k = 2; k < N; k++) {
            int i = 0, j = k - 1;
            while (i < j) {
                // Check the triangle inequality condition
                if (A[i] + A[j] > A[k]) {
                    // Ensure pairwise distinct elements
                    for (int x = i; x < j; x++) {
                        if (A[x] != A[j] && A[x] != A[k] && A[j] != A[k]) {
                            count++;
                        }
                    }
                    j--; // Move j to find other valid pairs
                } else {
                    i++; // Increase i to get a larger sum
                }
            }
        }
        return count;
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
