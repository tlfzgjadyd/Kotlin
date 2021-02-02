package chap10.section1

/* << 코틀린 표준함수 >>
* 코틀린 표준 라이브러리의 다양한 함수들을 살펴보겠다
* 표준함수는 람다식과 고차함수를 사용해서 선언되어 있기에 이 둘에 대해 먼저 알아볼거임
*
* < 람다식 >
* 1. 중괄호 내에 ->화살표를 놓고 그 화살표를 기준으로 양옆에 매개변수와 본문을 배치한다
*   {  매개변수  ->  람다식 본문 }
* 
* 2. 만약 매개변수가 1개라면 it으로 퉁쳐서 이렇게 가능하다
*   { it + 1 }
* 
* 3. 만약 추론된 반환 자료형이 Unit이 아니라면 무조건 본문의 마지막 표현식이 반환값으로 처리된다
*
* (4. 이건 잘 안쓸거같지만 특정 라벨을 지정해서 반환할수도 있음 예제에 자세히 나와있다)
* */

fun main() {
    val isPositive: (Int) -> Boolean = {
        val isPositive = it > 0
        isPositive //마지막 표현식이 반환됨
    }
    val isPositiveLabel: (Int) ->Boolean = number@ {
        val isPositive = it > 0
        return@number isPositive //라벨을 사용해 반환됨
    }
}