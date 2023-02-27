package programmers.lv_1;

public class 서울에서_김서방_찾기 {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                answer += i;
                break;
            }
        }
        return answer+"에 있다";
    }
}
