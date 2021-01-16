package chap04.section3

/* 라벨 : 코드에서 특정 위치를 임의로 표시한것. @기호에 이름 붙여서 사용
   람다식에서 return은 return@label과 같은 라벨 표기와 함께 사용해야하며 break와 continue는 아직 지원되지 않는다
   
   그리고 여기서는 비지역 반환도 다루는데 return때문에 그 함수 통째로 탈출해버리면
   그 밑에있던 문장들에 도달하지 못하는 것을 의미한다
 */
fun main() {
    retFunc1()
}
inline fun inlineLambda1(a:Int, b:Int, out:(Int, Int)->Unit){
    out(a,b)
}

fun retFunc1(){
    println("start of retFunc")
    inlineLambda1(13,3){a,b->
        val result =a+b 
        if(result>10) return     //10보다 크면 retFunc 자체를 빠져나가기에 아래 2개 문장 도달하지 못함
        println("result:$result")//이런 경우를 비지역 반환이라 부른다
    }
    println("end of retFunc1")
}