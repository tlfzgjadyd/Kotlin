package chap09.section4

/* < 컬렉션 확장함수 : 5. 변환(Transformer) 기능의 메소드 : 뒤집기, 정렬, 자르기 등 변환 기능 >
* < 컬렉션의 분리와 병합 >
* 1. union : 두 List를 합침(중복 요소는 하나만)
*            Set형으로 반환한다
*
* 2. plus : 두 List를 합침(union과 달리 중복 요소 있는대로 다 포함함),
*           List형으로 반환한다,
*           +연산자와 같은 역할을 한다
* -------------------------------------
* 3. partition : 주어진 식의 결과(true / false)에 따라 2개의 컬렉션으로 분리해 Pair로 반환
*                true로 나온건 첫번째 위치, false로 나온건 두번째 위치에 반환한다
*                분리된 2개의 list컬렉션은 Pair로 반환된다
* -------------------------------------
* 4. zip : 동일 인덱스끼리 Pair를 만들어 반환
*          이게 무슨 소리냐면 list.로 부른 원래 컬렉션에도 인덱스 1이 있고 전달인자로 준 listOf(7, 8)에도 인덱스 1이 있음
*          그러므로 이 index 번호가 같은것끼리 묶어서 반환한다는 소리임
*          이때 요소의 개수가 가장 적은 컬렉션에 맞춰서 Pair가 구성되며
*          아래의 예제에선 [(list1의 index0에 해당하는 요소, list2의 index0에 해당하는 요소),
*                        (list1의 index1에 해당하는 요소, list2의 index1에 해당하는 요소)]
* */

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5, 6)
    val list2 = listOf(2, 2, 3, 4, 5, 5, 6, 7)
    
    //1. union
    println(list1.union(list2))
    
    //2. plus
    println(list1.plus(list2))

    //-------------------------------------
    
    //3. partition
    val part = list1.partition{it%2==0}
    println(part)
    
    //4. zip
    val zip = list1.zip(listOf(7, 8))
    println(zip)
}