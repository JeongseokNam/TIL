package JAVA;

//다음은 배열 names에 포함된 원소들을 순서대로 출력하는 프로그램이다. 프로그램을 잘 읽은 후 밑줄 그은 부분에 들어가야 할 내용을 적으시오. (반드시 for-each 구문을 사용할 것)
//답 : String element : names
public class Q5 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Lee", "Yun", "Moon", "Choo"};
        for (String element : names)
            System.out.println(element + " ");
        System.out.println();
    }
}
