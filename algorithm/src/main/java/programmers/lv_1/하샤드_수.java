package programmers.lv_1;

public class 하샤드_수 {
    public boolean solution(int x) {
        String [] xArr= String.valueOf(x).split("");
        int i = 0;
        for (String s : xArr) {
            i+=Integer.parseInt(s);
        }
        return x%i==0;
    }
}
