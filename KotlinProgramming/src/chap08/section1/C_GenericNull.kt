package chap08.section1

/*< T에서의 null제어 >
* 제네릭의 형식 매개변수 T는 null이 가능한 형태로 선언됨
* 그렇기때문에 아래의 코드에 GenericNull<Int?>처럼 자료형에 null 허용하도록 ?붙여야됨
* null일 경우 equals로 비교하지 않고 null을 반환하도록 짜뒀다
* 
* < 만약 null을 허용하고 싶지 않은 경우 >
* 클래스 선언 부분에 <T>대신 <T: Any>로 바꿔주면 더이상 null이 허용되지 않으며
* 그렇게 되면 <Int?>처럼 null의 허용방식 사용시 에러가 난다
* */

class GenericNull<T> { //기본적으로 null이 허용되는 형식 매개변수
    fun EqualityFunc(arg1: T, arg2: T){
        println(arg1?.equals(arg2))
    }
}
class NoNull<T: Any> { //기본적으로 null이 허용되는 형식 매개변수
    fun EqualityFunc(arg1: T, arg2: T){
        println(arg1?.equals(arg2))
    }
}
fun main() {
    val obj = GenericNull<String>() //non-null로 선언됨
    obj.EqualityFunc("Hello", "World")//null이 허용되지 않음
    
    val obj2 = GenericNull<Int?>() //null이 가능한 형식으로 선언됨
    obj2.EqualityFunc(null, 10)//null사용

   // val obj3 = NoNull2<Int?>() //NoNull클래스는 클래스 선언시 T: Any로 null허용하지 않았기에 null허용표현 사용시 에러남
}