# 개념
- List, set, Map, Queue 등의 컬렉션 프레임워크 에서 값을 가져오가나 삭제할때 사용.
- 모든 컬렉션 프레임워크에 공통으로 사용 가능
- 쉽게 값을 가져오고 제거할 수 있음
- 단방향의 반복만 가능함
- 값의 변경, 추가는 불가능
- 대량의 데이터의 조회 시 속도가 느림

# 선언
> Iterator<`데이터타입`> `변수명` = 컬렉션.interator();

# 메소드
- Iterator.hasNext()
  - Iterator 안에 다음 값이 들어있는지 확인
  - 있으면 `true`, 없으면 `false` 반환
- Iterator.next()
  - iterator의 다음 값 가져오기
- Iterator.remove()
  - iterator에서 `next()` 시에 가져온 값을 컬렉션에서 삭제
  - 반드시 `next()`메소드 이후에 사용해야 함
