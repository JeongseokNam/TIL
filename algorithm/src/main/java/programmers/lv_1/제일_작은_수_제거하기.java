package programmers.lv_1;

import java.util.ArrayList;

public class 제일_작은_수_제거하기 {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        if (arr.length==1) {
            answer.add(-1);
            return answer;
        }
        int[] low = {arr[0],0};
        for (int i=0; i < arr.length; i++) {
            if (arr[i] < low[0]) {
                low[0] = arr[i];
                low[1] = i;
            }
        }
        for (int i=0; i < arr.length; i++){
            if (i!=low[1]) answer.add(arr[i]);
        }
        return answer;
    }
}
