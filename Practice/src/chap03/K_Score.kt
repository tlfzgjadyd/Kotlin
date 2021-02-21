package chap03

import java.util.Scanner
fun main() {
    val course = arrayOf("Java", "C++", "HTML5", "컴퓨터구조", "안드로이드");
    val score = arrayOf(95, 88, 76, 62, 55);
    val sc = Scanner (System.`in`)
    var name:String
    var flag = false
    while(true){
        print("과목 이름>>")
        name = sc.next()
        if(name=="그만")
            break
        for(i in 0..course.size-1)
        {
            if(course[i]==name)
            {
                flag = true
                println("${name}의 점수는 ${score[i]}")
            }
        }
        if(flag==false)
            println("없는 과목입니다.")
    }
}