import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int answer = sum(n);
        
        return answer;
    }
    public static int sum(int num) {
        
        if(num <= 0) {
            
            return num;
            
        }
        else {
            
            return num % 10 + sum(num / 10);
            
        }
        
    }
}