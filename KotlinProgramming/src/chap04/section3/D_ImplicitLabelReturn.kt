package chap04.section3

/*라벨명 따로 붙이기 귀찮을 경우에는 람다식 이름을 그대로 사용하는것도 가능*/

fun main() {
    retFunc3() //패키지내 이름 충돌 때문에 함수들에 3붙여줬음
}
fun inlineLambda3(a:Int, b:Int, out:(Int, Int)->Unit){//inline을 제거
    out(a,b)
}
fun retFunc3(){
    println("start of retFunc")
    inlineLambda3(13, 3){a, b->
        val result=a+b
        if(result>10)return@inlineLambda3 //라벨명 따로 선언 안하고 람다식 이름을 쓸 경우 람다식 끝으로 빠져나감
        println("result: $result")
    } //여기로 나온다
    println("end of retFunc3")//여기서부터 실행
}