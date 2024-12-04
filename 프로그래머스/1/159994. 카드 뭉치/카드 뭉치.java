import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        ArrayDeque<String> cards1Deque = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cards2Deque = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalDeque = new ArrayDeque<>(Arrays.asList(goal));
        
        while(!goalDeque.isEmpty()) {
            
            if(!cards1Deque.isEmpty() && cards1Deque.peekFirst().equals(goalDeque.peekFirst())) {
                cards1Deque.pollFirst();
                goalDeque.pollFirst();
            }
            else if(!cards2Deque.isEmpty() && cards2Deque.peekFirst().equals(goalDeque.peekFirst())) {
                cards2Deque.pollFirst();
                goalDeque.pollFirst();
            }
            else {
                break;
            }
            
        }

        return goalDeque.isEmpty() ? "Yes" : "No";
    }
}