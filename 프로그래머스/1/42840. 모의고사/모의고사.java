/*
    1, 2, 3, 4, 5
    2, 1, 2, 3, 2, 4, 2, 5,
    3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 

*/
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        /*
        *   이중 배열을 전혀 생각하지 못함....
        *
        *   int[][] pattern = {
        *
        *       {1, 2, 3, 4, 5},
        *       {2, 1, 2, 3, 2, 4, 2, 5},
        *       {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        *   };
        *
        * */
        
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        
        for(int i = 0; i < answers.length; i++) {
            
            if(one[i % one.length] == answers[i]) oneCount++;
            if(two[i % two.length] == answers[i]) twoCount++;
            if(three[i % three.length] == answers[i]) threeCount++;

        }
        
        int result = Math.max(oneCount, Math.max(twoCount,threeCount));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(oneCount == result) list.add(1);
        if(twoCount == result) list.add(2);
        if(threeCount == result) list.add(3);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

// 두번째 풀이

import java.util.*;
class Solution {
    public int[] solution(int[] answers) {

        int[][] pattern = {

                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}

        };

        int[] scores = new int[3];

        for(int i = 0; i < answers.length; i++) {

            for(int j = 0; j < pattern.length; j++) {

                if(answers[i] == pattern[j][i % pattern[j].length]) {

                    scores[j]++;

                }

            }

        }

        int result = Math.max(scores[0], Math.max(scores[1],scores[2]));

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < scores.length; i++) {

            if(scores[i] == result) {
                list.add(i + 1);
            }

        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}