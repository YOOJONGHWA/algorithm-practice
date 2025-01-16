

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // 100만보다 작고 2이상의 약수를 가지고 있다면, 틀린 비밀번호

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            long number = Long.parseLong(br.readLine());

            for (int j = 2; j < 1_000_001; j++) {

                if (number % j == 0) { // 100만 이하의 약수가 존재한다!
                    System.out.println("NO");
                    break;
                }
                if (j == 1_000_000) {
                    System.out.println("YES");
                }

            }
        }
    }


}
