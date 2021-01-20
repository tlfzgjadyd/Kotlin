package chap07.section3

/*다음은 내부의 클래스에서 바깥 클래스의 멤버에 접근하는 코드입니다 빈칸을 참고하여 코드를 완성해보세요
* 제공되는 코드는 아래와 같음
* class Outer(val name: String){
*     private val origin = "Hello"
*     _______class MyClass(val from: String){
*       fun getINfo() = "${name} says $origin frim ${from}"
*     }
* }
* */

class Outer(val name: String){
    private val origin = "Hello"
    inner class MyClass(val from: String){
        fun getINfo() = "${name} says $origin frim ${from}"
    }
}
//바깥클래스에 접근하려면 필요한건 inner 키워드