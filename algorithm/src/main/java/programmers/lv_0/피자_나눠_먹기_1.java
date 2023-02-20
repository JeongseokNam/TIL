package programmers.lv_0;

public class 피자_나눠_먹기_1 {
    public int solution(int n) {
        int count =1;
        while (true){
            if (count*7/n>=1){
                return count;
            }
            count++;
        }
    }
}
