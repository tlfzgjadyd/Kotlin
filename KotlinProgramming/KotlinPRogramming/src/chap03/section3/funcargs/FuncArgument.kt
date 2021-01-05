package chap03.section3.funcargs
//고차함수 : 일반 함수를 인자로 사용하기

fun sum(a:Int, b:Int)=a+b
fun mul(a:Int, b:Int)=a*b //분명 함수를 전달인자로 받을 수 있는데도 매개변수 자료형이 둘 다 Int다

fun main() {
    val res1 = sum(3, 2)
    val res2 = mul(sum(3,3), 3)
    //이때 비록 mul의 인자로 함수의 형태를 사용하지만 sum(3,3)으로 결국 그것도 계산될 것이기에
    //위에 있는 mul의 정의에는 Int로 정의돼있다는 특징이 있다
    
    println("res1: $res1, res2: $res2")
}
