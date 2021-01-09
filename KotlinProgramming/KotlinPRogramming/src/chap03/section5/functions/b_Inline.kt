package chap03.section5.functions

/*인라인 함수 :  이 함수가 호출되는 곳에 본문 복사해서 넣기에 함수 분기없이 순방향으로 처리됨
  함수 분기시 기존내용 저장했다 돌아오는데 컨텍스트 스위칭 오버헤드가 심함
  그렇기에 인라인 방식 사용시 코드 성능을 높일 수 있고 그대로 복붙하기에 짧게 작성해야 한다
  인라인 함수는 람다식 매개변수 가진 함수에서 동작함
  작성한 코틀린 코드를 역컴파일 하기 위해서는 Tools > Kotlin(맨 마지막줄) > Show Kotlin Bytecode > Decompile 에서 볼 수 있다
  그냥 show kotlin bytecode 검색해도 되긴함
  함수 본문이 복사된걸 확인해볼 수 있다
 */
fun main() {
    //인라인 함수 shortFunc()의 내용이 복사되어 shortFunc로 들어감
    shortFunc(3) { println("First call: $it") }
    shortFunc(5) { println("Second call: $it") }
}

inline fun shortFunc(a:Int, out: (Int) ->Unit){//fun 키워드 앞에 inline 키워드를 붙여준다
    println("Before calling out()")
    out (a)
    println("After calling out()")
}