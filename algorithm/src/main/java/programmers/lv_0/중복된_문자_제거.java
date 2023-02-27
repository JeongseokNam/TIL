package programmers.lv_0;

import java.util.ArrayList;

public class 중복된_문자_제거 {
    public String solution(String my_string) {
        String answer = "";
        while (!("".equals(my_string))){
            answer+=my_string.charAt(0);
            my_string = my_string.replace(String.valueOf(my_string.charAt(0)),"");
        }
        return answer;
    }
}
