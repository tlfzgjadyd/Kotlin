package chap03.section5

/* 재귀함수는 너무 많이 호출되면 스택 오버플로우가 발생한다
   그래서  재귀함수를 만들때는 다음의 조건들을 지켜야 한다
   1. 무한호출에 빠지지 않도록 탈출 조건 만들어주기
   2. 스택 영역을 이용하므로 호출 횟수를 너무 많이 놓지 않는다
   3. 코드를 복잡하지 않게 한다
   
   코틀린에서는 꼬리 재귀 함수 tail recursive function으로 스택 오버플로우를 해결한다
   tailrec 키워드 사용시 스택에 계속 쌓는 방식 대신 꼬리를 무는 형식으로 반복하게 된다
   
   먼저 일반적인 재귀함수를 만들어서 스택 오버플로우를 경험해보도록 한다
 */
fun main() {
    val number = 4
    val result : Long

    result = factorial(number)
    println("Factorial:$number=>$result")
}

fun factorial(n:Int):Long{
    return if (n==1) n.toLong() else n* factorial(n-1) //재귀로 factorial을 호출하기에 n을 매우 큰 값으로
                                                         //설정할 경우 스택 오버플로우가 발생한다
}