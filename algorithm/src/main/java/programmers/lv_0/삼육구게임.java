package programmers.lv_0;

public class 삼육구게임 {
    public int solution(int order) {
        int answer = 0;
            String[] orderToStrArr = String.valueOf(order).split("");
            for(String s : orderToStrArr){
                if (Integer.parseInt(s)%3==0&&Integer.parseInt(s)!=0){
                    answer++;
                }
            }
        return answer;
    }
}
