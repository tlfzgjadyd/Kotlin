package chap09.section1
/* < 컬렉션의 구조와 기본 >
* 컬렉션 : 자주 사용하는 자료구조를 모아놓은 일종의 프레임워크
* 여기서는 어떻게 컬렉션을 잘 이용할지 배울것이다
* 
* < 컬렉션의 종류 >
* 1. List
* 2. Set
* 3. Map
* => 이것들은 각각 여러 갈래로 다시 나뉘는데 이때 불변형과 가변형으로 크게 나뉠 수 있다
* 
* < 컬렉션 세부 종류 >
*           불변형(읽기 전용)                  가변형
* 1. List   listOf              mutableListOf, arrayListOf
* 2. Set    setOf               mutableSetOf, hashSetOf, linkedSetOf, sortedSetOf
* 3. Map    mapOf               mutableMapOf, hashMapOf, linkedMapOf, sortedMapOf
* => 이때 작명 규칙은 세부기능 + 컬렉션종류 + Of 이런식으로 간다
*    그리고 변수 선언시에 불변형인 val을 먼저 쓸것을 권장하듯이 컬렉션 역시 불변형을 우선적으로 사용할것이 권장된다
*    이 표가 매우 중요함 나중에 이게 자동으로 가변형인지 뭔지 헷갈릴때 이 표를 생각해내야됨
*    그리고 어떤것들은 mutable이 붙어야만 가변형이지만 hashSet이나 sortedSetOf로 만들어지는 treeSet등의 경우
*    별도로 mutable이 붙어있지 않아도 자동으로 가변형이어야함에 주의한다
*
* < 컬렉션 인터페이스 >
*                                        Iterable
*                                       |           \
*   Map                        Collection           MutableIterable
*    |                        |   |       \          |
* MutableMap                Set List      MutableCollection
*                             \           |  \   |
*                               MutableSet  MutableList
*              (Set과 mutablecollection)       (List와 mutableCollection)
* 
* < Iterator >
* 1. hasNext() : 읽을 요소 있는지 확인
* 2. next() : 다음 요소 반환
* => 여기서 형식 매개변수는 공변성을 제공하도록 out으로 선언되어있음
*    컬렉션 인터페이스중에서 Iterator가 최상위인게 신기했음
*    Map은 Iterator밑에 없긴 하지만 어쨌든 최하위일줄 알았는데 말이지
* 
* < Collection과 Set List의 특징 >
* Collection 인터페이스는 불변형이기에 
* Collection에서 확장된 Set과 List 역시 불변형이다
* 
* < Collection 인터페이스 멤버 살펴보기 >
* 1. size : 컬렉션 크기
* 2. isEmpty() : 컬렉션이 비어있을 경우 true를 반환
* 3. contains(element: E) : 특정 요소가 포함돼있으면 true를 반환
* 4. containsAll(elements: Collection<E>) : 인자로 넘긴 특정 컬렉션이 포함돼있을 경우 true를 반환
* 
* < MutbleIterable과 MutableCollection >
* Mutable 붙어있는 것들은 가변형 지원하기 위해 있는것이라 요소 추가, 제거 등이 가능한 메소드를 구현할 수 있다
* 
* < MutableCollection 인터페이스 멤버 살펴보기 >
* 1. add(element: E) : 인자로 받은 요소 추가 후에 true 반환
*                      만약 이미 있는 요소거나 중복이 허용되지 않을 경우 false를 반환
*
* 2. remove(element: E) : 인자로 받은 요소 삭제 후에 true 반환
*                         만약 삭제하려는 요소가 없을 경우 false를 반환
*
* 3. addAll(elements: Collection<E>) : 전달인자로 컬렉션을 받아서 그 안에 있는 모든 요소 추가 후 true 반환
*                                      만약 실패할 경우 false를 반환
*
* 4. removeAll(Elements: Collection<E>) : 전달인자로 컬렉션을 받아서 그 안에 있는 모든 요소 삭제 후 true 반환
*                                         만약 실패할 경우 false 반환
*
* 5. retainAll(elements: Collection<E>) : 전달인자로 받은 컬렉션의 요소만 보유한 후 성공하면 true 실패하면 false 반환
*
* 6. clear() : 컬렉션의 모든 요소를 삭제
*/