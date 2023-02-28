package programmers.lv_0;

import java.util.Arrays;

public class A로_B만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        if (before.length()==after.length()){
            String[] befores = before.split("");
            String[] afters = after.split("");
            for (int i = 0; i<befores.length ; i++){
                for(int j = 0; j<afters.length ; j++){
                    if(befores[i].equals(afters[j])){
                        afters[j]="";
                        break;
                    }
                }
            }
            if (String.join("",afters).equals("")){
                answer = 1;
            }
        }
        return answer;
    }
}
