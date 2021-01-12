package chap03.section5

/*익명함수 쓰다가 나오고 싶으면 return 쓰면 됨 (반환값 없이 return만)
  람다식을 익명함수 형태로 사용하여 인라인 함수의 매개변수로 넘겼을 경우 return을 사용하면
  본문에 return까지 같이 대체되기에 오히려 람다함수를 호출한 shortFunc3 함수까지 같이 빠져나가버린다
  이런 형태의 반환을 비지역 반환 non-local return 이라고 부른다
 */
fun main() {
    shortFunc3(3){
        println("First call : $it")
        return
    }
}
inline fun shortFunc3(a:Int, out: (Int)->Unit){
    println("Before calling out( )")
    out(a)                          //out 람다함수에서 return쓴것에 의해 비지역 반환이 일어나 shortFunc를 탈출하게 되어
    println("After calling out( )") //이 문장은 실행되지 않는다
}