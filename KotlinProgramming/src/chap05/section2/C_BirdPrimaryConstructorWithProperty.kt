package chap05.section2

/*이전 예제에서는 프로퍼티를 나중에 초기화해줬지만 이번에는 내부 프로퍼티 생략하고 생성자의 매개변수에
  프로퍼티 표현을 함께 넣을거다 val, var 사용해서 매개변수 선언하면 this 키워드나 언더스코어 할필요 없어짐
  처음부터 전달인자에 선언을 포함한 셈이 되기 때문*/

class Bird3(var name:String, var wing:Int, var beak:String, var color: String){
    //프로퍼티 선언 없이 바로 함수 선언으로 시작됨
    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}

fun main() {
    val coco=Bird3("mybird", 2, "short", "blue")

    coco.color="yellow"
    println("coco.color:${coco.color}")
    coco.fly()
    coco.sing(3)
}