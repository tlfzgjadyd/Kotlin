package chap04

import java.util.Scanner
class Circle2(val x:Double, val y:Double, val radius:Int){
    fun show(){
        println("(${x},${y})${radius}")
    }
}
class CircleManager2{
    fun run(){
        val sc = Scanner (System.`in`)
        var x:Double
        var y:Double
        var radius:Int
        val circles = arrayOfNulls<Circle2>(3);
        for(i in 0..2){
            print("x, y, radius>>")
            x = sc.nextDouble()
            y = sc.nextDouble()
            radius = sc.nextInt()
            circles[i] = Circle2(x, y, radius)
        }
        var c:Circle2 = circles[0]!!//null 아님을 확신시켜줘야됨
        for(i in 0..1){
            if(circles[i]?.radius!!< circles[i+1]?.radius!!)//세이프콜과 단정기호 둘 다 써야됨
                c = circles[i+1]!!; //getter setter 알아서 생긴댔는데 내가 명시호출로 함수 부르는게 아니라 변수 접근하면
                                    //내부적으로 getter setter 제공해주는 방식이라 getRadius()해도 없는 함수다
        }
        print("가장 면적이 큰 원은 (${c.x}, ${c.y})${c.radius}")
    }
}

fun main() {
    val cm = CircleManager2();
    cm.run();
}