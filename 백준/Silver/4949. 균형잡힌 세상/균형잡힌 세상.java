

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        // 괄호 매칭을 위한 HashMap 설정
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) break; // 종료 조건

            ArrayDeque<Character> stack = new ArrayDeque<>(); // 스택 초기화
            boolean isBalanced = true;

            for (char ch : str.toCharArray()) {
                // 여는 괄호 처리
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                }

                // 닫는 괄호 처리
                if (ch == ')' || ch == ']' || ch == '}') {
                    if (stack.isEmpty() || stack.peek() != map.get(ch)) {
                        isBalanced = false;
                        break; // 균형이 맞지 않으면 종료
                    } else {
                        stack.pop();
                    }
                }
            }

            // 결과 출력
            if (isBalanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
