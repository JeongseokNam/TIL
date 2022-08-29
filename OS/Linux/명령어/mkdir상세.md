# 목차
- [mkdir이란?](#mkdir이란?)
- [옵션](#옵션)

# mkdir이란?
- make directory 의 약자로 디렉토리(폴더)를 생성할 때 사용하는 명령어.
    >`mkdir` `new_directory` > new_directory 생성
- 경로를 지정하지 않으면 현 위치가 Default
    >`mkdir` `/home/user/new_folder` > /home/user/위치에 new_directory 디렉토리 생성
- 생성할 디렉토리를 여러개 나열하여 한번에 복수의 디렉토리를 생성 가능.
    >`mkdir` `new_directory` `new_directory2` `new_directory3` > new_directory, new_directory2, new_directory3 생성

# 옵션
- `-m` : 디렉토리를 생성할때 권한을 설정. (default : 755)
- `-p` : 상위 경로를 함께 생성.
- `-v` : 디렉토리를 생성하고 생성된 디렉토리에 대한 메세지 출력

> 현 위치에 존재하지 않는 새로운 디렉토리(ex : folder1)과 folder1 디렉토리 안에 folder2 디렉토리를 새로 생성하고 싶은경우.   
> `mkdir` `folder1/folder2`  -> 에러   
> `mkdir` `folder1` 명령어 이후 `mkdir` `folder1/folder2` 작성 혹은   
> `mkdir` `-p` `folder1/folder2` 명령어는 가능