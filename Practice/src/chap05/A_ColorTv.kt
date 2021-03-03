package chap05

open class Tv(val size:Int){//일반클래스 상속 가능하게 만들려면 open이 필요했음
    //getSize는 알아서 제공되기 때문에 만들려하면 에러난다
}
class ColorTv(size:Int, val color:Int):Tv(size){//val은 부모클래스에 한번만, 자식은2개, 상속생성자 전달할땐 1개였지
    fun printProperty(){
        println("${size}인치 ${color}컬러")
    }
}

fun main() {
    val myTv=ColorTv(32, 1024)
    myTv.printProperty()
}