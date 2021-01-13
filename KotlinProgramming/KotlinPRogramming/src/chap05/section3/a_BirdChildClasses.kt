package chap05.section3

/*하위클래스 선언하기
  상속 가능한 클래스로 만드려면 앞에 open 키워드를 붙여줘야됨
  open이 붙지 않은 그냥 class로 선언할 경우 그건 최종클래스라 더이상 파생클래스를 만들 수 없음 리프가됨
  
  open class 기반 클래스 이름{ //부모클래스=기반클래스, 묵시적으로 Any로부터 상속됨, open으로 파생 가능
  ...
  }
  class 파생클래스 이름 : 기반 클래스 이름() { //자식클래스=파생클래스, 기반 클래스로부터 상속됨, 최종 클래스로 파생 불가
   ...
  }
*/

/* 코딩 관례
   자료형 쓸때 변수의 경우 변수명: Int로 변수형과 : 콜론을 붙여 쓰지만 자료형과는 띄어씀
   기반클래스를 쓸때는 파생클래스명 : 기반클래스로 콜론 앞뒤로 띄어쓰기가 되어있다
   이것을 통해 클래스 선언과 변수 선언을 구분할 수 있다
*/

//1. open 키워드를 통한 기반클래스 선언
open class Bird(var name:String, var wing:Int, var beak:String, var color:String){
    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}

//2. 기반클래스를 상속받는 파생클래스, 주생성자를 사용
class Lark(name:String, wing:Int, beak:String, color:String): Bird(name, wing, beak, color){
    fun singHitone()=println("Happy Song!") //새로 추가한 메소드
}

//3. 기반클래스를 상속받는 파생클래스, 부생성자를 사용
class Parrot:Bird{
    val language:String //이 language 변수는 기반클래스에는 없는 파생클래스에만 있는 변수다

    constructor(name:String,
                wing:Int,
                beak:String,
                color:String,
                language:String):super(name,wing,beak,color) { //생성자가 부생성자만 있을 경우 기반클래스는
                //클래스명 옆 말고 여기다가 super라고 써야하고 전달인자도 4개 다 줘야됨
                //근데 language라는 변수는 유일하게 기반클래스에 없고 파생클래스에만 있는 변수임
                //그렇기에 super에는 기반클래스에 있는 4개의 변수만 전달하고
                //부생성자 안에서 this.language=language라고 따로 초기화를 해줘야됨
                //왜냐면 나머지 4개의 변수들은 super을 통해 전달될때 이미 초기화됐는데
                //language는 파생 클래스에만 있는 변수라 초기화가 안된 상태이기 때문
                  this.language=language
                }

    fun speak()=println("Speak! $language")
}

fun main() {
    val coco=Bird("mybird", 2, "short", "blue")
    val lark=Lark("mylark", 2, "long", "brown")
    val parrot=Parrot("myParrot", 2, "short", "multiple", "korean")
    
    lark.fly() //기반클래스에서 상속받은 메소드 사용
    lark.singHitone() //파생클래스에서 새로 추가한 메소드 사용
    parrot.speak()//파생클래스에서 새로 추가한 메소드 사용
}