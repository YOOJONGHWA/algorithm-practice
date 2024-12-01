import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        
        Stack<Integer>[] stacks = new Stack[board.length];
        for(int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();
        }
        
        for(int i = board.length - 1; i >= 0; i--) {
            
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] > 0) {
                    stacks[j].push(board[i][j]);
                }
            }
            
        }
        
        Stack<Integer> buget = new Stack<>();
        int answer = 0;
        for(int move : moves) {
            
            if(!stacks[move - 1].isEmpty()) {
                int doll = stacks[move - 1].pop();
                
                if(!buget.isEmpty() && buget.peek() == doll) {
                    buget.pop();
                    answer += 2;
                }
                else {
                    buget.push(doll);
                }
            }
            
        }

        return answer;
    }
}