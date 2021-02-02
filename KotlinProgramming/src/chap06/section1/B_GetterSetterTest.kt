package chap06.section1

/*이번엔 클래스 내에 프로퍼티 초기화하는걸 간략화하는걸 배울거임
* 이번에도 show Kotlin ByteCode로 역컴파일 열어보면 User2에도 알아서 getterSetter 생겨있는걸 볼 수 있다
* 이처럼 작성해야할 코드가 줄어들고 가독성이 좋아졌음
* 
* 여기서도 수정 불가한 val은 getter만 생성되고
* var은 getter setter 둘 다 생긴다*/

//1. 주 생성자에 3개의 매개변수 정의하는 방식
class User1(_id: Int, _name: String, _age: Int){
    //프로퍼티
    val id: Int= _id //불변(읽기 전용)
    var name: String = _name //변경 가능
    var age: Int = _age //변경 가능
}

//2. 위의 표현은 아래와 같이 간소화할 수 있다
class User2(val id: Int, var name: String, var age: Int)
/////////////////////////////////////////////////////////////
fun main() {
    val user=User1(1, "Sean", 30)
    val name = user.name //게터에 의한 값 획득
    user.age=41 //세터에 의한 값 지정
    println("name: $name, ${user.age}")
}