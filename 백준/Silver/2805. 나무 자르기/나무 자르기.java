import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열을 정렬합니다.
        Arrays.sort(arr);

        // 이진 탐색의 범위 설정
        int low = 0;
        int high = arr[n - 1];
        int result = 0;

        // 이진 탐색으로 자르는 높이를 찾습니다.
        while (low <= high) {
            int mid = (low + high) / 2;
            long total = 0;

            // 자른 나무의 총 길이를 구합니다.
            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    total += arr[i] - mid;
                }
            }

            // 자른 나무의 길이가 목표 m 이상이면, 높이를 더 높여야 하므로 low를 mid + 1로 설정
            if (total >= m) {
                result = mid; // 가능한 자르기 높이를 기록
                low = mid + 1;
            } else {
                high = mid - 1; // 목표보다 적으면 높이를 낮춰야 하므로 high를 mid - 1로 설정
            }
        }

        System.out.println(result);
    }
}
