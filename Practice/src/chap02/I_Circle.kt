package chap02

import java.lang.Math.pow //pow는 java.lang 패키지쪽 Math,
import java.util.Scanner
import kotlin.math.sqrt //sqrt는 kotlin패키지쪽 Math를 사용
//왜 다른가 싶은데 pow가 kotlin쪽 패키지에도 있는데 뭐가 안맞나봄
fun main() {
    val sc = Scanner (System.`in`)
    print("원의 중심과 반지름 입력>>")
    val circleX = sc.nextInt()
    val circleY = sc.nextInt()
    val radius = sc.nextDouble()

    print("점 입력>>")
    val x = sc.nextDouble()
    val y = sc.nextDouble()

    var dist = sqrt(pow((x-circleX), 2.0)+pow((y-circleY), 2.0))
    if(dist <=radius)
        print("점 (${x}, ${y})는 원 안에 있다.")
    else
        print("밖에 있다.")
}