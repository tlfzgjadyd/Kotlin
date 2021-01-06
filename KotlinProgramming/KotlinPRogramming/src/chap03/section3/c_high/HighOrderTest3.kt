package chap03.section3.c_high
//고차함수 : 인자와 반환값이 없는 람다식 함수

fun main() {
    val out: ()->Unit = {println("Hello World!")} //이 안에는 람다식이 들어있다고 한다
    val out2 = {println("Hello World!")}

    out() //out은 변수이지만 리턴 자료형이 람다 형태이므로 out역시 함수처럼 사용할 수 있다
    out2() //어짜피 전달인자도 없고 리턴하는 의미있는 값도 없었기에 이처럼 생략하는것도 가능
            //하지만 자바의 void와 달리 이건 뭔가 빈객체를 리턴하긴 한댔으므로 차이는 있다
    val new = out //이런식으로 람다식이 들어있는 변수를 다른 변수에 대입시
    new()        // 그 변수도 함수처럼 사용할 수 있게 된다
    
    //람다 형태의 리턴 자료형이긴 한데 println만으로 왜 람다식이 들어있단건지는 모르겠음
}
