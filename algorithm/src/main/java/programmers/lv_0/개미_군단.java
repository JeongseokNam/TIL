package programmers.lv_0;

public class 개미_군단 {
    public int solution(int hp) {
        int answer = 0;
        int attack = 5;
        while (hp>0){
            answer += hp/attack;
            hp = hp%attack;
            attack-=2;
        }
        return answer;
    }
}
