package chap08.section2

/* 1:30~2:00
* < when >
* when은 거의 switch case 대용품 느낌으로 쓰였는데
* 여기서는 배열 안에 특정 요소가 있는지 확인할때 쓸거다 이렇게 많이 쓰나봄
* 기존 switch case와 다른점은 걔네는 거의 덩어리 결과를 비교하는 느낌이었다면
* 코틀린에서 when은 좀더 조건일경우->동작 이런느낌의 문장형 느낌이 강하다
* 어쨌든 확인해볼거임
*
* < minBy와 maxBy >
* 배열 내에 특정 프로퍼티를 기준으로 최소인 객체와 최대인 객체를 뽑아낼수도 있음
* 사용방식은 println(배열변수명.minBy{it.기준}) 이런식이다
* ex) println( products.minBy{it.price})
* 
* */

fun main() {
    //1. when 내부 조건식에 in을 사용해서 배열내에 apple이 있는지 확인하기
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")
    when {
        "apple" in fruits->println("Apple!")
    }

    //2. 지정된 필드의 가장 작은 값과 큰 값 골라내기
    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Keyboard", 125.99),
        Product("Monitor", 1500.99),
    )
    println(products.minBy {it.price}) //여기서 왜 minBy와 maxBy에 줄그어진건진 모르겠지만 실행하니까 작동은 제대로 되더라
    println(products.maxBy {it.price})
}