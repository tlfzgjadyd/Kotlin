package chap09.section1
/* < 불변형을 가변형으로 만들기 >
* 1. 우선 기존에 존재하는 불변형 list를 만든다
* 2. 그 불변형 list에 toMutableList()함수를 사용해서 다른 변수로 받아준다
*    list명.toMutableList()
* 3. 그럼 이제부터 편집이 가능해져서 add등을 쓸 수 있게 된다!
* 
* < List와 배열의 차이 >
* List는 앞에있던 Array<T>와 사용방법이 비슷하지만
* Array클래스를 통해서는 고정된 크기의 메모리를 만드는 반면
* List<T>의 경우 Array<T>처럼 메모리 크기가 달라질 수 있다ㄴ

*/
fun main() {
    val names: List<String> = listOf("one", "two", "three") //불변형 List 만들기
    val mutableNames = names.toMutableList() //기존 list에 toMutableList를 사용하면 새로운 가변형 List가 만들어짐
    mutableNames.add("four") //가변형 List에 하나의 요소 추가
    println(mutableNames)
}