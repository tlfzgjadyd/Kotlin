package chap06.section3

/* < object와 싱글톤 >
* 내용이 조금 변경된 클래스를 만들어야할 경우 기본적으론 상위클래스에서 하위클래스 새로 선언해서 만드는데
* 하위클래스 새로 선언하지 않고도 변경된 객체를 생성하고 싶은 경우 자바에서는 익명 내부 클래스를 사용한다
* 코틀린에서도 같은 방식으로 가능하지만 코틀린에서는 object 표현식이나 object 선언으로 더 쉽게 하는게 좋다 
* 
* < object란 무엇인가 >
* object 키워드를 class 키워드 대신 사용할 경우 정적 클래스같은 느낌으로 만들 수 있다
* 왜 책에선 뭔지도 안알려주고 걍 예제부터 들어가는거임
* object 키워드가 뭐하는앤지 특징은 뭔지 그냥 막써놓은거 정리하느라 힘들었음
* 아래의 특징은 정제하고 순서 재배치하는거 힘들었으니까 반드시 보존해둘것
* object는 컴패니언 객체쪽에서도 만났었지 companion object 키워드를 사용해서 컴패니언 객체를 만들었었음
* 이번 예제에서는 object 키워드로 클래스 만든 방식인 OCustomer 클래스와
* 클래스 내부에 컴패니언 객체를 사용해서 만든 방식인 CCustomer 클래스를 비교해볼거임
* 
* < object 특징 >
* 1. 정적 클래스같은 느낌으로 만들어지는거라 따로 객체를 생성하지 않아도 멤버 프로퍼티와 메소드를 바로 가져다 쓸 수 있다
* 2. 따로 생성자를 호출하지 않고 클래스 접근 시점에 객체가 생성됨
* 3. 그래서 주생성자나 부생성자는 사용이 불가능한데 클래스 상속이나 인터페이스 상속은 정상적으로 가능함
* 4. 만약 안에 init블록이 있을 경우 최초 접근시에 실행되며
* 5. 단일 인스턴스를 생성하는 싱글톤 패턴이 사용되었다
* 
* < object방식과 companion object 방식의 공통점과 차이점 >
* 공통점 : 둘 다 객체 생성 전에 접근해서 사용 가능한 정적 방식이다
* 차이점 : object 방식은 class 키워드 대신해서 사용하는 반면 companion object의 경우 겉을 class 키워드로 감싸준다는 차이점이 있다
* */

//1. object 키워드를 사용한 방식
object OCustomer { //object를 사용한 방식의 경우 별도의 class키워드는 사용되지 않음 class 키워드 대신 사용되는 느낌
    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init{
        println("Init!")
    }
}

//2. 컴패니언 객체를 사용한 방식
class CCustomer {   //반면 companion object를 사용한 방식에선 class 키워드를 통해 전체를 감싸주며
    companion object { //내부에 companion object를 사용해서 내용을 감싸준다
        const val HELLO = "hello" //상수 표현
        var name = "Joosol"
        @JvmField val HOBBY = Hobby("Football")
        @JvmStatic fun greeting() = println("Hello World!")
    }
}

class Hobby(val name: String)

fun main() {
    OCustomer.greeting() //객체의 접근 시점
    OCustomer.name="Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}