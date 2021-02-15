package chap03

import java.util.Scanner
fun main() {
    val sc = Scanner (System.`in`)
    print("양의 정수 10개를 입력하시오>>")
    val arr = arrayOf<Int>(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
        sc.nextInt(),sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt())
    print("3의 배수는 ")
    for(i in 0..arr.size-1){ //..타입 범위는 양끝 포함이기 때문에 arr.size쓰면 에러남 -1해서 써야됨
        if(arr.get(i)%3==0)//아무래도 배열 사용법이 어려워졌다 생각했는데 get, set을 통해
            print("${arr.get(i)} ") //값넣고 가져오는 방식으로 바뀌었나봄
    }
}