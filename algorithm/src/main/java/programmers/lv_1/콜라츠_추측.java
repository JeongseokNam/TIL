package programmers.lv_1;

public class 콜라츠_추측 {
    public int solution(int num) {
        int answer = 0;
        long numToLong = (long) num;
        while (numToLong!=1){
            numToLong = numToLong%2==0?numToLong/2:numToLong*3+1;
            answer ++;
            if (answer==500){
                return -1;
            }
        }
        return answer;
    }
}
