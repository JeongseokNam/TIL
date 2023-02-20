package programmers.lv_1;

import java.util.ArrayList;

public class 같은_숫자는_싫어 {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i+1<arr.length) {
                if (arr[i] != arr[i + 1]) {
                    arrayList.add(arr[i]);
                }
            }else {
               arrayList.add(arr[i]);
            }
        }
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i]=arrayList.get(i);
        }
        return answer;
    }
}
