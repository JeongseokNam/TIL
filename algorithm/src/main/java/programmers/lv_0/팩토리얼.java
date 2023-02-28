package programmers.lv_0;

public class 팩토리얼 {
    public int solution(int n) {
        int answer = 1;
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp = temp*i;
            if (temp>n){
                answer = i-1;
                break;
            }
            if (temp==n) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
