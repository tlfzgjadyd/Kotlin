package chap10.section1

/* << 코틀린의 표준 라이브러리 활용해 보기 >>
* < 확장 함수의 람다식 접근 방법 >
*    함수 이름        람다식의 접근방법      반환방법
* ____________________________________________________
* 1. T.let          it                  block 결과
* 2. T.also         it                  T caller (it)
* 3. T.apply        this                T caller (this)
* 4. T.run 또는 run  this                block 결과
* 5. with           this                Unit
*
* < let()함수 활용하기 >
* let()함수 : 함수 호출하는 T를 block의 인자로 넘기고 block의 결과 R 반환
*            let함수는 제네릭의 확장 함수 형태이므로 어디든 적용 가능
*            이때 this는 객체 T를 가리키며 이것은 람다식 결과 부분을 그대로 반환한다는 뜻이다
*            이 함수를 호출한 객체를 인자로 받으므로 이를 사용하여 다른 메소드를 실행하거나 연산을 수행해야 하는 경우 사용할 수 있습니다
*
* */

fun main() {
    val score: Int? = 32
    //val score = null
    
    //일반적인 null 검사
    fun checkScore() {
        if(score !=null){
            println("Score: $score")
        }
    }

    //let함수를 사용해 null 검사를 제거
    fun checkScoreLet(){
        score?.let{println("Score: $it") }//1.
        val str = score.let {it.toString()}//2.
        println(str)
    }
    checkScore()
    checkScoreLet()
}