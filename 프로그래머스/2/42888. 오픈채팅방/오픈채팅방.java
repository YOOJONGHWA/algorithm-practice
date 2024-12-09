import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        // 메시지 맵: Enter와 Leave에 대한 메시지를 정의
        HashMap<String, String> msg = new HashMap<>();
        msg.put("Enter", "님이 들어왔습니다.");
        msg.put("Leave", "님이 나갔습니다.");
        
        // 사용자 아이디와 닉네임을 저장하는 맵
        HashMap<String, String> uid = new HashMap<>();
        
        // 사용자 정보 업데이트 (Enter일 때만 닉네임 저장)
        for(String s : record) {
            String[] cmd = s.split(" ");
            if(cmd.length == 3) {
                uid.put(cmd[1], cmd[2]); // cmd[1]은 사용자 아이디, cmd[2]는 닉네임
            }
        }
        
        // 결과를 저장할 ArrayList
        ArrayList<String> answer = new ArrayList<>();
        
        // 레코드를 통해 메시지 생성
        for(String s : record) {
            String[] cmd = s.split(" ");
            if(msg.containsKey(cmd[0])) {  // Enter 또는 Leave일 경우
                answer.add(uid.get(cmd[1]) + msg.get(cmd[0])); // uid.get(cmd[1])로 닉네임 조회
            }
        }
        
        // ArrayList를 배열로 변환하여 반환
        return answer.toArray(new String[0]);
    }
}
