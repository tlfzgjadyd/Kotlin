package chap03.section3.b_funcfunc
//고차함수 : 일반 함수를 리턴값으로 사용하기

fun sum(a: Int, b : Int) =a+b

fun funcFunc():Int{
    return sum(2,2)
    //이때 실제로 return하는것은 함수의 형태이지만 sum(2,2)로 인해 결국은 그것도 계산된 값이 될것이기에
    //함수의 리턴 자료형에는 함수타입이 아닌 Int를 쓰게된다는 특징이 있다
}

fun main() {
    println("funcFunc: ${funcFunc( )}")
}