import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        // 각 작업의 남은 일수를 계산하여 deque에 추가
        for (int i = 0; i < progresses.length; i++) {
            int remaining = (100 - progresses[i]);
            int days = (int) Math.ceil((double) remaining / speeds[i]);
            deque.addLast(days);
        }

        List<Integer> result = new ArrayList<>();
        
        while (!deque.isEmpty()) {
            int current = deque.pollFirst(); // 현재 배포 기준 작업의 남은 일수
            int count = 1;

            // 기준 작업과 함께 배포 가능한 작업 계산
            while (!deque.isEmpty() && deque.peekFirst() <= current) {
                deque.pollFirst();
                count++;
            }
            
            result.add(count);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
