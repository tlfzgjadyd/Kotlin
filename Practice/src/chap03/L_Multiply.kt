package chap03

import java.util.*

class Multiply{
    val sc = Scanner (System.`in`)
    var n = 0
    var m = 0
    fun run(){//아 코틀린 함수는 fun키워드로 시작하는거였지 자꾸 다른 언어랑 헷갈림
        while(true){
            print("곱하고자 하는 두 수 입력>>")
            try {
                n = sc.nextInt()
                m = sc.nextInt()
            }catch(e: InputMismatchException){ //아 일단 에러나는 화면에서 에러명 긁어오는건
                println("실수는 입력하면 안됩니다.") //맞는데 자바랑 달리 e:InputMismatch~로 가야했지
                sc.nextLine()//실수는 입력하면 안됩니다 무한루프 도는 에러가 있었음 이때 n=0 m=0으로
                            //초기화해보기도 했는데 안먹혔고 버퍼 문제라고 봤는데 자바처럼 nextLine으로 비우는거였다
                continue //catch블록 처리 후에도 제어는 밑으로 떨어지기에 continue 없으면 아래의 출력 실행함
            }
            println("${n}x${m}=${n*m}")
        }

    }
}
fun main() {
    val m = Multiply()
    m.run()
}