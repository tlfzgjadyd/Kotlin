package chap09.section3
/* < HashSet 특징>
* Set의 일종인 HashSet에 대해 알아본다
* 1. 입력 순서에 상관 없이 추가하게됨
* 2. 중복되는 요소가 이미 존재할 경우 추가되지 않는다
* 3. Set은 따로 순서가 존재하지 않기에 정렬기능 자체가 없음
*    대신 해시값을 통해 요소를 찾아내기에 검색속도는 O(1)밖에 안된다
*    상수시간이므로 검색시간이 매우 짧다는 것이 특징임
*
* < hashSetOf() 함수 > 
* 헬퍼함수 hashSetOf()를 사용해서 HashSet 컬렉션을 만들어볼거다
* hashSetOf()함수를 사용할 경우 HashSet형을 반환하게되며
* 이때 HashSet은 불변성 선언이 없기 때문에 별도의 mutable 키워드가 없더라도 편집이 가능하다는 특징이 있다
*
* < 해시테이블 >
* 해시테이블 : 키, 인덱스를 통해 검색과 변경을 매우 빠르게 처리할 수 있는 자료구조
* 

* 
* */
fun main() {
    val intsHashSet: HashSet<Int> = hashSetOf(6, 3, 4, 7) //불변성 기능이 없음
    intsHashSet.add(5) //추가
    intsHashSet.remove(6) //삭제
    println(intsHashSet)
}