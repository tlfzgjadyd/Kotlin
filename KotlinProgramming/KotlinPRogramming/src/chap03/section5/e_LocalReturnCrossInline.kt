package chap03.section5


/*만약 shortFunc3이 inline으로 선언되지 않았을 경우 return문은 람다함수 본문에 사용될 수 없다는 에러가 난다고함
  이유는 모르겠음 람다식에서도 return 썼었던것같은데 받은 함수 형태가 달라서 그런가
  어쨌든 비지역 반환은 의도한 형태가 아니기 때문에 비지역 반환을 금지하는 방법이 있다
  이때 crossline 키워드를 사용하고 이 키워드를 비지역 반환을 금지해야하는 람다식 앞에 붙여주면 된다
  그럼 매개변수 람다식에 return 사용하는 단계에서부터 컴파일 오류를 내준다*/

fun main() {
    shortFunc4(4){
        println("First call: $it")
        //return 사용 불가
    }
}

inline fun shortFunc4(a: Int, crossinline out : (Int)->Unit){
    println("Before calling out()")
    nestedFunc {out(a)}
    println("After calling out() ")
}
fun nestedFunc(body: ()->Unit){ //실제로는 이 중첩함수 써서 return 관련 비슷한 효과를 내겠지 지금은 알 바 아님
    body()
}