package programmers.lv_0;

public class 점의_위치_구하기 {
    public int solution(int[] dot) {
        return dot[0]>0?(dot[1]>0?1:4):(dot[1]>0?2:3);
    }
}
