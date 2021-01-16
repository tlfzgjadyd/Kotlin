package chap06.section3
/* < + object 표현식과 익명객체 >
* 위의 예제들에선 object 표현식의 3가지 사용법과 효과를 배웠다
* 이번에는 object 표현식과 익명 객체의 관계를 알아볼건데
* 지금까지 다뤘던 object 표현식은 사용하면 익명 객체가 나온다
* 익명 객체는 지역이나 private 영역에서만 자료형으로 사용할 수 있기 때문에
* 만약 public함수에서 반환값의 자료형으로 쓰거나 public 속성의 자료형으로 쓸 경우
* 실제 자료형은 익명객체의 상위 자료형이 된다
* 만약 따로 상위 자료형을 선언해두지 않았을 경우 Any형이 된다
* 아래의 예제에선 이것을 실험해볼거다
* */
class C{
    //1. private function-> 반환 자료형은 익명 객체 자료형이 됨
    private fun foo() = object {
        val x: String = "x"
    }

    //2. public function->반환 자료형은 Any형이 됨
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar(){
        val x1 = foo().x //문제 없음
       // val x2 = publicFoo().x //오류! Unresolved reference: x
    }
}
