package chap07.section1

/*이번 예제에서는 인터페이스를 다중상속 해볼거임
* Bird, Horse 인터페이스를 Pegasus클래스가 상속함
* 이 둘은 쉼표로 구분
* 
* 코드내에서 별난건 하나밖에 없음
* Bird 인터페이스에도 jump메소드 있고 Horse 인터페이스에도 jump 메소드 있으니까
* 둘중 어느쪽의 jump메소드를 사용할건지 super< 선택한클래스명 >.메소드명() 
* 이렇게 사용한 부분이 그것이다
*
* => 사용법 : super< 선택한클래스명 >.메소드명()
* */

interface Bird {
    val wings: Int
    fun fly()
    fun jump(){
        println("bird jump!")
    }
}

interface Horse{
    val maxSpeed: Int
    fun run()
    fun jump(){
        println("jump!, max speed: $maxSpeed")
    }
}

class Pegasus: Bird, Horse{
    override val wings: Int = 2
    override val maxSpeed: Int = 100
    override fun fly(){
        println("Fly!")
    }
    override fun run(){
        println("Run!")
    }
    override fun jump(){
        super<Horse>.jump() //상속받은 양측 인터페이스에 모두 jump메소드가 있으니까 어느쪽 메소드 쓸건지 지정
        println("Pegasus Jump!")
    }
}

fun main() {
    val pegasus = Pegasus()
    pegasus.fly()
    pegasus.run()
    pegasus.jump()
}