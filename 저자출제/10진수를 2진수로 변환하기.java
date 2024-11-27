import java.util.Stack;

// 10진수를 2진수로 바꾸기
public class Solution {

    public static String Solution(int decimal) {

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        int num = decimal;
        while(num > 0) {
            stack.push(num % 2);
            num = num / 2;
        }
        /*
        *
        * 스택의 크기는 pop() 호출로 인해 계속 줄어든다.
        * 하지만 for 루프는 처음의 stack.size() 값을 기준으로 반복하기 때문에 루프가 정확히 실행되지 않거나, 예외가 발생할 수 있다.
        * */
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        System.out.println(Solution.Solution(10));
    }

}
