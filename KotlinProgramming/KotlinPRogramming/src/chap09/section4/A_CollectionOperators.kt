package chap09.section4

/*3>
* < 컬렉션 확장함수의 종류 >
* 컬렉션을 다루는 확장함수들은 기능에 따라 종류를 나눌 수 있음
* 1. 연산자(Operator) 기능의 메소드 : +-등의 기능이라 요소 추가 삭제등이 가능하다
* 2. 집계(Aggregator) 기능의 메소드 : 최대, 최소, 집합, 총합 등의 계산 기능
* 3. 검사(Check) 기능의 메소드 : 요소 검사 및 순환 기능
* 4. 필터(Filtering) 기능의 메소드 : 원하는 요소를 골라내는 기능
* 5. 변환(Transformer) 기능의 메소드 : 뒤집기, 정렬, 자르기 등 변환 기능
* 
* 이중에서 먼저 연산자(Operator) 기능 메소드들을 알아보겠다
* 생각보다 단순하게 모든 연산들이 가능하므로 잘 알아둬야됨 
* 메소드 쓰는것까지 가지도 않고 거의 + -로 요소 추가삭제 한다는 점에 주목한다
* 다양한 방법들 봐서 익숙해지기만 하면 됨
*
* < Map의 저장 방식 >
*  val map1 = mapOf("hi" to 1, "hello" to 2, "Goodbye" to 3)
* 이런식으로 키와 값을 to로 연결한다
* 어떤게 키고 어떤게 값인지 몰랐는데
* keys로 찍어보니까 "hi", "hello", "Goodbye"쪽이 키
* 1, 2, 3쪽이 값이다
* 즉 val 변수명 = mapOf(키1 to 값1, 키2 to 값2, 키3 to 값3)
* 이런식으로 되는것
* 
* */

fun main() {
    val list1: List<String> = listOf("one", "two", "three")
    val list2: List<Int> = listOf(1, 3, 4)
    val map1 = mapOf("hi" to 1, "hello" to 2, "Goodbye" to 3) //이때 저장되는 방식이 map은 좀 다름
                                                              //to를 통해 키와 값을 연결한다
    
    println(list1 + "four") //+ 연산자를 사용한 문자열 요소 추가, 이렇게만 해도
    println(list2 + 1) //+연산자를 사용한 정수형 요소 추가
    println(list2 + listOf(5, 6, 7)) //두 LIst의 병합
    println(list2 - 1) //요소의 제거
    println(list2 - listOf(3, 4, 5)) //일치하는 요소의 제거
    println(map1 + Pair("Bye", 4)) //Pair()를 사용한 Map의 요소 추가
    println(map1 - "hello") //일치하는 값의 제거
    println(map1 + mapOf("Apple" to 4, "Orange" to 5)) //두 Map의 병합
    println(map1 - listOf("hi", "hello")) //List에 일치하는 값을 Map에서 제거

    //어느쪽이 키고 어느쪽이 값인지 알아보려고 찍어봤음
    println(map1.keys) //[hi, hello, Goodbye]
    println(map1.values)//[1, 2, 3]
}