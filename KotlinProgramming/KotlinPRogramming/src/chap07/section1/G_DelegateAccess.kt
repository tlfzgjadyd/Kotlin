package chap07.section1

/*실제 코드에서 위임된 코드에 요소를 접근하는걸 해볼거임*/
interface Nameable{
    var name: String
}

class StaffName : Nameable{
    override var name: String = "Sean"
}

class Work: Runnable{ //스레드 실행을 위한 인터페이스
    override fun run(){
        println("work...")
    }
}

//1. 각 매개변수에 해당 인터페이스를 위임
class Person(name: Nameable, work: Runnable): Nameable by name, Runnable by work
//원랜 왼쪽에 변수 있으면 그 변수에게 우항의 클래스 내용을 위임하여 바로 사용할 수 있게 하는것으로 형태는
// int A : B by C 로 B C가 기반,파생 관계였는데
// 이건 왼쪽에 클래스가있음 그래서인지 뭔지 name과 work에 위임됨 
// 아니 뭐야 이게 대체 by 양옆에 오는 것들 관계가 전이랑 다르잖아
// 뭐가됐든 이런식으로 하면  Person클래스의 인스턴스는 바로 위임된메소드에 접근 가능이라함
// 위임이 정확히 뭐 어떤식으로 되는건지 모르갰음 나중에 추가로 찾아봐야할듯

fun main() {
    val person = Person(StaffName(), Work()) //2. 생성자를 사용해 객체 바로 전달
    println(person.name) //3. 여기서 StaffName 클래스의 name 접근
    person.run() //4. 여기서 Work 클래스의 run 접근
}