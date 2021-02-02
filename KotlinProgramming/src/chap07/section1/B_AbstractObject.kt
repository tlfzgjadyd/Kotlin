package chap07.section1

/*이번 예제에서는 추상클래스를 구현하는 하위클래스 없이 object 표현식을 통해 객체 생성해볼거임
* myPrinter변수에 object 표현식을 통해 익명객체를 할당하고 
* main에선 그 변수를 통해 이를 갖다썼음*/

//추상클래스의 선언
abstract class Printer{
    abstract fun print() //추상 메소드
}

val myPrinter = object: Printer() {//객체 인스턴스
    override fun print(){//추상 메소드의 구현
        println("출력합니다.")
    }
}
fun main() {
    myPrinter.print()
}