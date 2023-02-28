package programmers.lv_1;

public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 4; i <phone_number.length(); i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length() -4);
        return answer;
    }
}
