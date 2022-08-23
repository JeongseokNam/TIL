import programmers.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("알고리즘 테스트 시작");

        최소직사각형 s = new 최소직사각형();
        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println("결과 : "+s.solution(arr));
        System.out.println("알고리즘 테스트 끝");
    }
}
