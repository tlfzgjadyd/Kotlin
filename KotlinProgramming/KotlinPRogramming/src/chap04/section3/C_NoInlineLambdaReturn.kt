package chap04.section3

/*return때문에 아래 문장들에게 도달하지 못했던 이전 사례가 있었음
  그때와 같은 비지역 반환을 방지하고 가장 가까운 retFunc 위치로 빠져나가게 하려면 람다식에서 라벨을 정의해
  return을 사용해야한다 먼저 라벨을 지정하려면 at@기호를 라벨 뒤에 붙여서 return@라벨명 으로 지정해야한다
  
  라벨 사용법
  1. 라벨로 이동하고싶은 { }중괄호 시작부분에 라벨명@{}로 라벨명과 @ at기호 붙여줌
  2. return@라벨명
  3. 그럼 그 라벨 끝으로 이동한다
  */

fun main() {
    retFunc2() //패키지내 이름 충돌 때문에 함수들에 2붙여줬음
}

fun inlineLambda2(a:Int, b:Int, out:(Int, Int)->Unit){//inline을 제거
    out(a,b)
}
fun retFunc2(){
    println("start of retFunc")
    inlineLambda2(13, 3) lit@{ a, b-> //1. 람다식 블록의 시작 부분에 lit@로 라벨을 지정
        val result = a+b
        if(result>10) return@lit //2. 라벨을 사용한 블록의 끝부분으로 반환
        println("result: $result") 
    } //여기로 빠져나감
    println("end of retFunc2") //여기서부터 다시 실행
}