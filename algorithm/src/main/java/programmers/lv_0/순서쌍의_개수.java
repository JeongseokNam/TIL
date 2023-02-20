package programmers.lv_0;

public class 순서쌍의_개수 {
    public int solution(int n) {
        int cnt = 0;
        for (int i = 1; i < n+1; i++) {
            if (n%i==0){
                cnt++;
            }
        }
        return cnt;
    }
}
