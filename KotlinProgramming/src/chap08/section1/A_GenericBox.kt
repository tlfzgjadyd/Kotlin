package chap08.section1

/*< 제네릭 사용시의 이점 >
* 제네릭 사용시 컴파일타임에 자료형 체크하기 때문에 자료형의 안정성을 높이고 형변환의 번거로움이 줄어든다
* 의도치 않은 자료형의 객체를 지정하는걸 막고 형변환시 발생할 수 있는 오류를 줄여줌
*
* 
* < 제네릭 사용처 >
* 다양한 자료형을 다뤄야 하는 컬렉션에 많이 사용됨
* List, Seㅅ, Map등
*
* < 제네릭에서 사용하는 형식 매개변수 이름 >
* E 요소
* K 키
* N 숫자
* T 형식
* V 값
* S, U, V 두번째, 세번째, 네번째 형식
* */

class Box<T>(t: T){ //형식 매개변수로 받은 인자를 name에 저장
    var name = t
}

fun main(){
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")
    println(box1.name)
    println(box2.name)
}