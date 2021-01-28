package chap09.section4

/* 4>
* < 요소의 처리와 집계 >
* 요소를 집계하는 확징 함수로는 다음의 것들이 있다
* --------------------
* [ 1. 요소의 순환 ]
* 1. forEach
* 2. forEachIndexed
* 3. onEach
* --------------------
* [ 2. 요소의 개수 반환 ]
* 4. count
* --------------------
* [ 3. 최댓값과 최솟값 반환 ]
* 5. max, min
* 6. maxBy, minBy
* --------------------
* [ 4. 각 요소에 정해진 식 적용하기 ]
* 7. fold, foldRight
* 8. reduce, reduceRight
* --------------------
* [ 5. 모든 요소 합산하기 ]
* 9. sumBy
* */

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // [ 1. 요소의 순환 ]
    // 1) forEach
    println("--------------------------------------------")
    println("[ 1. 요소의 순환 ]")
    println("1) forEach")
    list.forEach{ print("$it ")}//각 요소를 람다식 내부의 표현식으로 처리

    // 2) forEachIndexed
    println("\n\n2) forEachIndexed")
    list.forEachIndexed {index, value -> println("index[$index]: $value")} //forEach와 기능이 같은데 index도 사용 가능함

    // 3) onEach
    println("\n3) onEach")
    val returnedList = list.onEach{print(it)} //각 요소를 람다식 내부의 표현식으로 처리 후 컬렉션으로 반환
                                              //forEach와 같은 기능을 한 후 컬렉션으로 반환한다는 차이점이 있다
    val returnedMap = map.onEach{println("key: ${it.key}, value: ${it.value}")}
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")

    // [ 2. 요소의 개수 반환 ]
    println("\n--------------------------------------------")
    println("[ 2. 요소의 개수 반환 ]")
    print("1) count : ")
    println(list.count {it%2==0}) //조건에 맞는 요소 개수 반환
                                  // 표현식에 true로 걸러지는 2, 4, 6이므로 개수인 3이 리턴된다

    // [ 3. 최댓값과 최솟값 반환 ]
    println("\n--------------------------------------------")
    println("[ 3. 최댓값과 최솟값 반환 ]")
    // 1) max
    print("1) max : "+list.max()) //최대값 요소 반환, deprecated라 줄그어지는듯
    
    // 2) min
    print("\n2) min : "+list.min())//최솟값 요소 반환

    // 3) maxBy
    print("\n3) maxBy : "+ map.maxBy{it.key}) //키 파라미터를 기준으로 최댓값

    // 4) minBy
    print("\n4) minBy : "+map.minBy{it.key}) //키 파라미터를 기준으로 최솟값

    // [ 4. 각 요소에 정해진 식 적용하기 ]
    println("\n--------------------------------------------")
    println("[ 4. 각 요소에 정해진 식 적용하기 ]")
    // 1) fold
    println("1) fold") //fold() : 전달인자로 받은 초기값에서 시작해서 마지막 요소까지를 이용해서 람다식 내의 표현식을 연산
    println(list.fold(4) {total, next->total+next}) //4+1+...+6=25
    println(list.fold(1){total, next->total*next}) //1*1*2*...*6=720

    // 2) foldRight
    println("\n2) foldRight") //foldRight() : fold와 같은데 다른점은 마지막 요소부터 시작해서
                                //전달인자로 받은 초기값을 향해 역순으로 람다식 표현식을 연산한다는 점이다
    println(list.foldRight(4) {total, next->total+next}) //6+...+1+4=25 역방향으로 해도 결국 결과는 같았다
    println(list.foldRight(1){total, next->total*next}) //6*...*2*1*1=720

    // 3) reduce
    println("\n3) reduce") //reduce() : fold와 같지만 초기값을 사용하지 않고 처음부터 연산한다, 그렇기에 전달인자 자체를 받질 않음
    println(list.reduce {total, next ->total + next }) //처음부터 연산하기에 1+2+3+4+5+6 = 21
    println(list.reduceRight {total, next->total + next}) //끝에서부터 처음까지 거꾸로 연산하기에 6+5+4+3+2+1+ = 21

    // [ 5. 모든 요소 합산하기 ]
    println("\n--------------------------------------------")
    println("[ 5. 모든 요소 합산하기 ]")
    println("1) sumBy") //sumBy() : 식에 의해 도출된 모든 요소를 합산
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    println(listPair.sumBy {it.second}) //각 Pair쌍의 두번째 요소들인 300, 200, 100등을 다 더하기에 600이 나온다
    println("--------------------------------------------")

}