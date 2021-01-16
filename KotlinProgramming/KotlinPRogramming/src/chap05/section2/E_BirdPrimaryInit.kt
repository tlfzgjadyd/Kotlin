package chap05.section2

/*객체 생성시 변수 초기화 이외에 특정 코드도 같이 실행하고 싶을 경우 init 블록을 사용한다*/

class Bird4(var name: String, var wing:Int, var beak:String, var color:String){

    init{ //init 초기화 블록을 통해 맨 처음 객체 생성시 블록 내의 내용을 실행
        println("------초기화 블록 시작--------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("------초기화 블록 끝 --------")
    }

    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}

fun main() {
    val coco=Bird4("mybird", 2, "short", "blue")
}