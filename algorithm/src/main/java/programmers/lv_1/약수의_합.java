package programmers.lv_1;

import java.util.logging.LogRecord;

public class 약수의_합 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
