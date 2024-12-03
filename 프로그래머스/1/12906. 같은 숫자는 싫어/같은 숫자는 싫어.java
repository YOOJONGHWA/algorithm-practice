import java.util.*;

public class Solution {
    
    public int[] solution(int []arr) {
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++) {
            
            if(!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
            }
            stack.push(arr[i]);
            
        }
        
        int[] answer = new int[stack.size()];
        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}