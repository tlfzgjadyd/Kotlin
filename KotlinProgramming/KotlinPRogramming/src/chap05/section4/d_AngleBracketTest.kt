package chap05.section4

/*코틀린은 자바처럼 클래스는 여러개 상속 불가, 인터페이스는 여러개 상속 가능
  근데 이때 만약 인터페이스간 이름 중복이 발생할 경우
  앵글 브래킷<>을 사용해서 원하는 영역을 지정해준다
  
  이번 실험에선 클래스A와 인터페이스B를 상속받고
          super<A>.f()
          super<B>.f()
  파생클래스에서 이 2가지 방법을 통해 각각에 접근할거임 
 */

open class A{
    open fun f()=println("A Class f()")
    fun a() = println("A Class a()")
}

interface B{
    fun f()=println("B Interface f()") //인터페이스는 따로 open 안써줘도 open임
    fun b()=println("B Interface b()")
}

class C : A(), B{
    override fun f() = println("C Class f()")

    fun test(){
        f() //파생클래스에 f 있으니까 실행
        b() //반면 b는 파생클래스에 바로는 없고 인터페이스B에만 있으니까 알아서 찾아서 실행
        super<A>.f() //클래스 A에 있는 f를 실행
        super<B>.f() //클래스 B에 있는 f를 실행
    }
}

fun main() {
    val c = C()
    c.test()
}