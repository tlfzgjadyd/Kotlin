package chap02

import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`) //Scanner랑 (System.in)사이에 띄어쓰기 있어도 되고 없어도 됨
    print("연산>>")
    val x = sc.nextInt()
    val select = sc.next()[0] //자바는 next해서 charAt으로 뽑아내지만 코틀린은 next후 [0]으로 접근
    val y = sc.nextInt()
    var res = 0;
    var flag = true;
    when(select){
        '+' -> res = x+y
        '-' -> res = x-y
        '*' -> res = x*y
        '/' -> res = x/y
        else -> flag = false
    }
    if(flag == true)
        print("${x}${select}${y}의 계산 결과는 ${res}")
    else
        print("잘못 입력")
    
}