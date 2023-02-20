package programmers.lv_0;

public class 세균_증식 {
    public int solution(int n, int t) {
        int answer = n;
        while(0<t){
            answer +=n;
            n*=2;
            t--;
        }
        return answer;
    }
}
