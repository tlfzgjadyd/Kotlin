package chapFree

class MicroWave() : Heatable{
    fun heatUp(target: Heatable, second: Int){
        println("${target}을 데우는중")
        println("\n${second}초 후...\n")
        println("띵")
    }
}