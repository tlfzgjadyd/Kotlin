package chap04.section2

/*while문은 데몬 프로그램을 만들때 쓰이기도 함 (조건식을 항상 true로 해서 무제한 반복시키는 방식)
  데몬 : 백그라운드에서 실행하면서 종료되지 않고 지속적으로 특정 작업 처리하는 프로그램
   
  이름의 유래 : 도깨비, 유령, 보이지 않는 백그라운드 프로그램이라는 의미에서 유령같아서 데몬임
 */

fun main() {
    print("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while(number >0){
        factorial *= number
        --number
    }

    println("Factorial: $factorial")
}