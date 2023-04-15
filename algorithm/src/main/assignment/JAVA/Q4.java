package JAVA;

// 아래와 같은 배열 선언에서 a.length의 값은 얼마인가? 또 a[1].length의 값은 얼마인가? 순서대로 쓰시오.
// ex) int[][] a = {{1,2,3}, {4,5}, {6,7,8,9}};
// 답 : 3, 2
public class Q4 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5}, {6,7,8,9}};
        System.out.println(a.length);
        System.out.println(a[1].length);
    }
}
