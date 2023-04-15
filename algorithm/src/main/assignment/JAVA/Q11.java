package JAVA;

class Q11 {
    //Grade 클래스에서 this가 생략된 부분을 찾은 후,  this를 추가하여 작성하시오.
    class Grade{
        private int e;//영어 성적을 위한 변수
        private int m;//수학 성적을 위한 변수

        public Grade(){
        }
        public Grade(int a, int b){
            this.e = a;
            this.m = b;
        }
        void output_grade() {//총점을 구하는 메소드
            System.out.println(e+m);
        }
    }
}
