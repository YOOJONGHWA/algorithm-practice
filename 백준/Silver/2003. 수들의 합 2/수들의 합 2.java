
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] == m) count++;
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];

                if (sum == m) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
