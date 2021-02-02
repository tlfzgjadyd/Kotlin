package chap02

//코틀린에서의 스캐너는 ~옆에 ` 쓰는건 알고있었는데 System.in 전체가 아니라 in만 예약어라 in만 하는거였음
//다행히 그것 말고는 nextInt쓰는건 같음

//반대로 신경써야할건 출력쪽임 자바는 +로 연결했다면 코틀린은 ""내부에서 ${}를 써서 변수 출력했었지
//+로 연결하려고 하면 오히려 에러남

//그리고 여기서는 소숫점 제어해야하므로 format쓰면 되는데 format 소문자로 시작하고
//만약 %.2f로 형식 정했는데 format안에 둔 변수는 Int면 에러나니까 1100.0같은걸로 바꿔줘야됨
import java.util.Scanner;
fun main() {
    print("원화를 입력하세요(단위 원)>>")
    val sc = Scanner(System.`in`)
    val money = sc.nextInt()
    print("${money}원은 ${money/1100}입니다.") //일반출력
    print("${money}원은 $%.2f입니다.".format(money/1100.0))//format출력
}