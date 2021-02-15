package chap03

import java.util.Scanner

fun main() {
    val sc = Scanner (System.`in`)
    print("소문자 알파벳 하나를 입력하시오>>")
    val alpha = sc.next()[0]
    for(i in alpha downTo 'a'){//(int)강제캐스팅 대신 아예 알파벳으로 돌려버리는게 가능
        for(j in 'a'..i){
            print(j)
        }
        println()
    }
}