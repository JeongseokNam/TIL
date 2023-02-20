package programmers.lv_0;

import java.util.Arrays;
import java.util.stream.Stream;

public class 문자열_정렬하기_1 {
    public int[] solution(String my_string) {
        String[] strs = my_string.replaceAll("[^0-9]", "").split("");
        int[] answer = Stream.of(strs).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
