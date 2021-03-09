package chap05

class PositivePoint:Point{
    //아래의 주석처리한 2줄은 상속 안받았을때의 이야기임 지금은 상속받아 x,y 선언이 부모클래스에
    //있기 때문에 오히려 여기서 선언하면 안됨
    //var x:Int=0//클래스 선언부에서 선언과 동시에 초기화를 택하지 않았기에 멤버변수 선언 필요
    //var y:Int=0//만약 초기값을 쓰지 않을 경우 에러가 나더라

    constructor(x:Int=0, y:Int=0) : super(x,y) {//클래스 선언부에 var x:Int로 var까지 썼던건
        //생성자 몸체 없어도 알아서 초기화까지 해주니까 그런거고
        //constructor키워드로 내부에서 하는 경우에는 초기화 몸체가 있기 때문에
        //var을 사용하면 오히려 에러난다
        //다른 클래스 함수들과 마찬가지로(아래 전달인자 볼것) x:Int까지만 써야됨
        if(x<0||y<0) {
            super.move(0,0)
        } //그리고 그럴 경우 안에서 this.x 쓰기 위해 멤버변수도 선언해줘야됨
    }
    override fun move(x:Int, y:Int){
        if(x>0&&y>0) {
            super.move(x,y) //그냥작성했는데 알고보니 상속 문제라 super의 함수 호출하라고 했음
        }
    }
    override fun toString():String{
        return "(${x},${y})의 점"//코틀린 string문 작성팁 일단 변수명 그대로 "(x,y)의 점"쓴 다음에
                          //변수에 해당하는 부분만 ${}로 바꿔주는게 더 빠르다
    }
}
fun main() {
    val p = PositivePoint()
    p.move(10, 10)
    println("${p.toString()}입니다.")

    p.move(-5, 5) //객체 p는 음수 공간으로 이동되지 않음
    println("${p.toString()}입니다.")

    val p2 = PositivePoint(-10, -10)
    println("${p2.toString()}입니다.")
}