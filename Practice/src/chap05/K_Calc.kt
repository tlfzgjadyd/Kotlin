package chap05

import java.util.Scanner
abstract class Calc(val a:Int, val b:Int){
    abstract fun calculate():Int
}
class Add(a:Int, b:Int): Calc(a, b){
    override fun calculate():Int{
        return a+b
    }
}
class Sub(a:Int, b:Int): Calc(a, b){
        override fun calculate():Int{
            return a-b
        }
}
class Mul(a:Int, b:Int): Calc(a, b){
    override fun calculate():Int{
        return a*b
    }
}
class Div(a:Int, b:Int): Calc(a, b){
    override fun calculate():Int{
        return a/b
    }
}

fun main() {
    print("두 정수와 연산자를 입력하시오>>")
    val sc = Scanner (System.`in`)
    val num1=sc.nextInt()
    val num2=sc.nextInt()
    val type=sc.next()
    sc.nextLine()
    val add = Add(num1, num2)
    val sub = Add(num1, num2)
    val mul = Add(num1, num2)
    val div = Add(num1, num2)
    when(type){
        "+"->print(add.calculate())
        "-"->print(sub.calculate())
        "*"->print(mul.calculate())
        "/"->print(div.calculate())
        else->println("잘못된 연산 타입입니다")
    }
}