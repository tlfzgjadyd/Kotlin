package chap09.section1
/* < 가변형 arrayListOf() 함수 >
* 가변형 헬퍼함수를 통해 생성할 경우 요소 편집이 가능하다
* arrayListOf()를 사용하면 되는데 반환되는 자료형은 ArrayList<T>형이니까 받아주는 변수도 그런 형태여야겠지
* list형태로 반환되지 않음에 주의해야됨
 */
import java.util.*

fun main() {
    //가변형 List를 생성하고 자바의 ArrayList로 반환
    val stringList: ArrayList<String> = arrayListOf<String> ("Hello", "Kotlin", "Wow")
    stringList.add("Java") //추가
    stringList.remove("Hello") //삭제
    println(stringList)
}