package chap05.section4

/*생성자의 호출과 실행 순서를 알아본다
* 호출=거슬러 올라감
* 실행=실제로 생성자 내부 실행
* 호출 순서와 실행 순서는 서로 반대임*/

open class Person{
    constructor(firstName:String){
        println("[Person] firstName: $firstName")
    }
    //거슬러 올라가기 순서3(호출순서3), 더이상 거슬러 올라갈게 없어서 실행순서1(생성자 실행순서3)
    constructor(firstName:String, age: Int){    //도착해서 더이상 거슬러 올라갈 곳이 없기에 그제서야 실행을 시작
        println("[Person] firstName:$firstName, $age")
    }
}

class Developer : Person{
    //거슬러 올라가기 순서1(호출순서1), 풀고 내려오며 실행순서3(생성자 실행순서3)
    constructor(firstName: String): this(firstName, 10){ //만약 전달인자로 이름만 넘기면
        println("[Developer] $firstName")     //이름만 받는 생성자측에서 알아서 이름,나이 생성자쪽으로 감
    }                                         //this를 상속받는것만 봐도 알 수 있음
    
    //거슬러 올라가기 순서2(호출순서2), 풀고 내려오며 실행순서2(생성자 실행순서2)
    constructor(firstName: String, age: Int): super(firstName, age){ //이름, 나이 생성자가 호출되자
        println("[Developer] $firstName, $age") //이쪽이 작동하는데 super을 상속받고 있으므로
    }                                           //기반 클래스의 super(firstName, age)와 시그니처 일치하는 곳으로 감
}

fun main() {
    val sean=Developer("Sean")
}