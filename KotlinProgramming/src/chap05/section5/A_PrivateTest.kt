package chap05.section5

/*코틀린에는 4종류의 가시성 지시자가 있다
* 1. private
* 2. public (기본값
* 3. proteted (자식은 가능)
* 4. internal (같은 정의의 모듈 내부에선 접근 가능
* 
* 이때 만약 가시성 지시자를 주 생성자 앞에 사용하려는 경우 constructor 키워드를 생략할 수 없다
* 
* 이번 실험에서는 private를 다룰건데 핵심 내용은
* private class일 경우 val opc = PrivateClass()같이 변수에 할당할 떄에도 
* 변수 앞에 private 붙여서 private val opc = PrivateClass() 이런식으로 해야만 생성 가능하단 점이다*/

private class PrivateClass{
    private var i = 1
    private fun privateFunc(){
        i+=1 //접근 허용
    }
    fun access(){
        privateFunc() //접근허용
    }
}

class OtherClass{
    //val opc = PrivateClass() //불가 - 프로퍼티 opc는 private이 되어야함
    private val opc = PrivateClass() //이건 가능
    fun test(){
        val pc = PrivateClass() //생성 가능
    }
}

fun main() {
    val pc = PrivateClass() //생성 가능
    //pc.i//접근 불가
    //pc.privateFunc() //접근 불가
}
fun TopFunction(){
    val tpc = PrivateClass()//객체 생성 가능
}