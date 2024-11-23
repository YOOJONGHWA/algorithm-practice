class Solution {
    
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int n1 = arr1.length;
        int n2 = arr1[0].length;
        int n3 = arr2.length; // 이건머지?
        int n4 = arr2[0].length;
        
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
        
        int[][] answer = new int[n1][n4];
        
        for(int i = 0; i < n1; i++) {
            
            for(int j = 0; j < n4; j++) {
                
                for(int k = 0; k < n2; k++) {
                    
                    answer[i][j] += arr1[i][k] * arr2[k][j];
          
                    
                }
                
            }
            
        }
        
        return answer;
    }
}