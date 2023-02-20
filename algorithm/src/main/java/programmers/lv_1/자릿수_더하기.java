package programmers.lv_1;

public class 자릿수_더하기 {
    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str.substring(i, i+1));
        }
        return answer;
    }
}
