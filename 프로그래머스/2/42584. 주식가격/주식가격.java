import java.util.*;

class Solution {
    public int[] solution(int[] prices) {

        int n = prices.length;

        int[] answer = new int[n];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {

            // 현재 가격이 이전 시간의 가격보다 작다면

            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int index = stack.pop();
                answer[index] = i - index; // 가격이 떨어진 경우 걸린 시간
            }
            stack.push(i);

        }

        // 끝가지 가격이 떨어지지 않은 경우 처리
        while(!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = n - 1 - index;
        }


        return answer;
    }
}