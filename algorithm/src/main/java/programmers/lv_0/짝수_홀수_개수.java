package programmers.lv_0;

public class 짝수_홀수_개수 {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for (int i : num_list) {
            if (i % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}
