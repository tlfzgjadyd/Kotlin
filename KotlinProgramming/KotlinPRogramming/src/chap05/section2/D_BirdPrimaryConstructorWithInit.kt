package chap05.section2

/*이번엔 전달인자 부분에 프로퍼티 선언만이 아니라 값 대입까지 진행할거임*/

class Bird5(var name: String="NONAME", var wing:Int=2, var beak:String, var color:String){
            //name변수와 wing변수는 값 초기화까지 같이 진행해서 들여옴

    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}

fun main() {
    val coco=Bird5(beak="long", color="red")
    //이럴 경우 전달인자 맨 처음부터 되기에 어떤 변수에 대입한건지 따로 안써주면 name, wing으로 인식하므로 주의
}