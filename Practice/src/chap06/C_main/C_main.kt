package chap06.C_main

import chap06.C_etc.Calc //내가 안해도 알아서 import되네 모든 패키지 순서대로 다써서
//C_etc 패키지까지 온 후 내가 쓰고자 하는 클래스인 Calc를 import했음

fun main() {
    val c = Calc(10, 20)
    println(c.sum())
}