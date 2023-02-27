package programmers.lv_1;


public class 문자열_내_p와_y의_개수 {
    boolean solution(String s) {
        return s.replaceAll("(?i)p","").length()==s.replaceAll("(?i)y","").length();
    }
}
