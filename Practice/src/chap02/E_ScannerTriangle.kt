package chap02

//그리고 코틀린에선 int도 Int지만 boolean도 Boolean이다
import java.util.Scanner
fun main() {
    print("정수 3개를 입력하시오>>")
    val sc = Scanner(System.`in`)
    val num1=sc.nextInt()
    val num2=sc.nextInt()
    val num3=sc.nextInt()

    if(num1>=num2&&num1>=num3)
    {
        if(num1<(num2+num3))
            println("삼각형이 됩니다")
        else
            println("불가능")
    }
    else if(num2>=num1&&num2>=num3)
    {
        if(num2<(num1+num3))
            println("삼각형이 됩니다")
        else
            println("불가능")
    }
    else
    {
        if(num3<(num1+num2))
            println("삼각형이 됩니다")
        else
            println("불가능")
    }

}