package programmers.lv_0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 인덱스_바꾸기 {
    public String solution(String my_string, int num1, int num2) {

        String [] strs = my_string.split("");
        String str1 = strs[num1];
        String str2 = strs[num2];
        strs[num1] = str2;
        strs[num2] = str1;
        return Arrays.stream(strs).collect(Collectors.joining());
    }
}
