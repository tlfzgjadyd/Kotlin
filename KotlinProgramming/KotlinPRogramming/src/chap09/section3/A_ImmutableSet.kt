package chap09.section3
/* < Set과 List와 Map의 차이점 >
* List : 정해진 순서가 있음,  중복되는 요소 있어도됨 순서로 구분되기 때문
* Set : 정해진 순서가 없는 요소들의 집합, 별도의 순서로 구분할 수 없기 때문에 중복되는 요소 없어야됨
* Map : 키와 값의 쌍으로 저장되기에 키는 중복될 수 없고 유일하지만 값은 중복될 수 있다
*
* < Set 생성하기 >
* list때처럼 헬퍼함수 setOf()를 통해서 불변형 Set 생성 가능하고
* mutableSetOf()로는 가변형 Set 생성 가능하다
* 이렇게 생성하면 Set<T>형이 반환된다
* 별도로 T 지정 안하면 자료형 혼합 가능한것도 똑같음
* 그래서 아래의 예제에서는 여러 자료형을 혼합하여 Set을 생성한다
* */
fun main() {
    val mixedTypesSet = setOf("Hello", 5, "world", 3.14, 'c') //자료형 혼합 초기화
    var intSet: Set<Int> = setOf<Int>(1, 5, 5) //정수형만 초기화

    println(mixedTypesSet)
    println(intSet)
}