package programmers.lv_0;

public class 피자_나눠_먹기_2 {
    public int solution(int n) {
        int answer = 1;
        while (true){
            if (answer*6%n==0){
                return answer;
            }
            answer++;
        }
    }
}
