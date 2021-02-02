package chap02

//아 이거 num1과 num3 사이에 num2를 놓는다고 다 되는게 아니구나
//num3<=num2<=num1일수도 있는데 까먹고있었음
//그래서 바꿔서 양쪽을 빼서 곱했을때 부호 음수인 경우로 하기로 했음 자바쪽에 풀어논것도 바꿔야겠다
import java.util.Scanner;

fun main() {
    print("정수 3개 입력>>")
    val sc = Scanner(System.`in`)
    val num1=sc.nextInt()
    val num2=sc.nextInt()
    val num3=sc.nextInt()
    val nums = arrayListOf(num1, num2, num3)
    var mid=num1
    if((num1-num2)*(num1-num3)<=0)
        mid=num1
    else if((num2-num1)*(num2-num3)<=0)
        mid=num2
    else
        mid=num3
    print("중간 값은 ${mid}")
}