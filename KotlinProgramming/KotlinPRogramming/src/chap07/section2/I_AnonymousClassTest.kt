package chap07.section2

/*코틀린에선 object 키워드를 통해 이와 같은 익명 객체를 만들 수 있다
* 아래의 예제에서는 Switcher 인터페이스를 만들고 이것을 구현하는 익명 객체를 만들어볼거다
* 원래라면 인터페이스를 구현하는 별도의 클래스를 만들어서 그 클래스의 인스턴스를 만들어서 변수에 할당했겠지만
* 익명객체를 사용할 경우 중간에 클래스 만드는 과정 없이 인터페이스->변수에 할당 하는걸로 바로 건너뛴다
* val 변수명 = object : Switcher {
*      본문, 오버라이딩을 통해 인터페이스를 구현
* }
* 이때 object : Switcher의 양식에서 알 수 있듯이 띄어쓰기가 콜론: 양옆으로 되어있으므로 이건 자료형이 아니라
* 상속의 의미이다 그러므로 이 문장의 의미는 지금부터 만들 익명 객체 object가 Switcher을 상속받는다는 의미이다
* 그래서 Switcher 인터페이스를 상속받는 익명객체 object를 변수에 할당한 것이 되는것이다
* */

interface Switcher{ //1. 인터페이스의 선언
    fun on(): String
}

class Smartphone3(val model: String){
    fun powerOn(): String{
        class Led(val color: String){
            fun blink(): String= "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher { //2. 익명 객체를 사용해 Switcher의 on()을 구현
            override fun on(): String{
                return powerStatus.blink()
            }
        } //익명(object)객체 블록의 끝
        return powerSwitch.on() //익명 객체의 메서드 사용
    }
}
