package chap06.section1

/*오버라이딩시 상위클래스에 있던 val은 변경 가능한 var로 바꿀 수 있지만
* 이미 상위클래스에서 var인건 val로 못바꾼다*/

open class First{
    open val x: Int = 0 //1. 오버라이딩 가능
        get() {
            println("First x")
            return field
        }
    val y: Int = 0 //2. open 키워드가 없으면 final 프로퍼티
}

class Second: First() {
    override val x: Int = 0 //3. 상위 클래스와 구현부가 다르게 오버라이딩됨
        get(){
            println("Second x")
            return field + 3
        }
    //override val y: Int = 0 //4. 오류! 오버라이딩 불가
}

fun main() {
    val second = Second()
    println(second.x) //5. 오버라이딩된 두 번째 클래스 객체의 x
    println(second.y) //상위 클래스로부터 상속받은 값
}