package chap02

import java.util.Scanner
fun main() {
    val sc = Scanner (System.`in`)
    print("달을 입력하세요(1~12)>>")
    val month = sc.nextInt();
    when(month){
        in 3..5 -> print("봄") //when문 편하게 쓰는법 기억해놔야됨
        in 6..8 -> print("여름") //결정변수는 when옆에 있으니까 in부터 쓰면 되는거임
        in 9..11 -> print("가을")
        12, in 1..2 -> print("겨울") //여기서 중요함 12와 1~2를 이어줄때 or이나 ||를 쓰거나 괄호로
                                //전체를 묶어주면 되는건줄 알았는데 쉼표로 이어주는거였음 1, 2, 3 
                                //이런식으로 값을 이어주기도 했다

        else -> print("잘못입력") //default 대신 else 쓰는건 알았는데 두 경우 합치는게 어려웠음
    }
}