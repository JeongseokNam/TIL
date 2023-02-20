package programmers.lv_1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int maxX = 0;
        int maxY =0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0]< sizes[i][1]){
                int tempInt = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tempInt;
            }
            if (maxX<sizes[i][0]){
                maxX=sizes[i][0];
            }
            if (maxY<sizes[i][1]){
                maxY=sizes[i][1];
            }
        }
        return maxX*maxY;
    }
}
