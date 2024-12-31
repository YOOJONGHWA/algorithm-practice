import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            
            int a = commands[i][0] - 1;
            int b = commands[i][1];
            int c = commands[i][2];
            
            int[] sort = new int[b - a + 1];
            int index = 0;
            for(int j = a; j < b; j++) {
                sort[index++] = array[j];
            }
            Arrays.sort(sort);
            for(int k = 0; k < sort.length; k++) {
                System.out.print(sort[k] + " ");
            }
            System.out.println();
            answer[i] = sort[c];
            
        }
        return answer;
    }
}