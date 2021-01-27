package chap09.section3
/* < TreeSet = SortedSet >
* 내부구조는 TreeSet이지만 대부분의 이름들은 SortedSet이란 이름으로 작동하는 것을 알고있어야됨
* TreeSet : 이진 탐색트리의 일종인 레드 블랙 트리 알고리즘을 사용하는 컬렉션
*           기존 이진 탐색 트리의 경우 트리가 한쪽으로 치우쳐있으면 최악의 상황이 될 수도 있지만
*           레드 블랙 트리의 경우 치우침 없이 배치하기에 최악의 배치일 때에도 일정 시간이 보장된다
*           그리고 TreeSet의 경우 가변성만 사용할 수 있기에 hashset처럼 mutable 없이도 편집이 가능하다
*           어떻게 그걸 구분하냐면 맨처음에 표에 나왔던것에서 알 수 있듯이
*           List, Set, Map 각각에서 불변형으로 선언할 수 있는 함수는 1종류씩밖에 없었기 때문이다
*           각각 listOf(), setOf(), mapOf()를 통해 불변형을 만들 수 있으며 나머지는 알아서 다 가변형이다
*           mutable이 안붙어있더라도 알 수 있어야됨
* 
* < TreeSet의 단점 >
* 1. HashSet보다 성능이 조금 떨어짐
* 2. 데이터 추가, 삭제에 시간이 더 걸린다
* 
* < TreeSet의 장점 >
* 1. 검색과 정렬이 뛰어나다
* 2. 여기에 있는 TreeSet의 경우 레드블랙트리 알고리즘을 사용하기에 치우침이 없어
*    최악의 배치일 때에도 일정 시간은 보장된다
* 
* < sortedSetOf 함수 >
* sortedSetOf함수는 반환 자료형이 TreeSet형이다
* 이 함수를 사용하기 위해선 import java.util.*이 필요하다고 돼있긴 한데
* 전부 다 import하는건 안좋댔음 그러므로
* import java.util.TreeSet만 한다
*
* */
import java.util.TreeSet

fun main() {
    //자바의 java.util.TreeSet선언
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 7, 2)
    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println("intsSortedSet - ${intsSortedSet}")
    
    intsSortedSet.clear() //모든 요소 삭제
    println("intsSortedSet = ${intsSortedSet}")
}