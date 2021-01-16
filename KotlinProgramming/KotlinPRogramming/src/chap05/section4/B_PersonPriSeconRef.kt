package chap05.section4

class Person2(firstName: String, out: Unit=println("[Primary Constructor] Parameter")){
                                //out이라는 인자에 접근시 문구가 출력됨
    val fName = println("[Property] Person fName: $firstName")

    init{ //아무리 init블록일지라도 위에 있는 흐름 먼저 실행하고 내려옴
        println("[init] Person init block")
    }

    constructor(firstName: String, age: Int,
                out: Unit=println("[Secondary Constructor] Parameter")): this(firstName){
                    println("[Secondary Constructor] Body: $firstName, $age")
                }
}

fun main() {
    //1. 주생성자 사용해서 호출시 전달인자-순서대로-init
    val p1=Person2("Gildong")
    
    //2. 부생성자 사용해서 호출시 전달인자-거슬러올라가서 전달인자-본문 순서대로-init-내려와서 본문
    val p2=Person2("Kildong", 30)
    println()

    //=>즉 결론은 실행순서는 전달인자>거슬러올라간곳의 전달인자>거슬러 올라간곳의 본문(순서대로)>타고 내려와서 본문
}