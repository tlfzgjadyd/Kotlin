package chap08.section1

/*< 제네릭 클래스에서 자료형 제한하기 >
* 제네릭을 사용하지만 형식 매개변수 T를 특정 자료형들로만 제한하는 것이 가능하다
* 자바에선 extends나 super를 사용했던 반면
* 코틀린에서는 :콜론을 통해서 제한할 수 있다
* 아래의 예제에서는 정수나 실수 자료형만 받을 수 있도록 하기 위해 Number 자료형을 사용한다
* */

class Calc<T: Number>{ //T: Number로 숫자형만 받을 수 있도록 클래스의 형식 매개변수 T를 제한했다
    fun plus(arg1: T, arg2: T): Double{
        return arg1.toDouble()+arg2.toDouble()
    }
}

fun main() {
    val calc = Calc<Int>() 
    println(calc.plus(10, 20))

    val calc2 = Calc<Double>()
    val calc3 = Calc<Long>()
    //val calc4 = Calc<String>() //숫자형으로 자료형을 제한했기에 String 자료형으로 인해 오류 발생

    println(calc2.plus(2.5, 3.5))
    println(calc3.plus(5L, 10L))
}