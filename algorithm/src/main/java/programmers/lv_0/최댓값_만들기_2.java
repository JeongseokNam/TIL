package programmers.lv_0;


public class 최댓값_만들기_2 {
    public int solution(int[] numbers) {
        int answer = 0;
        if (numbers.length==2){
            answer = numbers[0]*numbers[1];
        }else {
            for (int i = 0; i < numbers.length; i++) {
                for(int j = 0; j < numbers.length; j++) {
                    if (i!=j&&numbers[i]*numbers[j]>answer) {
                        answer=numbers[i]*numbers[j];
                    }
                }
            }
        }
        return answer;
    }
}
