package programmers.lv_0;

public class 배열_두_배_만들기 {
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i]=numbers[i]*2;
        }
        return answer;
    }
}
