package chap05

class ColorPoint2(var x:Int=0, var y:Int=0, var color:String = "BLACK"){
                //전달인자 왼쪽부터 채우기에 기본값은 오른쪽부터 가능한거였지
    fun setXY(x:Int, y:Int){//setX, setY는 있지만 setXY는 없어서 만든거고
        this.x = x
        this.y = y
    }
//    fun setColor(color:String){ //setColor의 경우 단일 멤버 setter이므로
//        this.color = color      //이미 있기 때문에 내가 따로 만들 필요 없이
//    }                           //main의 할당방식을 = 으로 바꾸는거였다
                                  //누구나 다 수정할 수 있게 바뀌는거 아닌가 싶긴한데

    override fun toString():String{//오버라이드 키워드 필수였다
        return "${color}색의 (${x},${y})의 점"
    }
}

fun main() {
    val zeroPoint = ColorPoint2()//(0, 0) 위치의 BLACK 색 점
    println("${zeroPoint.toString()}입니다.")
    
    val cp = ColorPoint2(10, 10) //(10, 10) 위치의 BLACK 색 점
    cp.setXY(5, 5)
    cp.color="RED"
    println("${cp.toString()}입니다.")
}