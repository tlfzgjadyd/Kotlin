package chap05.section6

/*   4. 구성관계 Composition: 한 클래스가 다른 클래스의 일부가 되는 것으로
     (검은 다이아몬드)      구성품이 되는 클래스는 생명주기가 소유자 클래스에 의존되어 있기에
                          전체클래스 삭제시 구성품 클래스도 같이 삭제된다
                          Car클래스와 Engine클래스를 예로 들 수 있다

     < 증거 찾아내기 >
     1. 객체 2개가 같이 생성되며
     2. 두 객체의 생명주기가 같아 전체클래스 삭제시 부품클래스는 같이 삭제됨
     3. 포함관계다
* */
class Car(val name: String, val power: String){
    private var engine = Engine(power) //Engine 클래스 객체는 Car에 의존적

    fun startEngine()=engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power:String){
    fun start() = println("Engine has been started")
    fun stop() = println("Engine has been stopped")
}

fun main() {
    val car = Car("tico", "100hp")
    car.startEngine()
    car.stopEngine()
}