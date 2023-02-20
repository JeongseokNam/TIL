package programmers.lv_0;

public class 피자_나눠_먹기_3 {
    public int solution(int slice, int n) {
        int answer = 0;
        boolean flag = true;
        while (flag){
            answer++;
            if(slice*answer>=n){
                flag=false;
            }
        }
        return answer;
    }
}
