package chap04.section3

/* 람다식 대신 익명함수 넣을 경우 라벨 사용하지 않아도 가까운 익명함수 자체가 반환되므로 같은 결과가 나온다
 */
fun main() {
    retFunc4() //패키지내 이름 충돌 때문에 함수들에 4붙여줬음
}
fun inlineLambda4(a:Int, b:Int, out:(Int, Int)->Unit){
    out(a,b)
}
fun retFunc4(){
    println("start of retFunc")
    inlineLambda4(13, 3, fun(a, b){ //세번째 전달인자를 fun키워드만 쓰고 함수명 없는 익명함수로 줬음
        val result=a+b
        if(result>10)return //라벨명 따로 선언 안하고 람다식 이름을 쓸 경우 람다식 끝으로 빠져나감
        println("result: $result")
    }) //여기로 나온다, 람다 아니기에 inlineLambda의 전달인자 닫는 마지막 괄호가 여기에 와야됨
    print("end of retFunc4")//여기서부터 실행
}