package chap06.section2

/*아래는 observable() 함수 예제이다
  observable()함수는 특정 변수에 값의 변경이 일어나는지 감시하다가
  값에 변경이 일어날 경우 observable 함수 본문을 실행하는 함수이다
  특정 변경 이벤트에 따라 호출되기에 콜백이라고도 부름
  (import로 Delegates를 가져와야함에 주의)

* User 클래스의 nane 프로퍼티를 observable 함수로 위임하고
* name변수에 값의 변경이 일어날 경우 observable 함수 내부의 본문을 실행한다*/

import kotlin.properties.Delegates

class User{
    var name: String by Delegates.observable("NONAME") {//1. 프로퍼티 위임
            prop, old, new -> //2. 람다식 매개변수로 프로퍼티, 기존 값, 새로운 값 지정
        println("$old->$new") //3. 이 부분은 이벤트가 발생할 떄만 실행
    }
}

fun main() {
    val user = User()
    user.name = "Kildong" //4.값이 변경되는 시점에서 첫 이벤트 발생
    user.name="Dooly" //5. 값이 변경되는 시점에서 두 번째 이베늩 발생
}