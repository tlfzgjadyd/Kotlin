package chapFree

import kotlin.reflect.typeOf

class HeatResistanceGlassCup : Cup(), Heatable{
    override fun putInCup(content : Cupable, amount : Int){
        println("내열 유리컵에 ${content}를 담았다")
    }
}