package chap02
//계속 중복되는 num1~num6쓰는게 마음에 안들어서
//아예 money 클래스로 만들어서 배열에 넣어서 사용할거임

//그랬더니 개수를 나중에 초기화해야해서 lateinit를 사용해야겠다 생각했음
//근데 문제는 lateinit쓰면 getter setter 못쓴다함
//그렇다고 lazy를 쓰자니 lazy는 val 가능하다 뿐이지
//그래서 결국 lateinit은 뭔가 적합하지 않은것같아서 var로해놓고 부생성자를 사용할까 하다가
//어짜피 중요한건 생성자에다가 변수놓고 따로 변수 쓰기 싫다는 부분이니까
//기본값을 줘서 해결하기로 했음

//기껏 배열 만들어놓고 방한칸씩 초기화하는것도 싫음
//걸리는 시간은 어떨지 아직 모르겠지만 일단 이부분을 제거해보기 위해 listOf로 금액놓고 만들기로했음

//근데 마지막에서 위기가 생겼음 일단 자바 length가 여기는 없고 size로 하는거였지
//for은 for each문 쓰던가 1..5이런거 하는거였음

//setter의 경우 알아서 생기는건 알았지만 setNum으로 하니까 안먹히길래 찾아봤더니
//그냥 =으로 하면 알아서 setter 호출된대서 해봤더니 진짜로 됐음
import java.util.Scanner
class Money constructor(val value: Int, var num: Int=0){

}
fun main() {
    //입력
    print("금액을 입력하시오 >>")
    val sc = Scanner(System.`in`)
    var inputMoney = sc.nextInt()

    //초기화
    val prices = listOf(50000, 10000, 1000, 100, 50, 10, 1)
    var moneys = arrayListOf<Money>()
    for(i in prices)
        moneys[i]=Money(prices[i])
    
    //계산
    for(i in 1..moneys.size)
        moneys[i].num=(inputMoney/prices[i])
}