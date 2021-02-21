package chap03

import java.util.Scanner
import kotlin.random.Random
fun main() {
    val sc = Scanner (System.`in`)
    var personSelect:String
    var computerSelect:String
    var personNum = -1
    var computerNum =-1
    val arr = arrayOf("가위", "바위", "보")
    var result:String
    println("컴퓨터와 가위 바위 보 게임을 합니다.")

    while(true) {
        print("가위 바위 보!>>")
        personSelect = sc.next()
        if(personSelect=="그만")
            break
        if((personSelect!=arr[0])&&(personSelect!=arr[1])&&(personSelect!=arr[2]))
        {
            println("잘못 입력했습니다")
            continue
        }
        for (i in 0..arr.size - 1) {
            if (personSelect == arr[i])
                personNum = i
        }
        computerNum = Random.nextInt(2)
        computerSelect = arr[computerNum]
        if (personNum == computerNum)
            result = "비겼습니다."
        else if (personNum - computerNum == 1 || (personNum == 0 && computerNum == 2))
            result = "사용자가 이겼습니다."
        else
            result = "컴퓨터가 이겼습니다."
        println("사용자 = ${personSelect}, 컴퓨터 = ${computerSelect}, ${result}")
    }
}