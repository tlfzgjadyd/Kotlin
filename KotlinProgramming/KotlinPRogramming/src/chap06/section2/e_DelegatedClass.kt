package chap06.section2

/*by를 이용한 위임 : by를 사용하면 하나의 클래스가 다른 클래스에 위임하도록 선언하여
*                 위임된 클래스가 가지는 멤버를 참조 없이 호출할 수 있게 됨
*
* 프로퍼티 위임 : 프로퍼테의 getter, setter를 다른 객체에게 위임하여
*               별도의 참조없이 알아서 getter setter 사용되도록 만드는것
*
* 프로퍼티 위임 사용법 : 프로퍼티 위임을 하려면 위임 받을 객체에 by 키워드를 사용한다
*
* 프로퍼티 위임 예시)
* interface Animal {
*   fun eat() {...}
* }
* class Cat : Animal{}
* val cat = Cat()
* class Robot : Animal by cat //이러면 Animal을 상속받는 Cat의 모든 멤버를 Robot에 위임
*               즉 Robot은 Cat에 있는 모든 메소드를 가지게됨
*               그말은 곧 Cat이 상속받은 Animal의 메소드들도 가지게됐다는 뜻이다
*               그래서 이후에는 Animal을 명시적으로 참조하지 않아도 eat() 호출하는것이 가능하다
*
* 위임을 사용하는 이유 : 기본적으로 코틀린은 모두 final 형태로 만들어서 무분별한 상속에 따른 문제를 방지할 수 있음
*                     하지만 그럴 경우 상속이나 클래스의 기능 확장이 어려워짐
*                     그래서 필요한 경우에만 상속과 비슷하게 확장할 수 있도록 위임을 만들어 놓은것
* 
* 이번 예제에서는 같은 Car 인터페이스를 상속받는 두가지 클래스 VanImpl, SportImpl이 나온다
* Car의 go()를 각각 오버라이딩 했으며
* CarModel 클래스를 통해 전달받은 구체적인 모델을 굴렸다
* 이때 CarModel은 Car의 메소드들을 위임받았기에 별도의 접근 없이 바로 go()를 사용 가능했다*/

interface Car{
    fun go(): String
}

class VanImpl(val power: String): Car{
    override fun go()="은 짐을 적재하며 $power 을 가집니다"
}

class SportImpl(val power: String): Car{
    override fun go() = "은 경주용에 사용되며 $power 을 가집니다."
}

class CarModel(val model: String, impl: Car): Car by impl{ //CarModel에게 Car byimpl을 맡겼기에
    fun carInfo(){                         //CarModel 내부의 carInfo()는 별도의 참조 없이 Car의 go()에 접근
        println("$model ${go()}") //1. 참조 없이 각 인터페이스 구현 클래스의 go()에 접근
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z= CarModel("350Z 2008", SportImpl("350마력"))

    myDamas.carInfo() //VamInpl, SportImpl은 각각 구현된 go가 다르기에 다형성을 나타낸다
    my350z.carInfo()
}