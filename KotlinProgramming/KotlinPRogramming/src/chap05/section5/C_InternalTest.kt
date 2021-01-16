package chap05.section5

/*이번 실험에선 자바에선 없던 internal을 알아볼거임
* internal은 모듈을 의미하기에 같은 모듈일 경우 접근 가능
* 자바에선 pacakge라는 가시성 지시자를 통해 같은 패키지 내에 있을 경우 접근 가능케 했었음
* 반면 코틀린에선 internal이라는 가시성 지시자를 통해 같은 모듈 내에 있을 경우 접근 가능케 한다
* 
* 왜 이런 변경을 했냐면 기존 자바의 방식대로 패키지 단위로 할 경우
* 프로젝트가 달라도 패키지명이 같을 경우 접근이 가능했기에
* 프로젝트 단위인 .jar 파일이 달라져도 다른 .jar에서 접근이 가능해서 보안 문제가 있었다
* 그래서 코틀린에서는 package를 버리고 internal로 빌드된 하나의 묶음이 아니면 접근 불가능하게 했음
* 
* 어쨌든 지금 여기에 생성해둔 InternalClass라는 클래스를 같은 모듈 내에 있는 다른 파일인
* InternalTestOtherFile에서 접근해볼거다*/

internal class InternalClass{
    internal var i = 1
            internal fun icFunc(){
                i+=1 //접근 허용
            }
            fun access(){
                icFunc()//접근 허용
            }
}

class Other{
    internal val ic = InternalClass() //프로퍼티를 지정할 떄 internal로 맞춰야 함
    fun test(){
        ic.i //접근 허용
        ic.icFunc() //접근 허용
    }
}

fun main(){
    val mic = InternalClass() //생성 가능
    mic.i //접근 허용
    mic.icFunc() //접근 허용
}