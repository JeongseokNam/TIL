package programmers.lv_0;

public class 외계행성의_나이 {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String[] ageStr = String.valueOf(age).split("");
        for (int i = 0; i < ageStr.length; i++) {
            char c = (char) (Integer.parseInt(ageStr[i])+97);
            answer.append(c);
        }
        return answer.toString();
    }
}
