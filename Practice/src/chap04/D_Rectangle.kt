package chap04

class Rectangle(val x:Int, val y:Int, val width:Int, val height:Int){
    fun square():Int{
        return width*height;
    }
    fun show(){
        println("(${x},${y})에서 크기가 ${width}x${height}인 사각형")
    }
    fun contains(r:Rectangle):Boolean{//Rectangle이라는 클래스명을 자료형으로 써서 에러난게 아니라
                                    //try catch때와 마찬가지로 변수명:자료형 형식으로 해야해서 그렇다
                                    //Rectangle r->r:Rectangle
        if(this.x<r.x&&(r.x+r.width)<(this.x+this.width)&&this.y<r.y&&(r.y+r.height)<(this.y+this.height))
            return true;
        else
            return false;
    }
}

fun main() {
    val r = Rectangle(2, 2, 8, 7)
    val s = Rectangle(5, 5, 6, 6)
    val t = Rectangle(1, 1, 10, 10)

    r.show()
    println("s의 면적은 ${s.square()}")
    if(t.contains(r))println("t는 r을 포함합니다.")
    if(t.contains(s))println("t는 s를 포함합니다.")
}