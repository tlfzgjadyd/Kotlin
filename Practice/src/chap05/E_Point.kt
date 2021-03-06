package chap05

open class Point(var x:Int, var y:Int){//추상 아니니까 상속하려면 open
    fun move(x:Int, y:Int){
        this.x=x
        this.y=y //이거는 자바랑 똑같이 this 쓰는거였지 .으로 접근하는거임 this->는 c++였음
    }
}
class ColorPoint(x:Int, y:Int, var color:String): Point(x, y){
    //setColor이고 나발이고 위에 쓴 이상 setter 이미 생겼으니까
    //이걸 구현할게 아니라 main쪽을 바꿔야하는 거였음
    fun setXY(x:Int, y:Int){
        move(x, y)
    }
    override fun toString():String{ //String을 리턴하는 toString을 오버라이딩했음
        return "${color}색의 (${x},${y})의 점"
    }
}

fun main() {
    val cp = ColorPoint(5, 5, "YELLOW")
    cp.setXY(10, 20)
    cp.color="RED"
    val str = cp.toString()
    println("${str}입니다.")
}