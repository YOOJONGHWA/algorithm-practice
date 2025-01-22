

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int board = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[board + 1][board + 1];

        for (int i = 1; i <= board; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= board; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] prefix = new int[board + 1][board + 1];
        for (int i = 1; i <= board; i++) {
            for (int j = 1; j <= board; j++) {
                prefix[i][j] = arr[i][j] + prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1];
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 구간 합 계산
            int sum = prefix[x2][y2] - prefix[x1 - 1][y2] - prefix[x2][y1 - 1] + prefix[x1 - 1][y1 - 1];
            result.append(sum).append("\n");
        }

        System.out.print(result.toString());
    }
}
