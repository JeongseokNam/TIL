package programmers.lv_0;

public class 배열_회전시키기 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if ("right".equals(direction)){
            for (int i = 0; i < numbers.length-1; i++) {
                answer[i+1]=numbers[i];
            }
            answer[0] = numbers[numbers.length-1];
        }else {
            for (int i = 1 ; i < numbers.length; i++) {
                answer[i-1]=numbers[i];
            }
            answer[numbers.length-1] = numbers[0];
        }
        return answer;
    }
}
