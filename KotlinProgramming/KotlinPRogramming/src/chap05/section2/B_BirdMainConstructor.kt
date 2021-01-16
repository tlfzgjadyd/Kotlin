package chap05.section2

/*주생성자 만드는 방법이 자바랑 다름 class 클래스명 constructor(전달인자들){ 
  이후에 프로퍼티 선언 및 초기화*/

class Bird2 constructor(_name:String, _wing:Int, _beak:String, _color:String){
    var name:String = _name
    var wing: Int = _wing
    var beak: String = _beak
    var color: String=_color

    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}

fun main() {
    Bird2("bird",2,"short","blue");
}