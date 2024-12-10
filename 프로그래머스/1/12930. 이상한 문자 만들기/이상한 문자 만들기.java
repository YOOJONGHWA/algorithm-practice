class Solution {
    public String solution(String s) {

        String[] str = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();
        

        for (int i = 0; i < str.length; i++) {
            String word = str[i];

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (j % 2 == 0) {
                    answer.append(Character.toUpperCase(ch)); 
                } else {
                    answer.append(Character.toLowerCase(ch)); 
                }
            }

            if (i < str.length - 1) {
                answer.append(" ");
            }
        }
        
        return answer.toString();
    }
}
