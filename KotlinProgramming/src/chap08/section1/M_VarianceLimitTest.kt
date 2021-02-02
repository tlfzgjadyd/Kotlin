package chap08.section1

open class Animal(val size: Int){
    fun feed() = println("Feeding...")
}
class Cat(val jump: Int): Animal(50)
class Spider(val poison: Boolean): Animal(1)

//1. 형식 매개변수를 Animal로 제한
class Box2<out T: Animal>(val element: T){//주 생성자에는 val 만 허요
    fun getAnimal(): T = element //2. out은 반환 자료형에만 사용할 수 있음
//  fun set(new: T){ //3. T는 in 위치에 사용할 수 없기에 에러남
//    element = new
// }
}

fun main() {
    //일반적인 객체 선언
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    var a1: Animal = c1 //클래스의 상위 자료형으로 변환하는 것은 아무런 문제 없음
    a1 = s1 //4. a1은 Spider의 객체가 됨
    println("a1.size=${a1.size}")

    val c2: Box2<Animal> = Box2<Cat>(Cat(10)) //5. 공변성 - Cat은 Animal의 하위 자료형
    println("c2.element.size = ${c2.element.size}")

    //val c3: Box2<Cat> = Box2<Animal>(10) //6. 역방향의 경우 인스턴스화 되지 않아 에러
    //val c4: Box2<Any> = Box<Int>(10) //7. 자료형 제한했기 때문에 Animal과 하위 클래스 외에는 불가능해서 에러
}