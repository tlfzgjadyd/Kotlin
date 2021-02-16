package chap03

import java.util.Scanner
fun main() {
    val sc = Scanner (System.`in`)
    print("금액을 입력하시오>>")
    var money = sc.nextInt()
    val unit = arrayOf(50000, 10000, 1000, 500, 100, 50, 10, 1)
    val nums = arrayOfNulls<Int>(unit.size);//비어있는 배열 선언
    var num :Int;
    for(i in 0..unit.size-1){
        num = money/unit[i]
        nums.set(i, num)
        money-=unit.get(i)*num
        println("${unit.get(i)}원 짜리 : ${nums.get(i)}개")
    }
}