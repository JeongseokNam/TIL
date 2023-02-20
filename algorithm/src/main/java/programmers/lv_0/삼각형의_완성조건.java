package programmers.lv_0;

import java.util.Arrays;

public class 삼각형의_완성조건 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[0]+sides[1]>sides[2]?1:2;
    }
}
