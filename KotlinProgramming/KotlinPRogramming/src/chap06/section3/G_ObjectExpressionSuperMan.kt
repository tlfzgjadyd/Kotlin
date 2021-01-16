package chap06.section3

/* 책에 아무런 설명도 없이 그냥 쓰고봤지만 사실 지금부터는 object 표현식을 사용하는 3가지 방법을 배울거다
* < object 표현식 사용법 >
* 1. object 표현식 + 클래스 상속
* 2. object 표현식 + 인터페이스 상속
* 3. object 표현식만 사용하기
*
* < 사용법에 따른 효과 >
* 1. object 표현식 + 클래스 상속    -> 기반클래스의 함수를 오버라이딩 할 수 있음
* 2. object 표현식 + 인터페이스 상속 -> 인터페이스로 미구현된 함수를 구현할 수 있음
* 3. object 표현식만 사용하기       -> 클래스나 인터페이스 없이도 객체를 생성할 수 있음
* => 결국 3가지 방식 다 하위클래스를 별도로 정의하지 않고도 조금 변경된 객체를 얻어낼 수 있다는 특징을 가진다
*    1번 사용법의 경우 기반클래스의 파생클래스를 안만드는 것이고
*    2번 사용법의 경우 인터페이스를 구현할 클래스를 안만드는 것이고
*    3번 사용법의 경우 클래스 템플릿 없이도 특정 정보를 담는 객체를 만드는 것이다
*
* < object 표현식 사용법 >
* val 변수명 = object : 상속받을부모 {
*     override fun 함수명()=
* }
* 이때 상속받을부모 자리엔 기반클래스가 올 수도 있고 인터페이스가 올 수도 있으며
* 인터페이스가 오더라도 안에 있는 키워드는 그대로 override fun 함수명이 맞음
* 인터페이스의 함수를 최초 구현하는 것일지라도 어떻게보면 상속받은 함수내용 건드리는거니까 오버라이딩 맞긴 하지
* 만약 3번 사용법으로 object 표현식만 사용하고 싶은 경우에는 :상속받을부모 및 override 키워드 없이
* val 변수명 = object {
*    fun 함수명()=
* }
* 이런식으로 사용하면 된다
*
* < 1. object 표현식 + 클래스 상속 >
* 이번 예제에서는 첫번째 사용법을 쓸거임 object 표현식을 통해 하위클래스 생성 없이도 조금 변경된 객체를 얻어낸다
* 어떻게 하냐면 원하는 기반클래스를 object 표현식으로 상속받고 그 안에서 오버라이딩 하는것*/

open class Superman(){
    fun work() = println("Taking photos")
    fun talk() = println("Talking with peopel")
    open fun fly() = println("Flying in the air")
}

fun main() {
    val pretendedMan = object: Superman() { //1.object 표현식으로 익명 객체를 만든다 
        override fun fly() = println("I'm not a real superman. I can't fly!") //이 익명 객체는 Super 클래스를 상속하고
                                                                              //Super 클래스의 fly()를 오버라이딩 하고있음
                                                                              //즉 하위클래스 생성 없이 변경된 객체를 만든것
    }
    pretendedMan.work();
    pretendedMan.talk()
    pretendedMan.fly()
}