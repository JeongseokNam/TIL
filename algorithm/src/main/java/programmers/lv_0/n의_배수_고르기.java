package programmers.lv_0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class n의_배수_고르기 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++){
            if (numlist[i]%n == 0){
                list.add(numlist[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
