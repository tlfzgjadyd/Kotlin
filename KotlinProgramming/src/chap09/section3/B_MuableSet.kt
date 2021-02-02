package chap09.section3
/* < 가변형 mutableSetOf() 함수 >
* 아래의 예제에서는 mutableSetOf 함수를 통해 가변형 Set을 만든 후 
* add, remove 등의 함수를 통해 이를 편집하고 있다
*/
fun main() {
    //불변형 Set 정의하기
    val animals = mutableSetOf("Tiger", "Dog", "Cat", "Python", "Hippo")
    println(animals)

    //요소의 추가
    animals.add("Dog") //요소 중 "Dog"가 이미 존재하므로 add해도 추가되지 않는다
    println(animals)

    //요소의 삭제
    animals.remove("Python")
    println(animals)
}