//아래 프로그램을 보고 물음에 답하라.(6~9)
//예제 : Circle.java , CircleTest.java
// Circle 클래스 정의에서 PI의 선언 부분에 적당한 키워드 2개가 필요하다. 밑줄 그은 부분에 들어갈 내용을 쓰시오.
// 답 : static final
// Circle 클래스 정의에서 private 데이터 필드 r은 원의 반지름을 표현하기 위한 것이다.  Circle 클래스 정의에 반지름을 리턴해 주는 메소드인 getR( )을 작성하시오.
// 답 : public int getR() { return this.r; }
// Circle 클래스 정의에서 반지름을 변경하기 위한 메소드인 setR( )을 작성하시오.
// 답 : public void setR(int r) { this.r = r; }
//  main 함수에서 생성된 Circle 객체 c2의 최초 반지름은 얼마인가? 만약 c2의 반지름을 10으로 바꾸고자 한다면 밑줄 부분에 어떤 문장을 넣어야 하는가?
// 답 : 0, c2.setR(10);