package chap08.section2

/*다른 언어에서의 배열과 달리 코틀린에서의 배열은 자료형 명시하지 않을 경우 여러 타입을 담을 수 있음
* 다음과 같은 2가지 방식으로 자료형 제한이 가능하다 (제한 안하면 또 에러날 가능성 높아지잖아)
* 1. arrayOf<Int>
* 2. intArrayOf(1, 2, 3, 4)
* 내부적으로 전부 int[]형 배열로 변환되게 된다 (역컴파일시 자바코드로 바뀔때를 말하는듯)
* 만약 부호없는 타입으로 하려면 이런 방식들로 가능하다
* ubyteArrayOf()
* ushortArrayOf()
* uintArrayOf()
* ulongArray()
* */

fun main() {
    val mixArr = arrayOf(1, 2, 3, 4, "chike", false) //정수, 문자열, boolean등 여러가지를 혼합했음
    val intOnly = arrayOf<Int> (1, 2, 3, 4) //제한방식1
    val intOnly2 = intArrayOf (1, 2, 3, 4) //제한방식2
}