package chap09.section5

/*< 시퀀스를 이용한 피보나치 수열 >
* 아래의 예제에선 시퀀스를 이용해 전통적인 수식을 처리해볼거다
* 우선 피보나치 수열을 만들어볼거임, 앞의 2개수 더하면 다음 수가 된다
* 보통 재귀를 통해 피보나치 만드는데 재귀 잘못쓰면 에러나는등 문제가 있음
* 이 문제를 해결하기 위해 꼬리 재귀를 이용할수도 있지만 이번에는 시퀀스를 통해 해결해볼거다
*
* < 구체적인 해결방식 >
* 이때 시드로 주는 수가 조금 다른데 1 to 1 이런식으로 시드를 줘서
* 키와 값 각각의 시작값을 정해줄 수 있었다
* 그리고 이후의 표현식에서도 to를 통해 key와 value 각각의 식을 따로 지정했다
* */

fun main() {
    val fibonacci = generateSequence(1 to 1) {it.second to it.first + it.second}
        .map{it.first}            //키시작=1  //값시작=1
    println(fibonacci.take(10).toList())
}