package chap10.section1

import java.io.File

/*< also함수 >
* also는 let과 역할이 거의같고 반환하는 값만 다름
* let : 마지막으로 수행된 코드 블록의 결과를 반환
* also : 블록 안의 코드 수행 결과와 상광없이 T인 객체 this를 반환
*
* 그리고 추가적으로
* let : person객체에서 skills변경하고 마지막 표현식인 "success"를 반환해 a에 할당하는 반면
* also : 람다식이 본문 처리하지만 마지막 표현식이 b에 할당되는게 아니라 person객체 자신에게 할당됨
*        따라서 b는 Person객체 person을 반환하고 새로운 객체 b가 할당되어 만들어진다
*  */

fun main() {
    //1.let방식
    data class Person(var name : String, var skills: String)
    var person = Person("Kildong", "Kotlin")
    val a = person.let{
        it.skills = "Android"
        "success" //마지막 문장을 결과로 반환
    }
    println(person)
    println("a: $a") //String

    //2. also방식
    val b = person.also{
        it.skills = "Java"
        "success"//마지막 문장은 사용되지 않음
    }
    println(person)
    println("b: $b") //Person의 객체 b
}
//기존의 디렉터리 생성함수
fun makeDir1(path: String): File{
    val result = File(path)
    result.mkdirs()
    return result
}
//위의 함수를 let과 also로 개선
fun makeDir2(path: String) = path.let { File(it) }.also{it.mkdirs()}