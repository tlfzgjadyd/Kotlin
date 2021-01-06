package chap03.section3

//지금상태론 callByValue(lambda())에서 인자로 넘긴 lambda함수먼저 실행되고 그다음에 겉함수인 callByValue 실행됨
fun callByValue(b:Boolean):Boolean{ //여기서 인자로 lambda를 받을때 Boolean타입으로 받는다는것이 특징
    println("call by value function")
    return b
}

val lambda: ()->Boolean={ //람다함수형태의 자료형 변수인 lambda에 익명함수 대입
    println("lambda function")
    true
}
fun main() {
    val result = callByValue(lambda())
    println(result)
}