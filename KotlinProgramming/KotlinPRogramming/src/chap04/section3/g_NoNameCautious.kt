package chap04.section3

/**/

fun main() {
    fun greet()={ println("Hello")}
    greet()     //이러면 단순히 할당연산자에 의해 람다식이 greet함수에 할당됐을 뿐이다
    greet()()   //따라서 할당된 람다식을 식제로 사용하기 위해서는 이렇게 써야한다
    
    fun greet2()=fun(){println("Hello")} //함수가 할당됨을 명시적으로 표현하려면 익명함수 써서 선언하는게 읽기 더 좋음
    
}