import java.util.Scanner;

public class Water_Reflection {
    public static void solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[][] reflected = new int[N][M];

        // Reverse the rows to get the water reflection
        for (int i = 0; i < N; i++) {
            reflected[i] = A[N - 1 - i];
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(reflected[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        solve(A);
        scanner.close();
    }
}
