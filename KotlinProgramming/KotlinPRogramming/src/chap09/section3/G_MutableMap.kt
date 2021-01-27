package chap09.section3

/*1>
* < mutableMapOf >
* mutableMapOf() 함수를 통해 가변형 Map을 만들 수 있다
* 이 함수는 MutableMap(K, V) 인터페이스 자료형을 반환한다
* 
* < mutableMap 멤버 살펴보기 >
* 1. put(key: K, value: V) : 키와 값의 쌍을 Map에 추가, 기존 요소 수정은 put으론 불가능한듯
* 2. remove(key: K) : 전달인자로 받은 키에 대응되는 요소를 map에서 제거
* 3. putAll(from: Map<out K, V>) : 전달인자로 받은 Map데이터를 갱신하거나 추가
* 4. clear() : 모든 요소를 지운다
* */

fun main() {
    //가변형 Map의 선언 및 초기화
    val capitalCityMap: MutableMap<String, String> //선언할 때 키와 값의 자료형을 명시할 수 있음
            = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.values) //값만 출력
    println(capitalCityMap.keys) //키만 출력

    capitalCityMap.put("UK", "London") //요소의 추가
    capitalCityMap.remove("China") //요소의 삭제
    println(capitalCityMap)
}