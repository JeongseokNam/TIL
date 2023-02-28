package programmers.lv_1;

import java.util.ArrayList;
import java.util.Collections;

public class 나누어_떨어지는_숫자_배열 {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            if (i%divisor == 0) answer.add(i);
        }
        if (answer.size() == 0) answer.add(-1);
        Collections.sort(answer);
        return answer;
    }
}
