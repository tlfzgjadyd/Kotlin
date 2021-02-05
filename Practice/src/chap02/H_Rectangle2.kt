package chap02

//자바에서와 달라진점
//1. 함수에 public 안붙여도 되는데 리턴형은 전달인자 다음에 써야했음
//   평소에는 전달인자들이 짧으니까 거의 함수명이랑 비슷한곳에 있어서 함수명 옆에 쓰면 되는줄 알았는데 전달인자 옆이었음
//   순서 생각해보면 전달인자 받은 다음 리턴하는게 맞긴하지
//2. 리턴자료형 쓰더라도 val도 같이 써야됨
import java.util.Scanner;
fun main() {
    val sc = Scanner(System.`in`)
    print("점 (x,y)의 좌표를 입력하시오>>")
    val x: Int=sc.nextInt()
    val y: Int=sc.nextInt()
    val res: Boolean = inRect(x, y, 100, 100, 200, 200)
    if(res.equals(true))
        println("(${x},${y})는 사각형 안에 있습니다.")
    else
        println("사각형을 벗어났다")
    sc.close()
}
fun inRect (x: Int, y: Int,rectx1: Int,recty1: Int,rectx2: Int,recty2: Int):Boolean{
    if((x>=rectx1 && x<= rectx2) && ( y >= recty1 && y <=recty2 ))
        return true;
    else
        return false;
}