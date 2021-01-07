package chap03.section5.functions

//fun(x: Int, y: Int): Int = x+y //함수 이름이 생략된 익명 함수의 형태
//익명함수는 일반 함수이지만 이름이 없는 것이다
//이 줄은 에러나서 주석으로 막음 왜냐하면 함수 정의부에 쓰는게 아니라 저런 형태로 함수 필요한 곳에 바로 놓는것이기 때문이다

fun main() {
    val add1 : (Int, Int) ->Int = fun(x,y) = x+y //익명 함수를 사용한 add tjsdjs
    val result = add1(10, 2) //add1의 사용
    val add2 = fun(x:Int, y:Int)=x+y
    val add3 ={x:Int, y:Int->x+y }
}

