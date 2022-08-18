import programmers.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("알고리즘 테스트 시작");

        소수_만들기 s = new 소수_만들기();
        int[] arr = {1,2,7,6,4};

        System.out.println("결과 : "+s.solution(arr));
        System.out.println("알고리즘 테스트 끝");
    }
}
