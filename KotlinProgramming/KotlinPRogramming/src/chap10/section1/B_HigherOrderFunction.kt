package chap10.section1

/* < 고차함수 >
* 고차함수 : 함수의 매개변수로 함수를 받거나 함수 자체를 반환하는 함수
* */

fun main() {
    fun inc(x: Int): Int {
        return x+1
    }
    fun high(name: String, body: (Int)->Int): Int{ //두번째 인자로 body라는 이름을 부여한 함수를 받고 있다, 그 함수는
                                                   //int형 전달인자를 하나 받아서 처리한 후 int형 반환값을 보내는 형태다
        println("name: $name")
        val x = 0
        return body(x)
    }
    val result = high("Sean", {x->inc(x+3)})//함수를 이용한 람다식
    val result2 = high("Sean") {inc(it+3)}//소괄호 바깥으로 빼내고 생략
    val result3 = high("Kim", ::inc) //매개변수 없이 함수의 이름만 사용할 때
    val result4 = high("Sean"){x->x+3} //람다식 자체를 넘겨준 형태
    val result5 = high("Sean") {it+3}//매개변수 1개인 경우 생략 가능

    //실습으로 안보고 함수를 받는 고차함수를 만들어보자
    fun practice( name: String, body : (Int)->Int ): Int{
        return 1;
    }
}