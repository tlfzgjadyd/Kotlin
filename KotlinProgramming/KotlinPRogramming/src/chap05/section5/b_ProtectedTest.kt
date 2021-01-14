package chap05.section5

/*이번 예제에서는 Derived 클래스가 Base 기반클래스를 상속받았기에
* Base 클래스 내에 있는 protected 타입들에 접근 가능한 모습들을 보이고 있다
* 다만 상속받은 파생클래스 내에선 접근이 가능하지만 객체 생성 이후 .을 통해 접근하는것이 불가능하다는 특징이 있다
* 매  우  중  요  함      헷  갈  림*/

open class Base{
    protected var i = 1
    protected fun protectedFunc(){
        i+=1 //접근 허용
    }
    fun access(){
        protectedFunc()//접근 허용
    }
    protected class Nested //내부 클래스에는 지시자 허용
}

class Derived : Base(){ 
    fun test(base: Base): Int {
        protectedFunc() //Base클래스의 메소드 접근 가능
        return i //Base 클래스의 프로퍼티 접근 가능
    }
}

fun main() {
    val base = Base() //생성 가능
    //base.i //접근 불가, 왜냐면 protected라도 .접근방식은 허용하지 않기때문
    // base.protectedFunc() //접근불가, 이유는 같음
    base.access()//접근 가능
}