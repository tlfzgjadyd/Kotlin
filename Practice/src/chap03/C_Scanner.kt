package chap03

import java.util.Scanner
fun main() {
    val sc = Scanner (System.`in`)
    print("정수를 입력하시오>>")
    val num = sc.nextInt()
    var i = 0;
    for(i in num downTo 1){ //이거 기억해야됨 계속 까먹음 downTo
        for(j in 1..i){ //뭐야 for문 원래 이렇게 돌렸었나? 그랬었네 음 쨌든 에러나니까 이렇게해야지
            print("*")    //..방식은 양끝 다 포함이므로 1~5되게 했음
        }
        println()
    }

}