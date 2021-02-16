package chap03

import java.util.Scanner
import kotlin.random.Random
fun main() {
    val sc = Scanner (System.`in`)
    print("정수 몇개?")
    val num = sc.nextInt()
    val arr = arrayOfNulls<Int> (num) //빈 배열 생성하기
    var rand : Int
    var flag : Boolean =true
    for(i in 0..arr.size-1){
        while(true) {
            flag=true
            rand = Random.nextInt(100) + 1//Random.nextInt, +보정되는거 생각 안하고
            for (j in 0..i - 1) {              //마지막값 그대로 전달인자에 줘야됨
                if (rand == arr.get(j)) {
                    flag = false
                    break
                }
            }
            if (flag == true)
                break
        }
        arr.set(i, rand)
        print("${arr.get(i)} ")
        if(i%10==9)
            println()
    }
}
