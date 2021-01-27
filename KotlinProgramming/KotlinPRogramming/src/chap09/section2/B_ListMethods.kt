package chap09.section1
/* < 리스트의 메소드들 >
* 1. get(index: int) : 특정 인덱스를 인자로 받아 그 인덱스에 해당하는 요소를 반환하다
* 2. indexOf(element: E) : 인자로 받은 요소가 가장 먼저 등장한 위치를 반환하고 없으면 -1로 반환한다
* 3. lastIndexOf(element: E) : 인자로 받은 요소가 가장 나중에 등장한 위치를 반환하고 없으면 -1로 반환한다
* 4. listIterator() : 목록에 있는 iterator를 반환한다
* 5. subList(start: Int, end: Int) : start ~ end 인덱스에 해당하는 요소를 반환한다
*/

fun main() {
    var names: List<String> = listOf("one", "two", "three")
    
    println(names.size) //List크기
    println(names.get(0)) //해당 인덱스의 요소 가져오기
    println(names.indexOf("three")) //해당 요소의 인덱스 가져오기
    println(names.contains("two")) //포함 여부 확인 후 포함되어 있으면 true 반환
}