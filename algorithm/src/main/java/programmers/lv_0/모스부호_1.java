package programmers.lv_0;

import java.security.Key;
import java.util.Map;

public class 모스부호_1 {
    public String solution(String letter) {
        String answer="";
        String[] lArr = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (int i = 0; i < lArr.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (lArr[i].equals(morse[j])) {
                    answer+=(char)('a'+j);
                }
            }
        }
        return answer;
    }
}
