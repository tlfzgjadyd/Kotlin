package chap06.section3;

/*이번에는 자바에서 만든 public stativ 정적 변수들을 코틀린 파일에서 가져다 써볼거임
* 아래는 자바로 만든 static 필드와 static 메소드이다
* 이렇게 해보는 이유는 실제 프로젝트에선 자바와 코틀린이 연동되는 경우가 있을 수 있기 때문
* 그러므로 이따가는 반대로 가져다쓰는 방법도 알아볼거임*/

public class B_Customer {
    public static final String LEVEL = "BASIC"; //static 필드
    public static void login() {//static 메소드
        System.out.println("Login...");
    }
}
