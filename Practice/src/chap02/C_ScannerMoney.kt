package chap02

import java.util.Scanner

fun main() {
    print("금액을 입력하시오>>")
    val sc = Scanner(System.`in`)
    var money = sc.nextInt()
    val num1=money/50000
    money-=(50000*num1)

    val num2=money/10000
    money-=(10000*num2)

    val num3=money/1000
    money-=(1000*num3)

    val num4=money/100
    money-=(100*num4)

    val num5=money/50
    money-=(50*num5)

    val num6=money/10
    money-=(10*num6)

    val num7=money

    println("오만원권 ${num1}매")
    println("만원권 ${num2}매")
    println("천원권 ${num3}매")
    println("백원권 ${num4}개")
    println("오십권 ${num5}개")
    println("십원권 ${num6}개")
    println("일원권 ${num7}개")
}