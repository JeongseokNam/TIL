package programmers;
public class 제곱수_판별하기 {
    public int solution(int n) {
        int answer = 2;
        double sqrt = Math.sqrt(n);
        if (Math.pow((int)sqrt,2)== n) {
            answer = 1;
        }
        return answer;
    }
}
