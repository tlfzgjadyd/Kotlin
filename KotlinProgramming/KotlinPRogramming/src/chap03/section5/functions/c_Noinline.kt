package chap03.section5.functions

/* 인라인함수의 매개변수로 람다식을 사용하곤 하는데 그 람다식이 너무 길면 인라인 함수 코드가 너무 길게 대체되어서 망한다
   따라서 다른건 몰라도 일부 람다식 부분만 분기방식으로 호출하게 되게 하려면 noinline 키워드를 이용해야한다
   이를 이용할 경우 역컴파일 코드에서도 그부분만 복사되지 않았다는 것을 확인할 수 있다 show kotlin bytecode
 */
fun main() {
    shortFunc2(3) { println("first call: $it")}
    //예제대로 shortFunc라고 해주니까 앞의 b_inline과 충돌내길래 이름 바꿔줬음
}

inline fun shortFunc2(a:Int, noinline out: (Int)->Unit){ //람다식 인자인 out만 noinline으로 호출하는 상태
    println("Before calling out()")
    out(a)
    println("After calling out()")
}