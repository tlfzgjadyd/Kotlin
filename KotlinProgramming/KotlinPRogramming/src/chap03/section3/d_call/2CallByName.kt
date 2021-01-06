package chap03.section3
//이렇게하면 인자로 넘긴 람다함수 먼저 실행되는게 아니라 callByName먼저 실행되어 겉함수 실행시에 실행되게 만들 수 있다
fun callByName(b: ()->Boolean) : Boolean { //여기서 lambda를 인자로 받을때 boolean이 아니라 람다형 자료형으로 받는게 특징
    println("callByName function")
    return b()                              //그래서 이부분 b()에서 실행되게 된다
}                                           //실행 시점을 자유롭게 정할 수 있기에 유용함
val otherLambda: ()->Boolean = {
    println("otherLambda function")
    true
}
fun main() {
    val result = callByName(otherLambda)
    println(result)
}