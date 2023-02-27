package programmers.lv_0;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 문자열_정렬하기_2 {
    public String solution(String my_string) {
        my_string= my_string.toLowerCase();
        String[] strArr = my_string.split("");
        Arrays.sort(strArr);
        String answer = "";
        for(String s:strArr){
            answer+=s;
        }
        return answer;
    }
}
