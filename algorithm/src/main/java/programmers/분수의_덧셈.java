package programmers;

public class 분수의_덧셈 {
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int bunja= denum1*num2+denum2*num1;
        int bunmo= num1*num2;
        int g = 0;
        for (int i = 1 ; (i<=bunja&&i<=bunmo); i++) {
            if (bunja%i==0&&bunmo%i==0) {
                g=i;
            }
        }
        int[] answer = {bunja/g,bunmo/g};
        return answer;
    }
}
