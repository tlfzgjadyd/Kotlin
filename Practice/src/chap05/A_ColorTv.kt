package chap05

open class Tv(val size:Int){//일반클래스 상속 가능하게 만들려면 open이 필요했음
    //getSize는 알아서 제공되기 때문에 만들려하면 에러난다
}
open class ColorTv(size:Int, val color:Int):Tv(size){//val은 부모클래스에 한번만, 자식은2개, 상속생성자 전달할땐 1개였지
    open fun printProperty(){//다음예제에선 colortv 상속받아서 얘도 open으로 만들어줬음, 그리고 함수 오버라이딩 할거라 함수도 open 해줘야했음
        println("${size}인치 ${color}컬러")
    }
}

fun main() {
    val myTv=ColorTv(32, 1024)
    myTv.printProperty()
}