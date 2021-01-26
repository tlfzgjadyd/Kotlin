package chap08.section1

/*이번에는 where을 사용해서 함수 자료형을 제한할거다*/

fun main() {
    fun <T> myMax(a: T, b: T): T where T:Number, T:Comparable<T>{ //만약 둘다 Comparable이면 에러남
        return if (a>b) a else b
    }
    myMax(1, 2)//첫번째 인자와 비교 가능한건 같은 숫자여야해서 이게 에러 안나나봄
    // myMax(1,"a")//숫자와 문자는 비교 못해서 에러나는듯
}