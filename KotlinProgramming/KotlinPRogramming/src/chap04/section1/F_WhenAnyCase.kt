package chap04.section1

/* 최상위 클래스인 Any를 이용하면 다양한 자료형의 형태를 모두 받을 수 있다
 */
fun main() {
    cases("Hello") //String형
    cases(1) //Int형
    cases(System.currentTimeMillis()) //현재 시간(밀리 초 단위)을 Long형으로 반환
    cases(MyClass())//객체
}

fun cases(obj:Any){
    when(obj){
        1->println("Int:$obj")
        "HEllo"->println("String: $obj")
        is Long ->println("Long: $obj")
        !is String ->println("Not a String")
        else ->println("UnKnown")
    }
}

class MyClass {
}