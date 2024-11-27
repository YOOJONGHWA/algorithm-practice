import java.util.*;

class Solution {
    public int solution(String s) {
        
        HashMap<Character, Character> map = new HashMap<>();
        
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        int length = s.length();
        
        s += s;
        
        int answer = 0;
        
        A:for(int i = 0; i < length; i++) {
            
            ArrayDeque<Character> deque = new ArrayDeque<>();
            
            for(int j = i; j < i + length; j++) {
                
                char c = s.charAt(j);
                
                if(!map.containsKey(c)) {
                    deque.push(c);
                }
                else {
                    
                    if(deque.isEmpty() || !deque.pop().equals(map.get(c))) {
                        continue A;
                    }
                    
                }
                
            }
            if(deque.isEmpty()) {
                answer++;
            }
        }
        

        return answer;
    }
}