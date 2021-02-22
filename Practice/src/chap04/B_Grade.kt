package chap04

import java.util.Scanner
class Grade(val math:Int, val science:Int, val english:Int){
    fun average():Int{
        return (math+science+english)/3
    }
}
fun main() {
    val sc = Scanner (System.`in`)
    print("수학, 과학, 영어 순으로 3개의 정수 입력>>")
    val math = sc.nextInt()
    val science = sc.nextInt()
    val english = sc.nextInt()
    val me = Grade(math, science, english)
    println("평균은 ${me.average()}")
}