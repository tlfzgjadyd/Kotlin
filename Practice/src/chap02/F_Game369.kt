package chap02

//이번엔 when썼음
//when은 switch와 비슷하지만 switch와 다르게 판별 대상을 when옆에 쓰지 않음
//그냥 when{ 이렇게한다
//그리고 when is 이런 문장이 떠오르겠지만
//실제론 in을 쓸 경우에만 is를 쓰는거고
//그게 아닌 경우에는 평범하게 count==0이런식으로 판별하면됨

import java.util.Scanner
fun main() {
    print("1~99 사이의 정수를 입력하시오>>")
    val sc = Scanner(System.`in`)
    val num=sc.nextInt()
    val ten=num/10
    val one=num%10

    var count=0
    if(ten==3||ten==6||ten==9)
        count++
    if(one==3||one==6||one==9)
        count++

    when{
        (count==0) ->println()
        (count==1) ->println("박수짝")
        (count==2) ->println("박수짝짝")
    }

}