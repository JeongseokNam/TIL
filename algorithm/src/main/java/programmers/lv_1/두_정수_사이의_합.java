package programmers.lv_1;

public class 두_정수_사이의_합 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a==b){
            answer = a;
        }else if (a>b) {
            for (int i = b; i <= a; i++) {
                answer+=i;
            }
        }else {
                for (int i = a; i <= b; i++) {
                    answer+=i;
                }
            }
        return answer;
    }
}
