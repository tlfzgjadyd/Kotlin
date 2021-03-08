package chap05

class Point3D(var x:Int, var y:Int, var z:Int){
    override fun toString():String{ //오버라이드 키워드랑 반환형 필수
        return "(${x},${y},${z})의 점"
    }
    fun moveUp(){
        z++;
    }
    fun moveDown(){
        z--;
    }
    fun move(x:Int, y:Int, z:Int = this.z){//함수오버로딩 대신 기본값으로 this.z를 줘서 해결
        this.x=x
        this.y=y
    }
}
fun main() {
    val p = Point3D(1, 2, 3) //1, 2, 3은 각각 x, y, z축의 값
    println("${p.toString()}입니다.")

    p.moveUp(); //z축으로 위쪽 이동
    println("${p.toString()}입니다.")

    p.moveDown(); //z축으로 아래쪽 이동
    p.move(10, 10); //x, y축으로 이동
    println("${p.toString()}입니다.")

    p.move(100, 200, 300); //x, y, z축으로 이동
    println("${p.toString()}입니다.")
}