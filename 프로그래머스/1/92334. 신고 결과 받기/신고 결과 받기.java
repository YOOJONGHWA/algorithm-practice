import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Map<String, Integer> reportCount = new HashMap<>();
        Map<String, Set<String>> reportsByUser = new HashMap<>();
        int[] result = new int[id_list.length];
        
        for (String id : id_list) {
            reportCount.put(id, 0);
            reportsByUser.put(id, new HashSet<>());
        }
        
        for (String r : report) {
            String[] split = r.split(" ");
            String reporter = split[0]; 
            String reported = split[1];
            
            if (!reportsByUser.get(reporter).contains(reported)) {
                reportsByUser.get(reporter).add(reported);
                reportCount.put(reported, reportCount.get(reported) + 1);
            }
        }
        
        Set<String> suspendedUsers = new HashSet<>();
        for (String id : id_list) {
            if (reportCount.get(id) >= k) {
                suspendedUsers.add(id);
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            int mailCount = 0;
            for (String reportedUser : reportsByUser.get(user)) {
                if (suspendedUsers.contains(reportedUser)) {
                    mailCount++;
                }
            }
            result[i] = mailCount;
        }
        
        return result;
    }
}
