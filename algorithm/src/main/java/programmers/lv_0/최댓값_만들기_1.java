package programmers.lv_0;

import java.util.Arrays;
import java.util.Collections;

public class 최댓값_만들기_1 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}
