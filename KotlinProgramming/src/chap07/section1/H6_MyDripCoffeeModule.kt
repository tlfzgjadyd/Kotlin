package chap07.section1

class MyDripCoffeeModule : CoffeeModule {
    companion object{
        val electricHeater: ElectricHeater by lazy{ //lazy를 이용한 지연초기화, 접근시점에 초기화됨
            ElectricHeater()
        }
    }
    private val _thermosiphon : Thermosiphon by lazy { //일시적인 private 프로퍼티
        Thermosiphon(electricHeater)
    }

    //오직 이 메서드에서만 Thermosiphon을 초기화
    override fun getThermosiphon() : Thermosiphon = _thermosiphon
}