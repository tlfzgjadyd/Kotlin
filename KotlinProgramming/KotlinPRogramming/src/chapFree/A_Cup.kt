package chapFree

/*커피 제조기를 만들 예제를 실험한 후
  예제에는 없지만 옥수수 수염차를 끓여보기로 했다

interface쓰면 알아서 추상붙는건 인터페이스였나봄
추상클래스는 일반함수랑 추상함수 비교해주기 위해 함수도 abstract써야됨 {}이라도 쓰면 abstract못함

왜 계속 companion object없어서 초기화하란지 몰랐는데
알고보니 내가 사용한 객체 생성 방식은 자바꺼였음
new키워드 없이 
val또는var 변수명 = 클래스();
이렇게 하는거였다
 */

abstract class Cup{
    abstract fun putInCup(content : Cupable, amount : Int)
}