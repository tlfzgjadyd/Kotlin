package chap06.section2

/*이번엔 lateinit 키워드를 통해 객체 생성시 지연 초기화를 사용할거임
* 어떤 변수에 어떤 클래스 객체를 할당할거란것만 알려줘놓고
* 실제로 객체를 생성하는건 나중으로 미루는것
* 객체 생성이 미뤄지면 당연히 객체 초기화도 미뤄지기에 lateinit이라는 용어도 이상하지 않음*/

data class Person2(var name: String, var age: Int)

lateinit var person1: Person2 //1. 객체 생성의 지연 초기화,
                              //person1 변수에 객체를 할당할 예정이란것만 알려주고 실제 객체생성은 미룬다
                              //객체 생성이 미뤄지기에 당연히 객체 초기화도 미뤄짐

fun main() {
    person1 = Person2("Kildong", 30) //2. 실제로는 여기에서 생성자 호출되는 시점에 초기화됨
    println(person1.name + " is "+person1.age.toString()) //위에서는 person1 변수에 Person2클래스 객체를 
                                                          // 할당할거란것만 말해놓고 객체 생성을 지연한것
}