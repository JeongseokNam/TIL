package programmers;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX = 0;
        int maxY =0;
        int newX=0;
        int newY=0;
        for (int i = 0; i < sizes.length; i++) {
            if (maxX<sizes[i][0]){
                maxX=sizes[i][0];
            }
            if (maxY<sizes[i][1]){
                maxY=sizes[i][1];
            }
        }
        answer=maxX*maxY;
        for (int i = 0; i < sizes.length; i++) {
            int[][] tempArr = sizes;
            if (maxX> sizes[i][1]&&maxY>sizes[i][0]){
                int tempMaxX = 0;
                int tempMaxY = 0;
                tempArr[i][0]=sizes[i][1];
                tempArr[i][1]=sizes[i][0];
                for (int j = 0; j < tempArr.length; j++) {
                    System.out.println(tempArr[j][0]+"/"+tempArr[j][1]);
                    if (tempMaxX<tempArr[i][0]){
                        tempMaxX=tempArr[i][0];
                    }
                    if (tempMaxY<tempArr[i][1]){
                        tempMaxY=tempArr[i][1];
                    }
                    if (answer>tempMaxX*tempMaxY){
                        answer=tempMaxX*tempMaxY;
                        System.out.println(tempMaxX+"+"+tempMaxY+"="+answer);
                    }
                }
            }
        }
        return answer;
    }
}
