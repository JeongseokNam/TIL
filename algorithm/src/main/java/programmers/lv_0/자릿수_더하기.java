package programmers.lv_0;

import java.util.Arrays;

public class 자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;
        String[] nArra = String.valueOf(n).split("");
        for (String s : nArra) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
