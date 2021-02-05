package chap02

import java.util.Scanner;
fun main() {
    val sc = Scanner(System.`in`)
    print("점 (x,y)의 좌표를 입력하시오>>")
    val x = sc.nextInt()
    val y = sc.nextInt()

    if((100<=x&&x<=200)&&(100<=y&&y<=200))
        print("(${x},${y})는 사각형 안에 있습니다.")
    else
        print("사각형 범위에 없습니다")
}