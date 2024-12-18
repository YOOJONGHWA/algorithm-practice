

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int trim = (int) Math.round(n * 0.15); 
        int total = 0;

        for (int i = trim; i < n - trim; i++) {
            total += arr[i];
        }

        int validCount = n - 2 * trim;
        int result = (int) Math.round((double) total / validCount);

        System.out.println(result);
    }
}
