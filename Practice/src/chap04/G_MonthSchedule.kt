package chap04

import java.util.Scanner
//컴파일에러는 안나도해봐도 출력때 에러나거나 안떴었는데 드디어 해결함..
//세이프콜때문에 넘겨진 함수에서 판명되기도 전에 null이라 함수 안불리는거라고 생각했는데
//전부다 출력해봐도 null이 나오는걸로 봐서 input의 문제일수도 있겠다 싶었음
//하긴 생각해보면 main에서 전달할때 null배열로 생성했으니까 안에 객체가 있을리가 없지
//그래서 input할때 새로운 Day객체를 만들어서 할당해주기로 했음
//그랬더니 드디어 작동한다..
//근데 확실히 자바문제를 코틀린으로 푸는건 한계가 있는듯
//lateinit같은것도 언제 쓰는건지 해봐야되는데 자바문제로는 타이밍을 정확히 잡아낼수가 없음
//그러므로 자바문제 코틀린으로 푸는건 이근처에서 끝내고
//코틀린 문제를 코틀린으로 풀기 시작해야겠다

class Day(var work:String){
    fun show(){
        if(work==null)
            println("없습니다.")
        else
            println("${work} 입니다.")
    }
}
class MonthSchedule (var days:Array<Day?>){//여기서 타입에 ?로 null 허용해줘야 null로 이뤄진
    fun run() {                          //day 배열을 전달해서 생성이 가능해진다
        val sc = Scanner(System.`in`)
        var select = 0
        println("이번달 스케쥴 관리 프로그램.")
        while (true) {
            print("할일(입력:1, 보기:2, 끝내기:3) >>")
            select = sc.nextInt()
            when (select) {
                1 -> input(sc)
                2 -> watch(sc)
                3 -> break
            }
            println()
        }
        println("프로그램을 종료합니다.")
    }
    fun input(sc:Scanner){
        print("날짜(1~30)?")
        val select=sc.nextInt()
        print("할일(빈칸없이입력)?")
        val content = sc.next()//빈칸없이 입력이라고 돼있으니 nextLine말고 next
        days[select-1]=Day(content)
    }
    fun watch(sc:Scanner){
        print("날짜(1~30)?")
        val select = sc.nextInt()
        days[select-1]?.show()
    }
}

fun main() {
    var days= arrayOfNulls<Day?>(30)//왜 에러나나 했네 타입은 대문자 Array고 함수는 소문자 a로 시작이다
    val ms = MonthSchedule(days)
    ms.run()
}