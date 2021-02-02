package chap02

import java.util.Scanner

fun main() {
    print("2자리수 정수 입력(10~99)>>")
    val sc = Scanner(System.`in`)
    val num=sc.nextInt()
    if(num/10==num%10)
        print("Yes! 10의 자리와 1의 자리가 같습니다.")
    else
        print("No 10의 자리와 1의 자리가 다릅니다.")
}