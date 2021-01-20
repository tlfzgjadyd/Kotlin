package chap07.section2

//실드 클래스를 선언하는 두 번째 방법
//이 경우에는 내부 클래스를 상속할때 점.표기법을 사용하지 않았다
//이전 파일에선 Result.Success("Status")였던 반면
//이번 파일에선 Success("Status")로 바로 접근하고 있다
//왜 이렇게 클래스를 묶어서 사용하는 것인가 : 

//실드 클래스는 특정 객체 자료형에 따라 when, is로 선택적 실행이 가능하다
//만약 이걸 이너클래스나 중첩클래스로 구현하려고 하면 모든 경우의수를 컴파일러가 판단할 수 없어 else문을 가져야 하는 반면
//실드 클래스를 사용하면 필요한 경우의 수를 직접 지정할 수 있고 모든 경우가 열거되었으므로 else문이 필요 없다

sealed class Result2

open class Success(val message: String): Result2()
class Error(val code: Int, val message: String): Result2()

class Status2: Result2()
class Inside2: Success("Status")

fun main() {
    //Success에 대한 객체 생성
    val result = Result.Success("Good!")
    val msg = eval(result)
    println(msg)
}
fun eval(result: Result): String = when(result){ //when과 is로 선택적인 식행이 가능하다 이건 마치 switch-case문이지
    is Status -> "in progress"
    is Result.Success ->result.message
    is Result.Error->result.message
    //모든 조건을 가지므로 else가 필요 없음
}