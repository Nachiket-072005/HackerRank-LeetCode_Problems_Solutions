import java.util.*;

public class Main {

    public static int solve(int[] A, int K) {
        int count = 0;
        
        for (int i = 0; i < A.length; i++) {
            int n = A[i];
            int sum = 0;
            while(n > 0) {
                int lastDigit = n % 10;
                sum += lastDigit;
                n /= 10;
            }
            
            if (sum < K) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(solve(A, K));
        scanner.close();
    }
}