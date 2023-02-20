package programmers.lv_1;

public class 소수_만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int tempNum = nums[i]+nums[j]+nums[k];
                    int cnt = 0;
                    for (int l = 0; l < tempNum; l++) {
                        if (tempNum%(l+1)==0){
                            cnt++;
                        }
                    }
                    if (cnt==2){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
