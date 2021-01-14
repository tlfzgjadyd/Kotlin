package chap05.section5

fun main() {
    val otheric = InternalClass()//같은 모듈 내 다른 파일 안에 있는 클래스인 InternalClass에 접근했다

    println(otheric.i)
    otheric.icFunc()
}
/*UML표기
  아직 package의 ~를 대신할 internal만의 기호가 없어서 일단 그대로 사용해서 설명했고 각각은 이랬다
  private : -
  public : +
  protected : #
  internal : ~
  결국 자바랑 똑같음
 */