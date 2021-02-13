package chap02

import java.util.Scanner
fun main() {
    val sc = Scanner (System.`in`)
    print("달을 입력하세요(1~12)>>")
    val month = sc.nextInt();
    if(3<=month&&month<=5)
        print("봄")
    else if(6<=month&&month<=8)
        print("여름")
    else if(9<=month&&month<=11)
        print("가을")
    else if(12==month||month==1||month==2)
        print("겨울")
    else
        print("잘못입력")
}