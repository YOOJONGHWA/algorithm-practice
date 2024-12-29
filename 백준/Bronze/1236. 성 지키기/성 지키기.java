

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = ch[j];
            }
        }

        int rowCount = 0; // 'X'가 없는 행의 개수
        for (int i = 0; i < n; i++) {
            boolean hasX = false;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'X') {
                    hasX = true;
                    break;
                }
            }
            if (!hasX) {
                rowCount++;
            }
        }

        int colCount = 0; // 'X'가 없는 열의 개수
        for (int j = 0; j < m; j++) {
            boolean hasX = false;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 'X') {
                    hasX = true;
                    break;
                }
            }
            if (!hasX) {
                colCount++;
            }
        }

        System.out.println(Math.max(rowCount, colCount)); // 필요한 최소 경비원 수
    }
}
