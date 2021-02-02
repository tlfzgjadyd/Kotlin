package chap08.section1

/*< where을 사용해서 인터페이스 상속 제한하기 >
* 아래의 예제에서는 특정 클래스에 각 인터페이스를 상속시켜서
* 제네릭으로 생성했을때 where조건에 맞도록 만들어둔 클래스 타입만 제대로 작동하도록 만들었다
* 내가 이걸 실제로 쓸 일이 있을지는 의문임
* when과는 다르다 when은 switch 대신하는거였지
* */
interface InterfaceA
interface InterfaceB

class HandlerA: InterfaceA, InterfaceB
class HandlerB: InterfaceA

class ClassA<T> where T:InterfaceA, T: InterfaceB //2개의 인터페이스를 구현하는 클래스로 제한

fun main() {
    val obj1 = ClassA<HandlerA>() //객체 생성 가능
    //val obj2 = ClassA<HandlerB>() //범위에 없으므로 오류 발생!
}