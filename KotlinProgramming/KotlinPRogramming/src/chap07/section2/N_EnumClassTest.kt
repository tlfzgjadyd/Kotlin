package chap07.section2

/*이번엔 열거형 클래스로 인터페이스의 메소드를 구현하는걸 해본다
* Score 인터페이스를 MemberType이라는 열거형 클래스에서 구현할거임
* 이때 일반 구현과 다른점은 열거형 상수들 각각에 구현한다는 점이다
* 만약 열거형 클래스가 인터페이스를 상속받았는데도 불구하고
* 일부 열거형상수는 메소드를 구현하지 않을 경우 그 상수는 에러가 뜬다*/

interface Score{
    fun getScore(): Int
}

enum class MemberType(var prio: String) : Score { //1. Score를 구현할 열거형 클래스
    NORMAL("Third"){
        override fun getScore(): Int = 100 // 2. 열거형 상수 각각에 메소드를 구현해야 한다
    },
    SILVER("Second"){
        override fun getScore(): Int = 500 //3. 인터페이스 상속받았는데 어떤 열거형 상수는 구현하지 않을 경우
    },
    GOLD("First"){
        override fun getScore(): Int = 1500 //4. 그 열거형 상수는 에러가 난다
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)

    for(grade in MemberType.values()){ // 모든 값을 가져오는 반복문
        println("grade.name=${grade.name}, prio = ${grade.prio}")
    }
}