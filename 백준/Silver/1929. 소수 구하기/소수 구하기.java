

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int first = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[last + 1];
        for (int i = 2; i <= last; i++) {
            isPrime[i] = true;
        }

        int sqrtLast = (int) Math.sqrt(last);

        for (int i = 2; i <= sqrtLast; i++) {
            if (!isPrime[i]) continue;

            for (int j = i * i; j <= last; j += i) {
                isPrime[j] = false;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = first; i <= last; i++) {
            if (isPrime[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb);
    }
}
