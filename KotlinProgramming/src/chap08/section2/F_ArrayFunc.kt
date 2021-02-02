package chap08.section2

/*< 그 외의 다양한 함수들 >
* 1. arr.first() : 배열의 첫번째 요소 확인
* 2. arr.last()  : 배열의 마지막 요소 확인
*
* 3. arr.indexOf(num) : 요소 3의 인덱스 출력
* 4. arr.count()      : 요소 개수 출력
*
* 5. arr.average()    : 평균 출력
*
* 6. arr.contains(value) : 배열에 value라는 값이 포함돼있는지 확인
* 7. value in arr        : 이런식으로도 배열 내에 value라는 값이 포함돼있는지 확인 가능하다
*
* + 추가지식 : Any 자료형으로 배열 만들 경우 다른 자료형 가능
* ex) val b = Array<Any> (10, {0})
* */

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)

    println(arr.first()) //배열의 첫번째 요소 확인
    println(arr.last()) //배열의 마지막 요소 확인

    println("요소 3의 index: ${arr.indexOf(3)}") //요소 3의 인덱스 출력
    println("요소 개수 : ${arr.count()}")        //요소 개수 출력

    println("평균 : ${arr.average()}")          //평균 출력


    println(arr.contains(4)) //arr배열 값중에 4가 포함돼있는지 확인
    println(4 in arr) //이런식으로도 배열 내에 포함돼있는지 확인 가능하다
}