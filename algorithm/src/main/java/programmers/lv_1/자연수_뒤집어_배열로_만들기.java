package programmers.lv_1;

public class 자연수_뒤집어_배열로_만들기 {
    public static int[] solution(long n) {
        String str_n[] = Long.toString(n).split("");
        int[] answer = new int[str_n.length];
        for (int i = 0,j=str_n.length-1; i < str_n.length; i++) {
            answer[i]=Integer.parseInt(str_n[j-i]);
        }
        return answer;
    }
}
