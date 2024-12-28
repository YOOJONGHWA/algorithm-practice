

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 입력값을 대문자로 변환
        String upperStr = str.toUpperCase();
        char[] chars = upperStr.toCharArray();

        // 빈도수 계산
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 최빈값 찾기
        int max = 0;
        char maxChar = '?';
        boolean isDuplicate = false;

        for (char key : map.keySet()) {
            int num = map.get(key);

            if (num > max) {
                max = num;
                maxChar = key;
                isDuplicate = false; // 새로운 최대값이 나오면 중복 초기화
            } else if (num == max) {
                isDuplicate = true; // 중복 발생
            }
        }

        // 중복 여부 확인 후 출력
        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println(maxChar);
        }
    }
}
