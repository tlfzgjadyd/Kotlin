package chap06.section1

/*딱 getter setter의 역할만 할거라면 직접 정의하면 코드만 중복되기에 삭제할것이 권장되지만
* 만약 getter setter에 커스텀을 진행하고 싶을 경우 써도 상관 없음
* 여전히 getter setter 내부에는 field, value의 키워드만 사용해서 값을 할당해야하며
* 내부에 println을 사용하는 등의 자유로운 커스텀이 가능하다*/

class User4(_id: Int, _name: String, _age: Int){
    val id: Int = _id
    var name: String = _name
        set(value){ //이부분에 커스텀을 진행했다
            println("The name was changed") 
            field=value.toUpperCase() //받은 인자를 대문자로 변경해 프로퍼티에 할당
        }
    
    var age: Int = _age
}

fun main() {
    val user1=User4(1, "kildong", 35)
    user1.name="coco" //여기서 사용자 고유의 출력코드가 실행
    println("user3.name=${user1.name}")
}