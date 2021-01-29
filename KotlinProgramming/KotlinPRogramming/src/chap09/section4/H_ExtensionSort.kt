package chap09.section4

/* < 컬렉션 확장함수 : 5. 변환(Transformer) 기능의 메소드 : 뒤집기, 정렬, 자르기 등 변환 기능 >
* < 순서와 정렬 >
* 1. reversed : 요소 순서를 거꾸로 해서 반환
*
* 2. sorted : (숫자일 경우) 작은 수에서 큰 수로 반환
*             (문자열일 경우) 알파벳 순으로 정렬한 후 정렬된 컬렉션을 반환
*
* 3. sortedDescending : 모든걸 sorted의 역순으로 정렬해서 반환
*                       (숫자일 경우) 큰 수에서 작은수로 정렬해서 반환
*                       (문자열일 경우) z부터 a순으로 정렬해서 반환
*
* 4. sortedBy : 특정 비교식을 사용해서 정렬된 컬렉션을 반환
*
* 5. sortedByDescending : 모든걸 sortedBy의 역순으로 정렬해서 반환
*                         (숫자일 경우) 큰 수에서 작은수로 정렬해서 반환
*                         (문자열일 경우) z부터 a순으로 정렬해서 반환
* */

fun main() {
    //1. reversed
    val unsortedList = listOf(3, 2, 7, 5)
    println(unsortedList.reversed())

    //2. sorted
    println(unsortedList.sorted())

    //3. sortedDescending
    println(unsortedList.sortedDescending())

    //4. sortedBy
    println(unsortedList.sortedBy { it % 3 })

    //5. sortedByDescending
    println(unsortedList.sortedByDescending { it%3 })


}