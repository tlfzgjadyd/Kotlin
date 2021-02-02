package chap04.section3

/* 5, 4, 3, 2, 1을 순서대로 출력하는 코드를 완성하시오 */

fun main() {
    for(num in 5 downTo 1) println(num)
    /*아 괜히 역방향으로 하는 방법을 알려준게 아니었음 num in 5..1처럼 역순으로 하면 아예 출력이 안됨
      그러므로 순서는 반드시 순방향으로 1..5하고 키워드를 통해 역순으로 가야한단뜻

      <주의사항>
      1. 키워드는 downside인가 downstep인가 헷갈렸는데 downTo였음
      2. 그리고 downTo 키워드를 사용할 경우 downTo 5..1이 아니라 5 downTo 1이며
      3. downTo 등의 키워드를 사용하더라도 여전히 in키워드는 사용된다*/
}