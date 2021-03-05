package chap05

import java.util.Scanner
class Km2Mile(ratio:Double) :Converter(ratio){
    val sc = Scanner (System.`in`)
    fun run(){
        println("${getSrcString()}을 ${getDestString()}로 바꿉니다.")
        print("${getSrcString()}을 입력하세요>> ")
        val num = sc.nextDouble()
        val res=convert(num)
        println("변환 결과: ${res}${getDestString()}입니다")
    }

    override fun convert(src: Double): Double {
        return src/ratio
    }

    override fun getSrcString(): String {
        return "Km"
    }

    override fun getDestString(): String {
        return "mile"
    }
}

fun main() {
    val toMile = Km2Mile(1.6)
    toMile.run()
}