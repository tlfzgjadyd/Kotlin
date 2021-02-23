package chap04

import java.util.Scanner
class Circle(val x:Double, val y:Double, val radius:Int){
    fun show(){
        println("(${x},${y})${radius}")
    }
}
class CircleManager{
    fun run(){
        val sc = Scanner (System.`in`)
        var x:Double
        var y:Double
        var radius:Int
        val circles = arrayOfNulls<Circle>(3); //와 빈배열에 나중에 데이터 넣는거 성공했다ㅠ
        for(i in 0..2){
            print("x, y, radius>>")
            x = sc.nextDouble()
            y = sc.nextDouble()
            radius = sc.nextInt()
            circles[i] = Circle(x, y, radius) //이렇게 추가했음ㅠㅠㅠㅠㅠㅠ
        }
        for(i in 0..2){
            circles[i]?.show()//세이프콜로 null일 경우를 방지
        }
    }
}

fun main() {
    val cm = CircleManager();
    cm.run();
}