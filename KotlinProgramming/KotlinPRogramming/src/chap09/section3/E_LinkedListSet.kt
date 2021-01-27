package chap09.section3
/* < Linked Hash Set >
* Linked Hash Set : 링크드 리스트를 사용해 구현된 해시테이블 자료형
*                   이것을 사용하기 위해선 import java.util.LinkedHashSet이 필요하다
*
* < Linked Hash Set 단점 >
* : 앞에 나왔던 HashSet, TreeSet보다 느리다
*
* < Linked Hash Set 장점 >
* : 다음 데이터를 가리키는 포인터 연결이 존재하기에 메모리 저장 공간을 좀 더 효율적으로 사용할 수 있다
*
* < linkedSetOf 함수 >
* linkedSetOf 함수는 사용시 LinkedHashSet형을 반환한다
* */
import java.util.LinkedHashSet
fun main() {
    //Linked list를 이용한 HashSet
    val intsLinkedHashSet: LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 26, 75)
    intsLinkedHashSet.add(4)
    intsLinkedHashSet.remove(21)

    println(intsLinkedHashSet)
    intsLinkedHashSet.clear()
    println(intsLinkedHashSet)
}