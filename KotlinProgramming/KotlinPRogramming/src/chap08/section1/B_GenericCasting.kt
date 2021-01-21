package chap08.section1

/*< 제내릭 클래스 >
* 제내릭 클래스 : 클래스 선언할 때 자료형 안정해놓고 인스턴스 생성 시점에 결정하는것
*               이전 파일에 있던 Box<T>같은게 제네릭 클래스다
*               제네릭 클래스 내부에서 그 자료형 쓰는 모든 것들을 T형으로 쓰여진다
*
* < 자료형 변환 >
* 아래의 예제에서 Child라는 클래스는 Parent 클래스를 상속받았다
* 그래서 부모클래스로 자식클래스를 가리키는 경우 자연스럽게 가리킬 수 있게됨
* 하지만 만약 T로 되어있는거에 클래스<부모>형으로 클래스<자식> 이런식으로 가리키게 되면
* 서로 관련 없는 형식이 되기 때문에 에러가 난다
* */

open class Parent

class Child: Parent()

class Cup<T>

fun main() {
    val obj1: Parent = Child() //부모 타입으론 자식 타입을 가리킬 수 있음
    //val obj2: Child = Parent() //자식 타입으로 부모 가리키는건 당연히 안됨
    
    //val obj3: Cup<Parent> = Cup<Child>() //이러면 서로 관련 없는 자료형이라 안됨
    //val obj3: Cup<Child> = Cup<Parent>() //당연히 안됨
    
    val obj5 = Cup<Child>() //obj5는 Cup<Child>의 자료형이됨
    val obj6 : Cup<Child> = obj5 //자료형이 일치하므로 가능
}