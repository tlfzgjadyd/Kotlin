package chap05.section3

/*오버로딩 : 여러 형태 함수 실행 가능
  오버라이딩 : 부모 자식 관계 라이딩

  둘중 오버라이딩을 해볼거임
*/

//기반클래스 선언
open class Bird2(var name:String, var wing:Int, var beak:String, var color:String){
    fun fly()=println("Fly wing: $wing")
    open fun sing(vol:Int)=println("Sing vol: $vol") //sing을 오버라이딩 가능한 메소드로 열어둠
}

//파생클래스 선언
class Parrot2(name:String,
             wing:Int=2,
             beak:String,
             color:String,
             var language:String="natural" ):Bird2(name, wing, beak, color){

                 fun speak()=println("Speak! $language")
                 override fun sing(vol:Int){ //sing을 실제로 오버라이딩 하기 위해 override 키워드 사용
                    println("I'm a parrot! The volume level is $vol")
                     speak() //달라진 내용
                 }
             }

fun main() {
    val parrot=Parrot2(name="myparrot", beak="short", color="multiple")
    parrot.language="English"

    parrot.sing(5)
}
