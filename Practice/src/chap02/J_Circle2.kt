package chap02

import java.util.Scanner
import java.lang.Math.pow //이상하게 double만 되네 int안되고
import kotlin.math.sqrt

fun main() {
    val sc = Scanner (System.`in`)
    print("첫번째 원의 중심과 반지름 입력>>")
    val x1 = sc.nextDouble()
    val y1 = sc.nextDouble()
    val r1 = sc.nextDouble()
    print("두번째 원의 중심과 반지름 입력>>")
    val x2 = sc.nextDouble()
    val y2 = sc.nextDouble()
    val r2 = sc.nextDouble()

    if(sqrt(pow((x1-x2),2.0)+pow((y1-y2),2.0))<=(r1+r2))
        print("두 원은 서로 겹친다.")
    else
        print("안겹친다.")
}