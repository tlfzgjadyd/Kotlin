package chap10.section1

/*실습 시작한 이후로 뭔가 너무 형식적인 것에만 얽매인것같음
* 모든 예제를 쓸필요는 없는건데
* 그리고 함수들 정체 모르는것만 자세히 실습하면 됐지
* 이미 대강 아는것들까지 하는건 시간대비 효율이 그리 크지 않은것같음
* 어짜피 코틀린 단원 끝나고 앱 단원 시작하기까지 얼마 남지 않긴 했는데
* 핵심적인거나 중요한거 위주로 하는게 좋지 않을까함
* 다써봤자 따로 외우는거 아니면 기억도 못할거면서
* 개념도 검색 가능할 정도로만 쓰면 되는건데 너무 다쓰고있었음 책을 아예 타이핑하겠네
* 솔직히 let also apply 이때쯤에 진도 나가는 속도 느려지고 뭔가 흐지부지 되기 시작해서 잘모름
* 그렇다고 이부분 안했을때 이후의 진도에 치명적인 문제가 되는것도 아님
* 그러므로 과감하게 제낀다
* 나중에 필요하면 다시 돌아오면됨 대강 뭐있는지만 알아놓고 깊은이해는 제껴놓는게 나을듯
* 이 구간에 들어와서부터 흥미 급감해서 좀 상태안좋음
* 그러므로 466p~10.2단원(481p)까지는 내용을 대강 담기로 하고
* 10-3 io하는 부분부터는 다시 흥미가 생기길 바람
* 
* < apply함수 >
* apply함수는 특정 객체를 생성 동시에 호출해야 하는 초기화 코드가 있는 경우 사용할 수 있다
* 이전에 배운 also랑은 객체 넘겨받는 방식이 다른데 얘는 it을 생략할수가 있다
* also는 생략 못함
* 대강 레이아웃 초기화, 디렉터리 생성하는 등에 이용하는듯
*
*
* 
* */

fun main() {
    data class Person(var name: String, var skills : String)
    var person = Person("Kildong", "Kotlin")
        person.apply{this.skills = "Swift"} //여기서는 this는 person 객체를 가리킴
    println(person)
    
    val returnObj = person.apply{
        name = "Sean" //this는 생략할 수 있음
        skills = "Java" //this 없이 객체멤버에 여러번 접근 가능
    }
}