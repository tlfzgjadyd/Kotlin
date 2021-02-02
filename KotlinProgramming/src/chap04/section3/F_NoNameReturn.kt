package chap04.section3

fun main() {
    //1. 1번 방식은 라벨방식을 사용했기에 if식이 맞았을 경우와 아닐 경우의 return이 구분되지 않음
    val getMessage = lambda@{num: Int->
        if(num!in 1..100){
            return@lambda "Error" //라벨을 통한 반환
        }
        "Success" //else가 생략되어있지만 실제론 if식이 틀렸을 경우 마지막 식이 반환
    }

    //2. 2번 방식은 익명함수 사용헀기에 if문이 맞았을 경우와 아닐 경우의 return을 확실하게 구분할 수 있음
    val getMessage2 = fun(num:Int):String{
        if(num!in 1..100){
            return "Error"
        }
        return "Success"
    }

    val result = getMessage(99)
}