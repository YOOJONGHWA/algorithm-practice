import java.util.*;
class Solution{
    public int solution(String s){
        
        int n = s.length();
        
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char[] ch = s.toCharArray();
        for(int i = 0; i < n; i++) {
            
            if(!stack.isEmpty() && stack.peek() == ch[i]) {
                stack.pop();
            }
            else {
                stack.push(ch[i]);
            }
         
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}