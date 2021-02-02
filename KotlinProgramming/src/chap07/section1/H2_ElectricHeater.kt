package chap07.section1

// 전기 히터 클래스, 히터 인터페이스를 구현하는 구체화 클래스다
class ElectricHeater(var heating : Boolean = false) : Heater {
    override fun on(){
        println("[ElectricHeater] heating...")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot() : Boolean = heating
}