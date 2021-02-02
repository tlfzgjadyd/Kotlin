@file:JvmName("PKLevel") //자바측에서 코틀린의 최상위함수 갖다쓸때 다른 이름으로 갖다쓰려고 추가했음
                               // @file:JvmName("새로사용할이름")
package chap06.section3

fun packageLevelFunc2(){
    println("Package-Level Function")
}

fun main() {
    packageLevelFunc2()
}