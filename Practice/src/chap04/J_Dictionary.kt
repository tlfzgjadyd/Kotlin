package chap04

import java.util.Scanner
class Dictionary{
    companion object{
        val sc = Scanner (System.`in`)
        val kor = arrayOf("사랑", "아기", "돈", "미래", "희망")
        val eng = arrayOf("love", "baby", "money", "future", "hope")
        fun kor2Eng(word:String){
            var index = -1
            for(i in 0..kor.size-1){
                if(kor[i]==word)
                    index = i
            }
            if(index==-1)
                println("${word}는 저의 사전에 없습니다.")
            else
                println("${word}은 ${eng[index]}")
        }
        fun run(){
            println("한영 단어 검색 프로그램입니다.")
            var select=""
            while(true){
                print("한글 단어?")
                select = sc.next()
                sc.nextLine()
                if(select=="그만")
                    System.exit(0)
                kor2Eng(select)
            }
        }
    }
}

fun main() {
    Dictionary.run()//static에 해당하는 companion object 사용할때도 클래스명::이 아니라 일반함수처럼 .으로 호출한다
}