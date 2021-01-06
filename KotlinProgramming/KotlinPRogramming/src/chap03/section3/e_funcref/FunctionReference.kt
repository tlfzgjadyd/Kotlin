package chap03.section3.e_funcref


fun main() {
    //1. 인자와 반환값이 있는 함수
    val res1 = funcParam(3, 2, ::sum)
    println(res1)
    //2. 인자가 없는 함수 (이 항목의 3줄은 다 같은 결과를 출력한다 )
    hello(::text)
    hello({a, b->text(a,b)}) //람다함수가 아닌 text함수를 전달하기 위해 a,b,text를 조합해 즉석에서 람다를 만들음
    hello{a, b->text(a,b)}   //호출소괄호를 생략해도 같은 효과를 낸다
    //3. 일반 변수에 값처럼 할당
    val likeLambda = ::sum
    println(likeLambda(6, 6))
}
/*그리고 자꾸 함수들 선언이 메인함수 아래에 있는데
  이렇게 메인 흐름먼저 작성해놓고 없는함수 빨간표시 된거 나중에 생각하며 작성하는게 더 자연스러운 흐름이라 그렇게한듯*/
fun sum(a:Int, b:Int) =a+b
fun text(a:String, b:String) = "Hi! $a $b"
fun funcParam(a:Int, b:Int, c:(Int, Int)->Int):Int{
    return c(a,b)
}
fun hello(body:(String, String)->String) : Unit{
    println(body("Hello", "World"))
}