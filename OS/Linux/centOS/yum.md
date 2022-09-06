# 목차
- [yum 이란?](#yum-이란?)
- [명령어](#명령어)
# yum 이란?
yum 은 Yellowdog Updater Modified 의 약자로 대화형 패키지 관리 시스템이다.

Slackware 때 사용하던 .tgz 패키지에 비해 rpm 은 의존성 관리와 버전 관리라는 장점이 있었지만 실제 rpm 으로 Linux 시스템을 관리할 경우 다음과 같은 문제가 있었다.   

- 특정 rpm 에 의존성 있는 패키지가 있을 경우 일일이 다운받아서 의존성 있는 rpm을 설치해야 함.
- rpm 이 update 됐을 경우  update 됐다는 사실을 알기가 어려움(패키지마다 직접 확인 필요)   

yum 은 central repository 를 통해 rpm 을 배포하고 의존성 관리를 하므로 손쉽게 패키지를 관리할수 있다.

# 명령어
- `update`   
  - 패키지 명이 있을경우, 해당 패키지의 새 버전이 있으면 update 한다.
  - 패키지명이 없을경우, 전체 시스템에서 update 될 패키지를 확인후 업데이트 한다.
- `check-update` update 될 패키지의 목록 출력.
- `clean` 
- `check`
- `repolist` 현재 등록된 repository list 를 출력.
- `search` 패키지명 및 description 에 검색어가 포함된 패키지를 출력.
- `localinstall` yum repository 를 제공하지 않고 rpm 으로만 제공하는 패키지가 있을 경우 (Ex: MySQL) 유용한 명령어다.   
   rpm 을 로컬에 다운로드하고 yum localinstall 로 설치하면 된다.   
   rpm -ivh 로 설치할 수도 있지만 yum  으로 작업하면 transaction 기록이 남으므로 yum history 를 사용하여 rollback 이 가능하다.   
   rpm 제작사의 서명이 없어서 에러가 날수 있으므로 --nogpgcheck 옵션을 추가해야 할 경우도 있다.   
- `list` 설치 가능한 리스트 출력
    > *(별표) 를 사용한 리스트 출력시 '(작은따옴표) 로 감쌀것.
# 작성중 ...
