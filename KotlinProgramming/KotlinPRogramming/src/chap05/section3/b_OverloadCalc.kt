package chap05.section3

/*오버로딩 : 여러 형태 함수 실행 가능
  오버라이딩 : 부모 자식 관계 라이딩
  
  둘중 오버로딩을 해볼거임
*/

fun main() {
    val calc=Calc()
    println(calc.add(3,2))
    println(calc.add(3.2, 1.3))
    println(calc.add(3, 3, 2))
    println(calc.add("Hello", "World"))
}
class Calc{
    //다양한 매개변수로 오버로딩된 메소드, 이처럼 클래스 내부에 같은 함수명으로 여러 시그니처 두면 가능
    fun add(x:Int, y:Int):Int=x+y
    fun add(x:Double, y:Double):Double=x+y
    fun add(x:Int, y:Int, z:Int):Int=x+y+z
    fun add(x:String, y:String):String=x+y
}