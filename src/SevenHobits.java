import java.util.Arrays;
import java.util.Scanner;

public class SevenHobits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = 9;
        int[] arr = new int[N];
        int sum = 0;
        boolean check = false;

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < N; i++) {
            if (check) break;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (sum - arr[j] - arr[i] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    check = true;
                    break;
                }
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < 9; i++) {
            if (arr[i] != 0) System.out.println(arr[i]);
        }
    }
}
