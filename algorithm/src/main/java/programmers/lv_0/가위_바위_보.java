package programmers.lv_0;

public class 가위_바위_보 {
    public String solution(String rsp) {
        String answer = "";
        for (String str : rsp.split("")) {
            if(str.equals("2")){
                answer+=("0");
            } else if (str.equals("0")) {
                answer+=("5");
            }else{
                answer+=("2");
            }
        }
        return answer;
    }
}
