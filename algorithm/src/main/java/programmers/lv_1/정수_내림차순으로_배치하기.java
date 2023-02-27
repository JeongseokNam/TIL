package programmers.lv_1;

import java.util.Arrays;

public class 정수_내림차순으로_배치하기 {
    public long solution(long n) {
        long answer=0;
        String[] nArr= String.valueOf(n).split("");
        Arrays.sort(nArr);
        long[] nIntArr = new long[nArr.length];
        for (int i=0; i<nArr.length; i++){
            nIntArr[i]= Integer.parseInt(nArr[nArr.length - 1 - i]);
        }
        for (long l : nIntArr){
            answer *= 10;
            answer += l;
        }
        return answer;
    }
}
