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

< open abstract 헷갈리던거 총정리 >
1. abstract는 추상클래스, 추상함수 앞에 쓰임
2. open은 추상 아닐 경우 상속 허용되는 일반클래스를 만들기 위해 쓰임
3. open이 없으면 final 클래스가 되어 상속 불가능
4. abstract 키워드를 쓸 경우 내부의 것들은 알아서 open 붙어서 상속 및 오버라이딩이 가능해짐
5. 추상클래스는 변수도 가질 수 있지만 인터페이스는 추상함수만 가질 수 있음

이후 해결사함
1. 위임이 쓰이는곳 정확하게 알아내기
2. 지연초기화가 필요한 상황 만들어보기
3. companion object 필요한 상황 만들어보기
 */

abstract class Cup{
    abstract fun putInCup(content : Cupable, amount : Int)
}