package chap05.section1

class Bird {
    //1. 프로퍼티(속성)
    var name: String = "mybird"
    var wing: Int=2
    var beak: String ="short"
    var color:String ="blue"

    //2. 메소드(함수)
    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}

fun main(){
    val coco=Bird() //Bird 클래스의 생성자를 통한 coco객체 생성
    coco.color="blue"//coco인스턴스의 프로퍼티에 값 할당
    
    println("coco.color: ${coco.color}") //coco 객체의 멤버 프로퍼티 읽어서 출력하기
    coco.fly() //Bird클래스의 멤버메소드 fly 사용하기
    coco.sing(3)
}