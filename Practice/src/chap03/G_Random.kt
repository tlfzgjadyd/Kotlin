package chap03

import kotlin.random.Random //특이하게 random 2번 나오는거였지
fun main() {
    var sum=0
    print("랜덤한 정수들 : ")
    for(i in 1..10){
        var num = Random.nextInt(10)+1 //사용법 기억하기, 자바와 달리 괄호에 마지막값 넣고
        sum+=num                            //+보정되는거 생각 없이 그대로 써야됨
        print("${num} ")
    }
    print("평균은 ${sum/10.0}")
}