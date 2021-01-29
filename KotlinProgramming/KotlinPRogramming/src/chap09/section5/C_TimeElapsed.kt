package chap09.section5

/*진짜로 asSequence를 사용했을때 시간 성능이 좋아지는지 확인해볼거임
* 아래의 예제는 어떤식으로 되어있냐면
* - System.nanoTime()을 사용해 시간의 흐름을 재고
* - timeElapsed()메소드를 만들어서
*   인자로는 람다식으로된 2종류 체이닝 방식을 넘길거다
*   그리고 각각의 시간 경과를 잴거임
* => 결과 : asSequence() 사용하는 경우 비교적 짧은 시간에 수행된 것을 확인 가능
* 
* < 시퀀스 사용의 주의사항 >
* 작은 컬렉션에는 시퀀스를 사용하지 않는 것이 좋다
* 이유는 다음과 같음
* 1. filter 등은 인라인 함수로 설계되어 있는데 시퀀스 사용하면 람다식 저장객체로 표현되기 때문에 인라인이 안되기 때문
* 2. 한번 계산된 내용은 메모리에 저장되기 때문에 시퀀스 자체를 인자로 넘기는 형태는 사용하지 않는게 좋다
* 
* //+참고로 시퀀스 처리 현황은 Kotlin Sequence Debugger에서 확인 가능
* */

fun main() {
    val listBench = (1..1_000_000).toList()
    //1. 기본 체이닝 방식
    timeElapsed{
        listBench
            .map{it+1}
            .first{it%100==0}
    }
    //2. asSequence 체이닝 방식
    timeElapsed{
        listBench
            .asSequence() //2번째 방식에는 asSequence 문장을 추가
            .map{it+1}
            .first{it%100==0}
    }
}
fun timeElapsed(task: ()->Unit){ //전달인자로 각각의 체이닝 방식이 들어올거임
    val before = System.nanoTime()
    task()
    val after = System.nanoTime()
    val speed = (after-before) /1_000
    println("$speed ns")
}