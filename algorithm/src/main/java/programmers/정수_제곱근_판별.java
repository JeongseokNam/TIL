package programmers;

public class 정수_제곱근_판별 {
    public static long solution(long n) {
        long answer = -1;
        long i  = (long) Math.sqrt(n);
        if (n==(long) Math.pow(i,2)){
            answer = (long) Math.pow(i+1,2);
        }
        return answer;
    }
}
