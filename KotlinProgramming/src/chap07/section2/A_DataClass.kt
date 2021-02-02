package chap07.section2

/*< 클래스의 여러가지 형태 >
* 보통 클래스는 속성과 동작을 표현하기 위해 프로퍼티, 메서드를 멤버로 가지는데
* 동작 안가지고 데이터 저장용도로만 사용되는 클래스의 경우 클래스 구현부가 필요없다
* 이 구현부를 없애면 메모리 절약도 가능하기에 코틀린에서는 데이터 클래스라는걸 제공함
* 이것 외에도 다양한 목적에 맞게 개편된 실드 클래스, 이너 클래스, 열거 클래스 등이 있다
* 앞으로 이 다양한 클래스들에 대해서 알아볼거고 우선은 데이터 클래스부터 알아볼거임
*
* < 데이터 클래스 >
* DTO (data transfer obejct) = 데이터 전달을 위한 객체
* DTO는 구현 로직 없고 순수한 데이터 객체를 표현하기 때문에 getter, setter, toString, equals 등을 가진다
* 자바에선 이것들 구현하려면 많은 줄의 소스코드가 필요했음 
* 하지만 코틀린은 내부적으로 이것들이 모두 자동 생성되기에 매우 간략하게 표현 가능하다!
* 
* < 코틀린에서 내부적으로 생성되는 메소드들 >
* 1. getter setter
* 2. toString
* 3. equals, hashCode
* 4. copy (객체 복사가 가능하며 일부 프로퍼티는 값 바꿔서 복사해올 수 있음)
* 5. 프로퍼티에 상응하는 component1(), componene2()등 이라는데 뭔소린지 모르겠음 뒤에 가면 나오겠지
* => componentN()을 통해 객체의 N번째 프로퍼티를 뽑아올 수 있고 이때 N에는 숫자가 오게 된다
* 
* < DTO를 사용해야하는 이유 >
* DTO를 사용해야 하는 이유는 전달 객체의 표준을 따를 경우 전달하고 받는것이 쉽기 때문이다
* 데이터 주고받는 일은 자주 일어나는데 프로그램을 좀 더 구조적으로 만들게 되면 MVC (모델 뷰 컨트롤러) 구조로 나뉘게 되고
* 이때 DTO는 이들간에 데이터가 오가는 표준 형태가 된다
* 
* < 데이터 클래스 선언하기 >
* 데이터 클래스를 선언할때는 data 키워드를 사용한다
* ex) data class 클래스명(var name : String, var email: String)
* 
* < 데이터 클래스가 만족해야하는 조건들 >
* 1. 주 생성자는 최소 한개 이상의 매개변수를 가져야됨
* 2. 주 생성자의 모든 매개변수는 val, var로 지정된 프로퍼티여야 한다
* 3. 데이터 클래스에는 abstract, open, sealed, inner 키워드를 사용할 수 없다
*    (오로지 데이터 기술하는 용도로만 사용됨, 하지만 필요하다면 추가로 부생성자나 init 블록으로 간단한 로직정도는 포함할 수 있음)
* 
* < 데이터 클래스가 자동 생성하는 메소드들의 기능 >
* 1. equals() : 두 객체의 내용이 같은지 비교, ==표현은 내부적으로 equals를 호출한다
* 2. hashCode() : 객체 고유의 해시값 생성, 두 객체 값이 같으면 해시값도 같은 정수로 생성됨
* 3. copy() : 복사는 복사인데 특정 프로퍼티는 값을 변경해서 객체 복사하기
* 4. toString() : 문자열로 변환
* 5. componentN() : 객체의 선언부 구조를 분해하기 위해 프로퍼티에 상응하는 메소드
*                   디스트럭처링 할때 N번째 프로퍼티를 가져오고 싶으면 객체명.componentN()하면 된다
* */

data class Customer(var name: String, var email: String){
    var job: String = "Unknown"
    constructor(name: String, email: String, _job: String) : this(name, email){
        job=_job
    }
    init{
        //간단한 로직은 여기에
    }
}

fun main() {
    val cus1=Customer("Sean", "sean@mail.com")
    val cus2=Customer("Sean", "sean@mail.com")

    println(cus1==cus2)//내부적으로 equals를 호출
    println(cus1.equals(cus2))//위와 같은 표현식임
    println("${cus1.hashCode()}, ${cus2.hashCode()}") //두 객체 값이 같기에 해시값이 동일하게 생성됨
    
    val cus3 = cus1.copy(name="Alice")//name만 변경하고자 할때, 즉 copy는 복사하지만 일부 프로퍼티 값은 바꾼채로 복사하고 싶을떄 사용
    println(cus1.toString())
    println(cus2.toString())
    println(cus3.toString()) //cus3만 이름이 다르게 출력됨을 확인할 수 있다
}