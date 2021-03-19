package chap06

class Circle(var x:Int, var y:Int, var radius:Int) {
    fun equals(c:Circle):Boolean{
        if ((this.x==c.x)&&(this.y==c.y))
            return true
        else
            return false
    }
    override fun toString():String{//자꾸 fun 키워드 빼먹어서 에러냄
        return "Circle(${x},${y})반지름${radius}"
    }
}

fun main() {
    val a = Circle(2, 3, 5) //중심(2,3)에 반지름 5인 원
    val b = Circle(2, 3, 30) //중심(2,3)에 반지름 30인 원
    println("원 a : ${a}")
    println("원 b : ${b}")
    if(a.equals(b))
        println("같은 원")
    else
        println("다른 원")
}