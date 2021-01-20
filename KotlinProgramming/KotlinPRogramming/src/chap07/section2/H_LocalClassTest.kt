package chap07.section2

/* < 중첩클래스와 지역클래스 키워드의 차이점 >
* powerOn()함수 내부에 Led 지역클래스를 선언했음
* 이걸로 봐서 Local 클래스 만들 때에도 별도의 키워드는 안쓰는듯
* 단지 차이가 있다면 중첩클래스는 클래스 내부에 바로 만들지만
* 지역클래스는 클래스 내부에 블록이나 함수처럼 감쌀만한게 하나 더 있어야됨
*
* < 중첩클래스와 지역클래스 구조의 차이점 >
* 중첩클래스 구조는
* class  외부클래스명{
*   class  내부클래스명{
*           ;
*   }
* }
* 지역클래스 구조는
* class  외부클래스명{
*   fun(){
*      class  내부클래스명{
*           ;
*       }
*     }
*  }
*
* < 중첩클래스와 지역클래스의 외부클래스 접근에 대한 차이점 >
* 중첩클래스는 inner클래스와 달리 외부클래스에 접근 불가
* 하지만 Local클래스는 중첩클래스처럼 키워드 안씀에도 불구하고 외부클래스에 접근이 가능하다
* */
class Smartphone2(val model: String){
    private val cpu = "Exynos"

    fun powerOn(): String{
        class Led(val color: String){
            fun blink(): String = "Blinking $color on $model" //외부의 프로퍼티에 접근 가능
        }
        val powerStatus = Led("Red") //여기에서 지역 클래스가 사용됨, 지역클래스의 생명 범위는 그것이 정의된 외부블록까지임
        return powerStatus.blink()
    }//powerOn() 블록 끝
    //val powerStatus2 = Led("Red");//그래서 외부블록 벗어난 여기서부턴 사용이 불가능함
}

fun main() {

    val myphone = Smartphone2("Note9")
    println(myphone.powerOn())
}