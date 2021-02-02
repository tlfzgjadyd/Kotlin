package chap06.section3

/* < 2. object 표현식 + 인터페이스 상속 >
* 이번 예제에서는 앞에서 말한 object 표현식 3가지 사용법중 2번째 방식을 사용할거임
* 딱 한번만 구현되는 인터페이스 구현 클래스를 정의하기 부담스러운 경우 다음과 같이 가능하다
* 라고 하는데 그냥 이전 예제에서 object 표현식으로 클래스 상속받고 오버라이딩 한거 대신에
* object 표현식으로 인터페이스 상속받고 오버라이딩이란 이름으로 구현한거다
* 
* 즉 object 표현식의 또다른 사용법인것*/

interface Shape{
    fun onDraw() //구현하고싶은 메소드
}

fun main() {
    val triangle = object: Shape{
        override fun onDraw() { //여기서 한번만 구현됨
            println("오버라이딩")
        }
    }
    
}