package programmers.lv_0;

public class 숫자_찾기 {
    public int solution(int num, int k) {
        String numToStr = String.valueOf(num);
        return numToStr.indexOf(String.valueOf(k))>-1?numToStr.indexOf(String.valueOf(k))+1:numToStr.indexOf(String.valueOf(k));
    }
}
