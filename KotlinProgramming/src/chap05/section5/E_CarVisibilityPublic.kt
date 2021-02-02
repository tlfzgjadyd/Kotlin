package chap05.section5

/*section5에서 배운 내용들을 종합해서 자동차와 도둑 클래스를 작성해본다
  먼저 자동차 Car 클래스 선언 후 파생클래스 Tico를 만들거다
  그리고 외부의 도둑클래스 Burglar를 만들거다
  
  실행 순서는 다음과 같음
  Car클래스 만들고 엔진 가동하고 라이센스 확인함
  이후 도둑클래스가 아무 차나 인자로 받아서 그 차의 정보를 확인, 
  access를 하는 순간 비번 확인해서 비번에 틀린 도둑에게 너는 도둑이라고 알려줌
 */
/////////////////////// Car, 내부의 Driver 클래스 /////////////////////////////////////////////////
open class Car protected constructor(_year: Int, _model: String, _power: String, _wheel: String) {
    private var year: Int = _year
    public var model: String = _model //사실 public은 기본값이라 생략해도 되긴함
    protected open var power: String = _power
    internal var wheel: String = _wheel

    protected fun start(key: Boolean) {
        if (key) println("Start the Engine!")
    }

    class Driver(_name: String, _license: String) {
        private var name: String = _name
        var license: String = _license //기본값이 public이므로 자동으로 public됨
        internal fun driving() = println("[Driver] Driving() - $name")
    }
}
/////////////////////// Car을 상속받은 Tico 클래스 //////////////////////////////////////////////////////
    class Tico(
        _year: Int, _model: String, _power: String, _wheel: String,
        var name: String, private var key: Boolean
    ) : Car(_year, _model, _power, _wheel) {
        override var power: String = "50hp"
        val driver = Driver(name, "first class")

        constructor(_name: String, _key: Boolean) : this(
            2014, "basic",
            "100hp", "normal", _name, _key) {
            name = _name
            key = _key
        }


    fun access(password: String) {
        if (password == "gotico") {
            println("-----[Tico] access()-----")
            //super.year //3. private 접근 불가
            println("super.model= ${super.model}") //public
            println("super.power= ${super.power}") //protected
            println("super.wheel= ${super.wheel}") //internal
            super.start(key) //protected

            //driver.name //private 접근 불가
            println("Driver().license = ${driver.license}") //public
            driver.driving() //internal
        } else {
            println("You're a burglar")
        }
    }
}
////////////////////////// Burglar 클래스 //////////////////////////////////////////////////
class Burglar() {
    fun steal(anycar: Any){
        if(anycar is Tico) { //인자가 Tico의 객체일 때
            println("----[Burglar] steal()--------")
            //println(anycar.power) //protected 접근 불가
            //println(anycar.year) //private 접근 불가
            println("anycar.name = ${anycar.name}")//public 접근
            println("anycar.wheel = ${anycar.wheel}")//internal접근(같은 모듈 안에 있으므로)
            println("anycar.model = ${anycar.model}")//public접근

            println(anycar.driver.license) //public 접근
            anycar.driver.driving() //internal 접근 (같은 모듈 안에 있으므로)
            //println(Car.start()) //protected 접근 불가
            anycar.access("dontKnow")
        }else{
            println("Nothing to steal")
        }
    }
}
/////////////////////////////  main함수  ///////////////////////////////////////////////////////
fun main() {
    //val car = Car() //protected 생성 불가
    val tico = Tico("kildong", true)
    tico.access("gotico")

    val burglar = Burglar()
    burglar.steal(tico)
}