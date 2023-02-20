package programmers.lv_0;

public class 숨어있는_숫자의_덧셈_1 {
    public int solution(String my_string) {
        String [] strArr = my_string.replaceAll("[a-z|A-Z]","").trim().split("");
        int answer = 0;
        for (String s : strArr) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
