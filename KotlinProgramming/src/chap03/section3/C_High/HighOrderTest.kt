package chap03.section3.C_High
//고차함수 : 람다식을 인자로 사용하기

fun main() {
    //각각 다른 방식으로 람다식을 사용해보자
    val multi1 : (Int, Int)->Int = {x : Int, y : Int -> x*y } //아무것도 생략하지 않은 형태
    val multi2 = {x : Int, y : Int-> x*y}                     //리턴 자료형 생략한 상태
    val multi3 : (Int, Int)->Int = {x, y->x*y}                //람다식 자료형 생략한 상태      
    val res1 = multi1(10, 20)
    val res2 = multi2(10, 20)
    val res3 = multi3(10, 20)
    /*이때 일반함수를 사용한 고차함수는 함수가 오는 자리에 Int 자료형을 그대로 썼지만
      람다식을 사용한 고차함수의 경우 함수가 오는 자리에 (Int, Int)->Int를 사용한다는 차이점이 있다
      개인적으로는 3번방식이 함수 내부의 원형을 알기 쉬워서 좋은듯
      2번으로한 예제보고 괄호로 안감싸놔서 y에만 람다식으로 변수값 준건줄 알았잖아
      그래도 읽을줄은 알아야하니까 원형 기억해놔야할듯
      당연하게도 둘다 생략은 자료형 추론할 수 없어서 불가능 */

    //전부 출력해보자
    println(res1)
    println(res2)
    println(res3)

    //람다식 안에 람다식 넣기 잘쓰는 방식은 아님
    val nestedLambda : () -> () -> Unit = {{println("nested")}}
    //생략해서 이렇게도 가능하다 자료형 추론이 가능하기 때문
    val nestedLambda2 = {{println("nested")}}
}