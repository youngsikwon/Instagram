# Instagram Project



>I want a spring boot novice to grow up by looking at this example.

>Pay close attention.


- Security base


- Model  -> Image, Tag, User, Likes, Follow


- WEB 
 - POST 방식 (1) email (2) name (3) username (4) password
 
 
 - 처리
  - 매개변수 : User user
  - 패스워드 : BCryptPasswordEncoder로 인코딩해서 다시 setPassword(인코딩패스워드);
  - save() 함수 호출

