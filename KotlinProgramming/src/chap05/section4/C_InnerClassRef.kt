package chap05.section4

/*클래스 안에는 이너클래스 만들 수 있음
  이번 예제에서는 Child라는 이름의 파생클래스 내부에 inner 키워드를 사용해서 Inside 클래스를 만들것이다
  그리고 이너클래스에서 바깥에 있는 클래스 참조하는 방법을 알아볼거임
  접근에 대해선 3종류를 배울건데 이너클래스, 감싼클래스, 감싼 클래스가 상속받는 클래스 3개에 접근해볼거임

            f()                       //1. 이너 클래스 Inside의 f()에 접근
            Outside().f()             //2. 바로 바깥 Outside클래스의 f() 접근
            super@Outside.f()         //3. Outside의 상위 클래스인 Base 클래스의 f() 접근

* */
open class Base{
    open val x: Int=1
    open fun f()=println("Base Class f()")
}

class Outside: Base(){
    override val x: Int = super.x+1
    override fun f() = println("Child Class f()")
    
    inner class Inside{
        fun f()=println("Inside Class f()")
        fun test(){
            f()                       //1. 이너 클래스 Inside의 f()에 접근
            Outside().f()             //2. 바로 바깥 Outside클래스의 f() 접근
            super@Outside.f()         //3. Outside의 상위 클래스인 Base 클래스의 f() 접근

            println("[Inside] super@Child.x: ${super@Outside.x}") //4. Base의 x 접근
        }
    }
}

fun main() {
    val c1=Outside()
    c1.Inside().test() //이너 클래스 Inside의 메소드 test() 실행
}