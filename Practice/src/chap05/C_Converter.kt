package chap05

import java.util.Scanner
abstract class Converter(var ratio:Double){
    abstract protected fun convert(src:Double):Double; //추상 메소드
    abstract protected fun getSrcString():String; //추상 메소드
    abstract protected fun getDestString():String; //추상 메소드
}
class Won2Dollar(ratio:Int): Converter(ratio.toDouble()){//여기서 전달인자로 int받고 double로 바꿔서 넘겨줬음
    val sc = Scanner (System.`in`)
    fun run(){
        println("${getSrcString()}을 ${getDestString()}로 바꿉니다.")
        print("원을 입력하세요>> ")
        val input = sc.nextDouble()
        val res=convert(input)
        println("변환 결과: ${res}${getDestString()}입니다")
    }
    override fun convert(src:Double):Double{
        return src/ratio
    }
    override fun getSrcString():String{
        return "원"
    }
    override fun getDestString():String{
        return "달러"
    }
}
fun main() {
    val toDollar = Won2Dollar(1200); //1달러는 1200원
    toDollar.run();
}