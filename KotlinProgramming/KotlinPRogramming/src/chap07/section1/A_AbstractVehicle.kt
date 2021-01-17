package chap07.section1

/*1. 추상클래스는 abstract 키워드를 통해 선언
* 2. 인스턴스를 생성할 수 없다 (하위 클래스에서 만들어줘야됨)
* 3. 추상클래스 안에 있는 프로퍼티, 메소드들은 안보이지만 open 키워드를 가지고 있음
*    ( 왜냐하면 abstract 키워드가 알아서 붙여주기 때문이다 )
* */

//추상 클래스, 주 생성자에는 비추상 프로퍼티 선언의 매개변수 3개가 있음
/////////////////////////// 1. Vehicle 추상클래스 //////////////////////////////////////////////
abstract class Vehicle (val name: String, val color: String, val weight: Double){

    //추상 프로퍼티 (반드시 하위 클래스에서 재정의해 초기화해야함)
    abstract var maxSpeed: Double

    //일반 프로퍼티(초깃값인 상태를 저장할 수 있음)
    var year = "2018"

    //추상 메소드 (반드시 하위 클래스에서 구현해야함)
    abstract fun start()
    abstract fun stop()

    //일반 메소드
    fun displaySpecs(){
        println("Name: $name, Color: $color, Weight: $weight, Year; $year, Max Speed: $maxSpeed")
    }
}
///////////////////////////2. Vehicle 추상클래스를 구현하는 Car 하위클래스 //////////////////////
class Car(name: String,
         color: String,
         weight: Double,
         override var maxSpeed: Double) //maxSpeed는 오버라이딩함
    :Vehicle(name, color, weight){
        override fun start(){
            //코드의 구현
            println("Car Started")
        }

        override fun stop(){
            //코드의 구현
            println("Car Stopped")
        }
    }
//////////////////////////3. Vehicle 추상클래스를 구현하는 Motorcycle 하위클래스 ///////////////
class Motorcycle(name: String,
                 color: String,
                 weight: Double,
                 override var maxSpeed: Double)
    :Vehicle(name, color, weight){

        override fun start(){
            //코드의 구현
            println("Bike Started")
        }

        override fun stop(){
            //코드의 구현
            println("Bike Stopped")
        }
    }
/////////////////////////4. main함수 ////////////////////////////////////////////////////////
fun main() {
    val car = Car("SuperMatiz", "yellow", 1110.0, 270.0)
    val motor = Motorcycle("DreamBike", "red", 173.0, 100.0)

    car.year="2013"

    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()
}